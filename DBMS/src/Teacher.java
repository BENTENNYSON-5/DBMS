import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;

public class Teacher extends JFrame {

	private JPanel tea_contentPane;
	public Teacher(String str) {
		ResultSet rs;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		tea_contentPane = new JPanel();
		tea_contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(tea_contentPane);
		tea_contentPane.setLayout(null);
		
		JLayeredPane tea_layeredPane = new JLayeredPane();
		tea_layeredPane.setBounds(186, 65, 1080, 615);
		tea_contentPane.add(tea_layeredPane);
		tea_layeredPane.setLayout(new CardLayout(0, 0));
		JPanel tea_profile_panel = new JPanel();
		tea_profile_panel.setBackground(Color.CYAN);
		tea_layeredPane.add(tea_profile_panel, "name_332569207428300");
		tea_profile_panel.setLayout(null);
		try 
		{
			//int id=Integer.parseInt(str);
			int count=1;
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "ororacle");
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,/*ResultSet.CONCUR_READ_ONLY*/ResultSet.CONCUR_UPDATABLE);
			String sql="select * from teacher t,course,depnt d where t.cono=cid and t.depntno=d.depntid";
			rs=st.executeQuery(sql);
			//rs.next();
			while(rs.next())
			{
				//System.out.println(str);
				if(str.equals(""+rs.getInt(1)))
				{
					break;
				}
				
			}
			//M1 maths,bio
			//M2 physics,economics
			//M3 chemistry,commerce
			//M4 english
			//M5 german,french,sanskrit
          
			    String[][] data = new String[45][3];
			    int ii = 0;
			    String sqll;
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","ororacle");
				JPanel tea_coursedetails_panel = new JPanel();
				tea_coursedetails_panel.setBackground(Color.CYAN);
				tea_layeredPane.add(tea_coursedetails_panel, "name_332625872803200");
				tea_coursedetails_panel.setLayout(null);
		    	String stt[] = {"id","name","marks"};//column names
				if(rs.getString(12).equals("Mathematics") || rs.getString(12).equals("Biology")) {
					sqll = "select sid,sname,M1 from student,marks where sid = sno";
					PreparedStatement psss = conn.prepareStatement(sqll);
					ResultSet rsss = psss.executeQuery();
					while(rsss.next()){
						String st1 = String.valueOf(rsss.getInt("sid"));
						String st2=rsss.getString("sname");
						String st3 = String.valueOf(rsss.getInt("M1"));
	                    data[ii][0]= st1;
	                    data[ii][1]= st2;
	                    data[ii][2]= st3;
	                    ii++;
	        			JPanel ppanel = new JPanel();
	        			ppanel.setBounds(69,131,944,441);
	        			tea_coursedetails_panel.add(ppanel);
	    			    JTable table = new JTable(data,stt){
	    			        public boolean isCellEditable(int row, int column) {                
	    			                return false;               
	    			        };
	    			    };
	                    JScrollPane jsp = new JScrollPane(table);
	    				ppanel.add(jsp);
				    }
				}else if(rs.getString(12).equals("Physics") || rs.getString(12).equals("Economics")) {
					sqll = "select sid,sname,M2 from student,marks where sid = sno";
					PreparedStatement psss = conn.prepareStatement(sqll);
					ResultSet rsss = psss.executeQuery();
					while(rsss.next()){
						String st1 = String.valueOf(rsss.getInt("sid"));
						String st2=rsss.getString("sname");
						String st3 = String.valueOf(rsss.getInt("M2"));
	                    data[ii][0]= st1;
	                    data[ii][1]= st2;
	                    data[ii][2]= st3;
	                    ii++;
	        			JPanel ppanel = new JPanel();
	        			ppanel.setBounds(69,131,944,441);
	        			tea_coursedetails_panel.add(ppanel);
	    			    JTable table = new JTable(data,stt){
	    			        public boolean isCellEditable(int row, int column) {                
	    			                return false;               
	    			        };
	    			    };
	                    JScrollPane jsp = new JScrollPane(table);
	    				ppanel.add(jsp);
				    }			
   				}else if(rs.getString(12).equals("Chemistry") || rs.getString(12).equals("Commerce")) {
					sqll = "select sid,sname,M3 from student,marks where sid = sno";
					PreparedStatement psss = conn.prepareStatement(sqll);
					ResultSet rsss = psss.executeQuery();
					while(rsss.next()){
						String st1 = String.valueOf(rsss.getInt("sid"));
						String st2=rsss.getString("sname");
						String st3 = String.valueOf(rsss.getInt("M3"));
	                    data[ii][0]= st1;
	                    data[ii][1]= st2;
	                    data[ii][2]= st3;
	                    ii++;
	        			JPanel ppanel = new JPanel();
	        			ppanel.setBounds(69,131,944,441);
	        			tea_coursedetails_panel.add(ppanel);
	    			    JTable table = new JTable(data,stt){
	    			        public boolean isCellEditable(int row, int column) {                
	    			                return false;               
	    			        };
	    			    };
	                    JScrollPane jsp = new JScrollPane(table);
	    				ppanel.add(jsp);
				    }
				}else if(rs.getString(12).equals("English")) {
					sqll = "select sid,sname,M4 from student,marks where sid = sno";
					PreparedStatement psss = conn.prepareStatement(sqll);
					ResultSet rsss = psss.executeQuery();
					while(rsss.next()){
						String st1 = String.valueOf(rsss.getInt("sid"));
						String st2=rsss.getString("sname");
						String st3 = String.valueOf(rsss.getInt("M4"));
	                    data[ii][0]= st1;
	                    data[ii][1]= st2;
	                    data[ii][2]= st3;
	                    ii++;
	        			JPanel ppanel = new JPanel();
	        			ppanel.setBounds(69,131,944,441);
	        			tea_coursedetails_panel.add(ppanel);
	    			    JTable table = new JTable(data,stt){
	    			        public boolean isCellEditable(int row, int column) {                
	    			                return false;               
	    			        };
	    			    };
	                    JScrollPane jsp = new JScrollPane(table);
	    				ppanel.add(jsp);
				    }
				}else {
					sqll = "select sid,sname,M5 from student,marks where sid = sno";
					PreparedStatement psss = conn.prepareStatement(sqll);
					ResultSet rsss = psss.executeQuery();
					while(rsss.next()){
						String st1 = String.valueOf(rsss.getInt("sid"));
						String st2=rsss.getString("sname");
						String st3 = String.valueOf(rsss.getInt("M5"));
	                    data[ii][0]= st1;
	                    data[ii][1]= st2;
	                    data[ii][2]= st3;
	                    ii++;
	        			JPanel ppanel = new JPanel();
	        			ppanel.setBounds(69,131,944,441);
	        			tea_coursedetails_panel.add(ppanel);
	    			    JTable table = new JTable(data,stt){
	    			        public boolean isCellEditable(int row, int column) {                
	    			                return false;               
	    			        };
	    			    };
	                    JScrollPane jsp = new JScrollPane(table);
	    				ppanel.add(jsp);
				    }
				}
				conn.close();
			
			JPanel tea_headingPanel = new JPanel();
			tea_headingPanel.setBackground(Color.YELLOW);
			tea_headingPanel.setBounds(0, 0, 1266, 65);
			tea_contentPane.add(tea_headingPanel);
			tea_headingPanel.setLayout(null);
			
			JLabel tea_heading = new JLabel("Teacher Management System ");
			tea_heading.setBounds(335, 10, 614, 46);
			tea_heading.setForeground(Color.RED);
			tea_heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
			tea_headingPanel.add(tea_heading);
			
			JPanel tea_contentPanel2 = new JPanel();
			tea_contentPanel2.setBackground(new Color(127, 255, 212));
			tea_contentPanel2.setBounds(0, 110, 186, 570);
			tea_contentPane.add(tea_contentPanel2);
			tea_contentPanel2.setLayout(null);
			
			JButton tea_profile_button = new JButton("Profile");
			tea_profile_button.setFont(new Font("Tahoma", Font.PLAIN, 30));
			tea_profile_button.setForeground(new Color(0, 0, 0));
			tea_profile_button.setBounds(0, 0, 186, 60);
			tea_contentPanel2.add(tea_profile_button);
			tea_profile_button.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			        tea_layeredPane.removeAll();
			        tea_layeredPane.add(tea_profile_panel);
			        tea_layeredPane.repaint();
			        tea_layeredPane.revalidate();    
			    }  
			    });
			
			JButton tea_CourseDetails_button = new JButton("Course Details");
			tea_CourseDetails_button.setFont(new Font("Tahoma", Font.PLAIN, 24));
			tea_CourseDetails_button.setBounds(0, 60, 186, 60);
			tea_contentPanel2.add(tea_CourseDetails_button);
			tea_CourseDetails_button.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			        tea_layeredPane.removeAll();
			        tea_layeredPane.add(tea_coursedetails_panel);
			        tea_layeredPane.repaint();
			        tea_layeredPane.revalidate();    
			    }  
			    });
			
			JButton tea_LogOut = new JButton("LOG OUT");
			tea_LogOut.setFont(new Font("Tahoma", Font.PLAIN, 24));
			tea_LogOut.setBounds(0, 510, 186, 60);
			tea_contentPanel2.add(tea_LogOut);
			tea_LogOut.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					new Login();
					dispose();
				}
			});
			
			JPanel tea_contentPanel1 = new JPanel();
			tea_contentPanel1.setBackground(new Color(127, 255, 0));
			tea_contentPanel1.setBounds(0, 65, 186, 45);
			tea_contentPane.add(tea_contentPanel1);
			tea_contentPanel1.setLayout(null);
			
			JLabel tea_contents = new JLabel("Contents");
			tea_contents.setBounds(34, 10, 113, 25);
			tea_contents.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			tea_contentPanel1.add(tea_contents);
			

			
			
			
			JLabel Profile_name_label = new JLabel("First Name");
			Profile_name_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			Profile_name_label.setBounds(80, 50, 170, 40);
			tea_profile_panel.add(Profile_name_label);
			
			JLabel Profile_Lname_label = new JLabel("Last Name");
			Profile_Lname_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			Profile_Lname_label.setBounds(80, 90, 170, 40);
			tea_profile_panel.add(Profile_Lname_label);
			
			JLabel profile_age_label = new JLabel("Age");
			profile_age_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			profile_age_label.setBounds(80, 130, 170, 40);
			tea_profile_panel.add(profile_age_label);
			
			JLabel profile_id_label = new JLabel("I.D");
			profile_id_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			profile_id_label.setBounds(80, 170, 170, 40);
			tea_profile_panel.add(profile_id_label);
			
			JLabel profile_course_label = new JLabel("Course");
			profile_course_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			profile_course_label.setBounds(80, 210, 170, 40);
			tea_profile_panel.add(profile_course_label);
			
			JLabel profile_department_label = new JLabel("Department");
			profile_department_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			profile_department_label.setBounds(80, 250, 170, 40);
			tea_profile_panel.add(profile_department_label);
			
			JLabel profile_salary_label = new JLabel("Salary");
			profile_salary_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			profile_salary_label.setBounds(80, 290, 170, 40);
			tea_profile_panel.add(profile_salary_label);
			
			JLabel profile_dno_label = new JLabel("Door No.");
			profile_dno_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			profile_dno_label.setBounds(80, 330, 170, 40);
			tea_profile_panel.add(profile_dno_label);
			
			JLabel profile_street_label = new JLabel("Street");
			profile_street_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			profile_street_label.setBounds(80, 370, 170, 40);
			tea_profile_panel.add(profile_street_label);
			
			JLabel profile_city_label = new JLabel("City");
			profile_city_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			profile_city_label.setBounds(80, 410, 170, 40);
			tea_profile_panel.add(profile_city_label);
			

			JLabel profile_course_time_label = new JLabel("Course Timings");
			profile_course_time_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			profile_course_time_label.setBounds(80, 450, 170, 40);
			tea_profile_panel.add(profile_course_time_label);
			
			JTextPane profile_name_pane = new JTextPane();
			profile_name_pane.setText(rs.getString(2));
			profile_name_pane.setBounds(250, 57, 624, 20);
			tea_profile_panel.add(profile_name_pane);
			profile_name_pane.setEditable(false);
			
			JTextPane Profile_Lname_pane = new JTextPane();
			Profile_Lname_pane.setText(rs.getString(3));
			Profile_Lname_pane.setBounds(250, 97, 624, 20);
			tea_profile_panel.add(Profile_Lname_pane);
			Profile_Lname_pane.setEditable(false);
			
			JTextPane profile_age_pane = new JTextPane();
			profile_age_pane.setText(""+rs.getInt(7));
			profile_age_pane.setBounds(250, 137, 624, 20);
			tea_profile_panel.add(profile_age_pane);
			profile_age_pane.setEditable(false);
			
			JTextPane profile_id_pane = new JTextPane();
			profile_id_pane.setText(""+rs.getInt(1));
			profile_id_pane.setBounds(250, 177, 624, 20);
			tea_profile_panel.add(profile_id_pane);
			profile_id_pane.setEditable(false);
			
			JTextPane profile_course_pane = new JTextPane();
			profile_course_pane.setText(rs.getString(12));
			profile_course_pane.setBounds(250, 217, 624, 20);
			tea_profile_panel.add(profile_course_pane);
			profile_course_pane.setEditable(false);
			
			JTextPane profile_department_pane = new JTextPane();
			profile_department_pane.setText(rs.getString(16));
			profile_department_pane.setBounds(250, 257, 624, 20);
			tea_profile_panel.add(profile_department_pane);
			profile_department_pane.setEditable(false);
			
			JTextPane profile_salary_pane = new JTextPane();
			profile_salary_pane.setText(""+rs.getInt(9));
			profile_salary_pane.setBounds(250, 297, 624, 20);
			tea_profile_panel.add(profile_salary_pane);
			profile_salary_pane.setEditable(false);
			
			JTextPane profile_dno_pane = new JTextPane();
			profile_dno_pane.setText(""+rs.getInt(4));
			profile_dno_pane.setBounds(250, 337, 624, 20);
			tea_profile_panel.add(profile_dno_pane);
			profile_dno_pane.setEditable(false);
			
			JTextPane profile_street_pane = new JTextPane();
			profile_street_pane.setText(rs.getString(5));
			profile_street_pane.setBounds(250, 377, 624, 20);
			tea_profile_panel.add(profile_street_pane);
			profile_street_pane.setEditable(false);
			
			JTextPane profile_city_pane = new JTextPane();
			profile_city_pane.setText(rs.getString(6));
			profile_city_pane.setBounds(250, 417, 624, 20);
			tea_profile_panel.add(profile_city_pane);
			profile_city_pane.setEditable(false);
			
			
			JTextPane profile_course_time_pane = new JTextPane();
			profile_course_time_pane.setText(rs.getString(14));
			profile_course_time_pane.setEditable(false);
			profile_course_time_pane.setBounds(250, 457, 624, 20);
			tea_profile_panel.add(profile_course_time_pane);
			
			JLabel coursedetails_coursename_label = new JLabel("Course");
			coursedetails_coursename_label.setBounds(69, 26, 170, 40);
			coursedetails_coursename_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			tea_coursedetails_panel.add(coursedetails_coursename_label);
			
			JTextPane coursedetails_coursename_pane = new JTextPane();
			coursedetails_coursename_pane.setBounds(282, 34, 624, 20);
			coursedetails_coursename_pane.setText(rs.getString(12));
			tea_coursedetails_panel.add(coursedetails_coursename_pane);
			coursedetails_coursename_pane.setEditable(false);
			
			JLabel coursedetails_studentsenrolled_label = new JLabel("Students Enrolled:");
			coursedetails_studentsenrolled_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			coursedetails_studentsenrolled_label.setBounds(69, 65, 170, 40);
			tea_coursedetails_panel.add(coursedetails_studentsenrolled_label);
			
			
			
			
			con.close();
			
		} 

		catch (Exception e) {
			System.out.print(e);
		}
		
		
	}
}
