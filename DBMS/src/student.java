import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class student extends JFrame {
	private JTextField joinevent_field;
	public student(String str)   {
		ResultSet rs;
		try 
		{
			int count=1;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cont=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "ororacle");
			Statement st=cont.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			String sql="select * from student";
			rs=st.executeQuery(sql);
			while(rs.next())
			{
				if(str.equals(""+rs.getInt(1)))
				{
					break;
				}
			}
			setSize(1280,720);
			setVisible(true);
			getContentPane().setLayout(null);
			
			JPanel student_content_panel2 = new JPanel();
			student_content_panel2.setBounds(0, 110, 186, 570);
			student_content_panel2.setBackground(new Color(127, 255, 212));
			getContentPane().add(student_content_panel2);
			student_content_panel2.setLayout(null);
			
			JButton student_profile_button = new JButton("PROFILE");
			student_profile_button.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			student_profile_button.setBounds(0, 0, 186, 60);
			student_content_panel2.add(student_profile_button);
			
			JButton student_courses = new JButton("COURSES");
			student_courses.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			student_courses.setBounds(0, 60, 186, 60);
			student_content_panel2.add(student_courses);
			
			JButton student_events = new JButton("EVENTS");
			student_events.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			student_events.setBounds(0, 120, 186, 60);
			student_content_panel2.add(student_events);
			JButton student_grades = new JButton("MARKS");
			student_grades.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			student_grades.setBounds(0, 180, 186, 60);
			student_content_panel2.add(student_grades);
			
			JButton student_logout = new JButton("LOG OUT");
			student_logout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Login();
					dispose();
				}
			});
			student_logout.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			student_logout.setBounds(0, 525, 202, 45);
			student_content_panel2.add(student_logout);
			
			JButton joinevents_button = new JButton("JOIN EVENTS");
			joinevents_button.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			joinevents_button.setBounds(0, 240, 187, 60);
			student_content_panel2.add(joinevents_button);
			
			JPanel student_heading = new JPanel();
			student_heading.setBackground(Color.YELLOW);
			student_heading.setBounds(0, 0, 1266, 65);
			getContentPane().add(student_heading);
			student_heading.setLayout(null);
			
			JLabel student_label_heading = new JLabel("STUDENT MANAGEMENT SYSTEM");
			student_label_heading.setForeground(Color.RED);
			student_label_heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
			student_label_heading.setBounds(321, 10, 727, 45);
			student_heading.add(student_label_heading);
			
			JPanel student_content_panel1 = new JPanel();
			student_content_panel1.setBackground(new Color(127, 255, 0));
			student_content_panel1.setBounds(0, 65, 186, 45);
			getContentPane().add(student_content_panel1);
			student_content_panel1.setLayout(null);
			
			JLabel student_content = new JLabel("CONTENTS");
			student_content.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
			student_content.setBounds(33, 10, 143, 25);
			student_content_panel1.add(student_content);
			
			JLayeredPane student_layeredPane = new JLayeredPane();
			student_layeredPane.setBounds(186, 65, 1080, 615);
			getContentPane().add(student_layeredPane);
			student_layeredPane.setLayout(new CardLayout(0, 0));
			
			JPanel student_profile_panel = new JPanel();
			student_profile_panel.setBackground(Color.CYAN);
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
			student_profile_name_pane.setEditable(false);
			student_profile_name_pane.setText(rs.getString(2));
			student_profile_name_pane.setBounds(250, 57, 624, 20);
			student_profile_panel.add(student_profile_name_pane);
			
			JTextPane student_Profile_Lname_pane = new JTextPane();
			student_Profile_Lname_pane.setEditable(false);
			student_Profile_Lname_pane.setText(rs.getString(3));
			student_Profile_Lname_pane.setBounds(250, 97, 624, 20);
			student_profile_panel.add(student_Profile_Lname_pane);
			
			JTextPane student_profile_age_pane = new JTextPane();
			student_profile_age_pane.setEditable(false);
			student_profile_age_pane.setText(""+rs.getInt(8));
			student_profile_age_pane.setBounds(250, 137, 624, 20);
			student_profile_panel.add(student_profile_age_pane);
			
			JTextPane student_profile_id_pane = new JTextPane();
			student_profile_id_pane.setEditable(false);
			student_profile_id_pane.setText(""+rs.getInt(1));
			student_profile_id_pane.setBounds(250, 177, 624, 20);
			student_profile_panel.add(student_profile_id_pane);
			
			JTextPane student_profile_dno_pane = new JTextPane();
			student_profile_dno_pane.setEditable(false);
			student_profile_dno_pane.setText(""+rs.getInt(4));
			student_profile_dno_pane.setBounds(250, 228, 624, 20);
			student_profile_panel.add(student_profile_dno_pane);
			
			JTextPane student_profile_street_pane = new JTextPane();
			student_profile_street_pane.setEditable(false);
			student_profile_street_pane.setText(rs.getString(5));
			student_profile_street_pane.setBounds(250, 281, 624, 20);
			student_profile_panel.add(student_profile_street_pane);
			
			JTextPane student_profile_city_pane = new JTextPane();
			student_profile_city_pane.setEditable(false);
			student_profile_city_pane.setText(rs.getString(6));
			student_profile_city_pane.setBounds(250, 335, 624, 20);
			student_profile_panel.add(student_profile_city_pane);
			
			JLabel student_profile_bhavan_label = new JLabel("Bhavan number");
			student_profile_bhavan_label.setFont(new Font("Dialog", Font.PLAIN, 20));
			student_profile_bhavan_label.setBounds(80, 374, 170, 40);
			student_profile_panel.add(student_profile_bhavan_label);
			
			JTextPane student_profile_bhavan_pane = new JTextPane();
			student_profile_bhavan_pane.setEditable(false);
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
			JPanel student_grades_panel = new JPanel();
			student_grades_panel.setBackground(Color.CYAN);
			student_layeredPane.add(student_grades_panel, "name_164213488408800");
			student_grades_panel.setLayout(null);
			
			JTextArea grades_area = new JTextArea();
			grades_area.setBounds(91, 94, 967, 333);
			student_grades_panel.add(grades_area);
			
			rs=st.executeQuery("select * from stu_cour,marks,course where cid=cno and marks.sno="+str+" and marks.sno=stu_cour.sno");
            int i=4;
			while(rs.next())
            {
            	grades_area.append("Course id:"+rs.getString(9)+"     Course name:"+rs.getString(10)+"      Marks"+rs.getInt(i)+"\n");
                i++;
            }
			student_grades.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	student_layeredPane.removeAll();
			    	student_layeredPane.add(student_grades_panel);
			    	student_layeredPane.repaint();
			    	student_layeredPane.revalidate();    
			    }  
			    });
			JPanel student_event_panel = new JPanel();
			student_event_panel.setBackground(Color.CYAN);
			student_layeredPane.add(student_event_panel, "name_164213527612100");
			student_event_panel.setLayout(null);
			JTextArea event_area = new JTextArea();
			event_area.setBounds(42, 126, 1012, 304);
			student_event_panel.add(event_area);
			rs=st.executeQuery("select * from event,stu_event where eno=eid and sno="+str);
			while(rs.next())	
			{
				event_area.append("Name: "+rs.getString(2)+"   Start date:   "+rs.getString(3)+"   End Date:   "+rs.getString(4)+"   Fee:   "+rs.getInt(5)+"\n");
				
			}
			student_events.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	try{
			    		ResultSet rs2;
			    	rs2=st.executeQuery("select * from event,stu_event where eno=eid and sno="+str);
			    	event_area.setText("");
					while(rs2.next())	
					{
						event_area.append("Name: "+rs2.getString(2)+"   Start date:   "+rs2.getString(3)+"   End Date:   "+rs2.getString(4)+"   Fee:   "+rs2.getInt(5)+"\n");
						
					}
			    	student_layeredPane.removeAll();
			    	student_layeredPane.add(student_event_panel);
			    	student_layeredPane.repaint();
			    	student_layeredPane.revalidate(); 
			    	}catch(Exception ex){System.out.println(ex);}
			    }  
			    });
			JPanel student_courses_panel = new JPanel();
			student_courses_panel.setBackground(Color.CYAN);
			student_layeredPane.add(student_courses_panel, "name_164213581621300");
			student_courses_panel.setLayout(null);
			
			JTextArea student_courses_area = new JTextArea();
			student_courses_area.setBounds(27, 11, 1026, 492);
			student_courses_panel.add(student_courses_area);
			
			JPanel student_joinevents_panel = new JPanel();
			student_joinevents_panel.setBackground(Color.CYAN);
			student_layeredPane.add(student_joinevents_panel, "name_326041342741000");
			student_joinevents_panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Enter event id");
			lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 22));
			lblNewLabel.setBounds(70, 68, 170, 40);
			student_joinevents_panel.add(lblNewLabel);
			
			joinevent_field = new JTextField();
			joinevent_field.setBounds(252, 77, 107, 31);
			student_joinevents_panel.add(joinevent_field);
			joinevent_field.setColumns(10);
			
			JButton student_joinevent_button = new JButton("JOIN EVENT");
			student_joinevent_button.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 17));
			student_joinevent_button.setBounds(419, 69, 170, 40);
			student_joinevents_panel.add(student_joinevent_button);
			
			rs=st.executeQuery("select * from stu_cour,course where cid=cno and sno="+str);
			student_courses_area.append("Courses taken\n");
			while(rs.next())	
			{
				if(str.equals(""+rs.getInt(1)))
				{
					student_courses_area.append("Course id:"+rs.getInt(2)+"  Course name:"+rs.getString(4)+"  Time:"+rs.getString(6)+"\n");
				}
			}
			student_courses.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	student_layeredPane.removeAll();
			    	student_layeredPane.add(student_courses_panel);
			    	student_layeredPane.repaint();
			    	student_layeredPane.revalidate();    
			    }  
			    });
			
			student_joinevent_button.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	ResultSet rs1;
			    	try 
			    	{
			    		rs1=st.executeQuery("insert into stu_event values("+str+","+joinevent_field.getText()+")");
			    		joinevent_field.setText("");
			    		try{
				    		ResultSet rs2;
				    	rs2=st.executeQuery("select * from event,stu_event where eno=eid and sno="+str);
				    	event_area.setText("");
						while(rs2.next())	
						{
							event_area.append("Name: "+rs2.getString(2)+"   Start date:   "+rs2.getString(3)+"   End Date:   "+rs2.getString(4)+"   Fee:   "+rs2.getInt(5)+"\n");
							
						}
				    	student_layeredPane.removeAll();
				    	student_layeredPane.add(student_event_panel);
				    	student_layeredPane.repaint();
				    	student_layeredPane.revalidate(); 
				    	}catch(Exception ex){System.out.println(ex);}
					} 
			    	catch (Exception e2) 
			    	{
						System.out.println(e2);
					}	
			    }  
			    });

			joinevents_button.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	student_layeredPane.removeAll();
			    	student_layeredPane.add(student_joinevents_panel);
			    	student_layeredPane.repaint();
			    	student_layeredPane.revalidate();
			    }  
			    });
			
		} 
		catch (Exception e) {
			System.out.print(e);
		}
		
		
	}
}