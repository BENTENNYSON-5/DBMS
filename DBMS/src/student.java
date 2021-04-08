import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class student extends JFrame {
	public student() {
		setSize(1280,720);
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
		
		JLabel student_label_headingf = new JLabel("Student's Management System");
		student_label_headingf.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
		student_label_headingf.setBounds(335, 10, 614, 46);
		student_heading.add(student_label_headingf);
		
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
		student_layeredPane.setLayout(null);
		
		JPanel student_profile_panel = new JPanel();
		student_profile_panel.setBounds(0, 0, 1080, 615);
		student_layeredPane.add(student_profile_panel);
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
		
		JLabel student_profile_id_label = new JLabel("I.D");
		student_profile_id_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		student_profile_id_label.setBounds(80, 170, 170, 40);
		student_profile_panel.add(student_profile_id_label);
		
		JLabel student_profile_course_label = new JLabel("Course");
		student_profile_course_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		student_profile_course_label.setBounds(80, 210, 170, 40);
		student_profile_panel.add(student_profile_course_label);
		
		JLabel student_profile_department_label = new JLabel("Department");
		student_profile_department_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		student_profile_department_label.setBounds(80, 250, 170, 40);
		student_profile_panel.add(student_profile_department_label);
		
		JLabel student_profile_salary_label = new JLabel("Salary");
		student_profile_salary_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		student_profile_salary_label.setBounds(80, 290, 170, 40);
		student_profile_panel.add(student_profile_salary_label);
		
		JLabel student_profile_dno_label = new JLabel("Door No.");
		student_profile_dno_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		student_profile_dno_label.setBounds(80, 330, 170, 40);
		student_profile_panel.add(student_profile_dno_label);
		
		JLabel student_profile_street_label = new JLabel("Street");
		student_profile_street_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		student_profile_street_label.setBounds(80, 370, 170, 40);
		student_profile_panel.add(student_profile_street_label);
		
		JLabel student_profile_city_label = new JLabel("City");
		student_profile_city_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		student_profile_city_label.setBounds(80, 410, 170, 40);
		student_profile_panel.add(student_profile_city_label);
		
		JTextPane student_profile_name_pane = new JTextPane();
		student_profile_name_pane.setText("TNAME");
		student_profile_name_pane.setBounds(250, 57, 624, 20);
		student_profile_panel.add(student_profile_name_pane);
		student_profile_name_pane.setEditable(false);
		
		JTextPane student_Profile_Lname_pane = new JTextPane();
		student_Profile_Lname_pane.setText("TLNAME");
		student_Profile_Lname_pane.setBounds(250, 97, 624, 20);
		student_profile_panel.add(student_Profile_Lname_pane);
		student_Profile_Lname_pane.setEditable(false);
		
		JTextPane student_profile_age_pane = new JTextPane();
		student_profile_age_pane.setText("TAGE");
		student_profile_age_pane.setBounds(250, 137, 624, 20);
		student_profile_panel.add(student_profile_age_pane);
		student_profile_age_pane.setEditable(false);
		
		JTextPane student_profile_id_pane = new JTextPane();
		student_profile_id_pane.setText("TID");
		student_profile_id_pane.setBounds(250, 177, 624, 20);
		student_profile_panel.add(student_profile_id_pane);
		student_profile_id_pane.setEditable(false);
		
		JTextPane student_profile_course_pane = new JTextPane();
		student_profile_course_pane.setText("Course name");
		student_profile_course_pane.setBounds(250, 217, 624, 20);
		student_profile_panel.add(		student_profile_course_pane);
		student_profile_course_pane.setEditable(false);
		
		JTextPane student_profile_department_pane = new JTextPane();
		student_profile_department_pane.setText("DEpartment Name");
		student_profile_department_pane.setBounds(250, 257, 624, 20);
		student_profile_panel.add(student_profile_department_pane);
		student_profile_department_pane.setEditable(false);
		
		JTextPane student_profile_salary_pane = new JTextPane();
		student_profile_salary_pane.setText("TSAL");
		student_profile_salary_pane.setBounds(250, 297, 624, 20);
		student_profile_panel.add(student_profile_salary_pane);
		student_profile_salary_pane.setEditable(false);
		
		JTextPane student_profile_dno_pane = new JTextPane();
		student_profile_dno_pane.setText("TDNO");
		student_profile_dno_pane.setBounds(250, 337, 624, 20);
		student_profile_panel.add(student_profile_dno_pane);
		student_profile_dno_pane.setEditable(false);
		
		JTextPane student_profile_street_pane = new JTextPane();
		student_profile_street_pane.setText("TSTR");
		student_profile_street_pane.setBounds(250, 377, 624, 20);
		student_profile_panel.add(student_profile_street_pane);
		student_profile_street_pane.setEditable(false);
		
		JTextPane student_profile_city_pane = new JTextPane();
		student_profile_city_pane.setText("TCITY");
		student_profile_city_pane.setBounds(250, 417, 624, 20);
		student_profile_panel.add(student_profile_city_pane);
		student_profile_city_pane.setEditable(false);

		student_profile_button.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	student_layeredPane.removeAll();
		    	student_layeredPane.add(student_profile_panel);
		    	student_layeredPane.repaint();
		    	student_layeredPane.revalidate();    
		    }  
		    });
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 1080, 615);
		student_layeredPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 1080, 615);
		student_layeredPane.add(panel_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1080, 615);
		student_layeredPane.add(panel);
		
		
	}
}
