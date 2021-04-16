import javax.swing.*;
import java.awt.*;



import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.sql.*;
public class student extends JFrame {
	public student(String str)   {
		ResultSet rs;
		try 
		{
			//int id=Integer.parseInt(str);
			int count=1;
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "\"Chintu2@\"");
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql="select * from student";
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
			//con.close();
			setSize(1280,720);
			setVisible(true);
			getContentPane().setLayout(null);
			
			JPanel student_content_panel2 = new JPanel();
			student_content_panel2.setBounds(0, 110, 186, 570);
			getContentPane().add(student_content_panel2);
			student_content_panel2.setLayout(null);
			
			JButton student_profile_button = new JButton("PROFILE");
			student_profile_button.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			student_profile_button.setBounds(0, 0, 186, 45);
			student_content_panel2.add(student_profile_button);
			
			JButton student_timetable = new JButton("TIME TABLE");
			student_timetable.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			student_timetable.setBounds(0, 45, 186, 45);
			student_content_panel2.add(student_timetable);
			
			JButton student_events = new JButton("EVENTS");
			student_events.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			student_events.setBounds(0, 90, 186, 45);
			student_content_panel2.add(student_events);
			
			
			JButton student_grades = new JButton("GRADES");
			student_grades.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			student_grades.setBounds(0, 135, 186, 45);
			student_content_panel2.add(student_grades);
			
			JButton student_logout = new JButton("LOG OUT");
			student_logout.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			student_logout.setBounds(0, 525, 186, 45);
			student_content_panel2.add(student_logout);
			
			JPanel student_heading = new JPanel();
			student_heading.setBounds(0, 0, 1266, 65);
			getContentPane().add(student_heading);
			student_heading.setLayout(null);
			
			JLabel student_label_heading = new JLabel("STUDENT MANAGEMENT SYSTEM");
			student_label_heading.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			student_label_heading.setBounds(335, 10, 614, 46);
			student_heading.add(student_label_heading);
			
			JPanel student_content_panel1 = new JPanel();
			student_content_panel1.setBounds(0, 65, 186, 45);
			getContentPane().add(student_content_panel1);
			student_content_panel1.setLayout(null);
			
			JLabel student_content = new JLabel("CONTENTS");
			student_content.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			student_content.setBounds(22, 10, 143, 25);
			student_content_panel1.add(student_content);
			
			JLayeredPane student_layeredPane = new JLayeredPane();
			student_layeredPane.setBounds(186, 65, 1080, 615);
			getContentPane().add(student_layeredPane);
			student_layeredPane.setLayout(new CardLayout(0, 0));
			
			JPanel student_profile_panel = new JPanel();
			student_layeredPane.add(student_profile_panel, "name_164213450574300");
			student_profile_panel.setLayout(null);
			
			JLabel student_Profile_name_label = new JLabel("First Name");
			student_Profile_name_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			student_Profile_name_label.setBounds(80, 50, 170, 40);
			student_profile_panel.add(student_Profile_name_label);
			
			JLabel student_Profile_Lname_label = new JLabel("Last Name");
			student_Profile_Lname_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			student_Profile_Lname_label.setBounds(80, 90, 170, 40);
			student_profile_panel.add(student_Profile_Lname_label);
			
			JLabel student_profile_age_label = new JLabel("Age");
			student_profile_age_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			student_profile_age_label.setBounds(80, 130, 170, 40);
			student_profile_panel.add(student_profile_age_label);
			
			JLabel student_profile_id_label = new JLabel("ID");
			student_profile_id_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			student_profile_id_label.setBounds(80, 170, 170, 40);
			student_profile_panel.add(student_profile_id_label);
			
			JLabel student_profile_dno_label = new JLabel("Door No.");
			student_profile_dno_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			student_profile_dno_label.setBounds(80, 221, 170, 40);
			student_profile_panel.add(student_profile_dno_label);
			
			JLabel student_profile_street_label = new JLabel("Street");
			student_profile_street_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			student_profile_street_label.setBounds(80, 272, 170, 40);
			student_profile_panel.add(student_profile_street_label);
			
			JLabel student_profile_city_label = new JLabel("City");
			student_profile_city_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
			student_profile_city_label.setBounds(80, 323, 170, 40);
			student_profile_panel.add(student_profile_city_label);
			
			JTextPane student_profile_name_pane = new JTextPane();
			student_profile_name_pane.setText(rs.getString(2));
			student_profile_name_pane.setBounds(250, 57, 624, 20);
			student_profile_panel.add(student_profile_name_pane);
			
			JTextPane student_Profile_Lname_pane = new JTextPane();
			student_Profile_Lname_pane.setText(rs.getString(3));
			student_Profile_Lname_pane.setBounds(250, 97, 624, 20);
			student_profile_panel.add(student_Profile_Lname_pane);
			
			JTextPane student_profile_age_pane = new JTextPane();
			student_profile_age_pane.setText(""+rs.getInt(8));
			student_profile_age_pane.setBounds(250, 137, 624, 20);
			student_profile_panel.add(student_profile_age_pane);
			
			JTextPane student_profile_id_pane = new JTextPane();
			student_profile_id_pane.setText(""+rs.getInt(1));
			student_profile_id_pane.setBounds(250, 177, 624, 20);
			student_profile_panel.add(student_profile_id_pane);
			
			JTextPane student_profile_dno_pane = new JTextPane();
			student_profile_dno_pane.setText(""+rs.getInt(4));
			student_profile_dno_pane.setBounds(250, 228, 624, 20);
			student_profile_panel.add(student_profile_dno_pane);
			
			JTextPane student_profile_street_pane = new JTextPane();
			student_profile_street_pane.setText(rs.getString(5));
			student_profile_street_pane.setBounds(250, 281, 624, 20);
			student_profile_panel.add(student_profile_street_pane);
			
			JTextPane student_profile_city_pane = new JTextPane();
			student_profile_city_pane.setText(rs.getString(6));
			student_profile_city_pane.setBounds(250, 335, 624, 20);
			student_profile_panel.add(student_profile_city_pane);
			
			JLabel student_profile_bhavan_label = new JLabel("Bhavan number");
			student_profile_bhavan_label.setFont(new Font("Dialog", Font.PLAIN, 20));
			student_profile_bhavan_label.setBounds(80, 374, 170, 40);
			student_profile_panel.add(student_profile_bhavan_label);
			
			JTextPane student_profile_bhavan_pane = new JTextPane();
			student_profile_bhavan_pane.setText(""+rs.getInt(7));
			student_profile_bhavan_pane.setBounds(250, 384, 624, 20);
			student_profile_panel.add(student_profile_bhavan_pane);

			student_profile_button.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	student_layeredPane.removeAll();
			    	student_layeredPane.add(student_profile_panel);
			    	student_layeredPane.repaint();
			    	student_layeredPane.revalidate();    
			    }  
			    });
			
			JPanel panel_2 = new JPanel();
			student_layeredPane.add(panel_2, "name_164213488408800");
			
			
			
			
			
			
			
			
			
			
			
			
			JPanel student_event_panel = new JPanel();
			student_layeredPane.add(student_event_panel, "name_164213527612100");
			student_event_panel.setLayout(null);
			
			JTextArea event_area = new JTextArea();
			event_area.setBounds(10, 125, 1044, 305);
			student_event_panel.add(event_area);
			rs=st.executeQuery("select * from event");
			for(int i=0;i<5;i++)
			{
				event_area.setText("\n");
			}
			while(rs.next())
			{
				event_area.setText("Name: "+rs.getString(2)+"   Start date:   "+rs.getString(3)+"   End Date:   "+rs.getString(4)+"   Fee:   "+rs.getInt(5)+" "+"\n");
			}
			student_events.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	student_layeredPane.removeAll();
			    	student_layeredPane.add(student_event_panel);
			    	student_layeredPane.repaint();
			    	student_layeredPane.revalidate();    
			    }  
			    });
			
			
			
			
			
			
			
			
			
			JPanel panel = new JPanel();
			student_layeredPane.add(panel, "name_164213581621300");
			con.close();
			
		} 

		catch (Exception e) {
			System.out.print(e);
		}
		
		
	}
}
