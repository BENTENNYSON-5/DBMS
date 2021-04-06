import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class Teacher extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher frame = new Teacher();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Teacher() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel tea_headingPanel = new JPanel();
		tea_headingPanel.setBackground(Color.YELLOW);
		tea_headingPanel.setBounds(0, 0, 1266, 65);
		contentPane.add(tea_headingPanel);
		tea_headingPanel.setLayout(null);
		
		JLabel tea_heading = new JLabel("Random College Mangement Sysytem ");
		tea_heading.setBounds(255, 10, 743, 46);
		tea_heading.setForeground(Color.RED);
		tea_heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		tea_headingPanel.add(tea_heading);
		
		JPanel tea_contentPanel2 = new JPanel();
		tea_contentPanel2.setBackground(new Color(127, 255, 212));
		tea_contentPanel2.setBounds(0, 110, 186, 570);
		contentPane.add(tea_contentPanel2);
		tea_contentPanel2.setLayout(null);
		
		JButton tea_profile = new JButton("Profile");
		tea_profile.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tea_profile.setForeground(new Color(0, 0, 0));
		tea_profile.setBounds(0, 0, 186, 60);
		tea_contentPanel2.add(tea_profile);
		
		JButton tea_TimeTable = new JButton("Time Table");
		tea_TimeTable.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tea_TimeTable.setBounds(0, 60, 186, 60);
		tea_contentPanel2.add(tea_TimeTable);
		
		JButton tea_CourseDetails = new JButton("Course Details");
		tea_CourseDetails.setFont(new Font("Tahoma", Font.PLAIN, 24));
		tea_CourseDetails.setBounds(0, 120, 186, 60);
		tea_contentPanel2.add(tea_CourseDetails);
		
		JButton tea_LogOut = new JButton("LOG OUT");
		tea_LogOut.setFont(new Font("Tahoma", Font.PLAIN, 24));
		tea_LogOut.setBounds(0, 510, 186, 60);
		tea_contentPanel2.add(tea_LogOut);
		
		JPanel tea_contentPanel1 = new JPanel();
		tea_contentPanel1.setBackground(new Color(127, 255, 0));
		tea_contentPanel1.setBounds(0, 65, 186, 45);
		contentPane.add(tea_contentPanel1);
		tea_contentPanel1.setLayout(null);
		
		JLabel tea_contents = new JLabel("Contents");
		tea_contents.setBounds(34, 10, 113, 25);
		tea_contents.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
		tea_contentPanel1.add(tea_contents);
		
		JPanel tea_MainPanel = new JPanel();
		tea_MainPanel.setBackground(new Color(0, 255, 255));
		tea_MainPanel.setBounds(186, 65, 1080, 615);
		contentPane.add(tea_MainPanel);
		tea_MainPanel.setLayout(null);
		
		JLabel Profile_name_label = new JLabel("First Name");
		Profile_name_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		Profile_name_label.setBounds(80, 50, 170, 40);
		tea_MainPanel.add(Profile_name_label);
		
		JLabel Profile_Lname_label = new JLabel("Last Name");
		Profile_Lname_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		Profile_Lname_label.setBounds(80, 90, 170, 40);
		tea_MainPanel.add(Profile_Lname_label);
		
		JLabel profile_age_label = new JLabel("Age");
		profile_age_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_age_label.setBounds(80, 130, 170, 40);
		tea_MainPanel.add(profile_age_label);
		
		JLabel profile_id_label = new JLabel("I.D");
		profile_id_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_id_label.setBounds(80, 170, 170, 40);
		tea_MainPanel.add(profile_id_label);
		
		JLabel profile_course_label = new JLabel("Course");
		profile_course_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_course_label.setBounds(80, 210, 170, 40);
		tea_MainPanel.add(profile_course_label);
		
		JLabel profile_department_label = new JLabel("Department");
		profile_department_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_department_label.setBounds(80, 250, 170, 40);
		tea_MainPanel.add(profile_department_label);
		
		JLabel profile_salary_label = new JLabel("Salary");
		profile_salary_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_salary_label.setBounds(80, 290, 170, 40);
		tea_MainPanel.add(profile_salary_label);
		
		JLabel profile_dno_label = new JLabel("Door No.");
		profile_dno_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_dno_label.setBounds(80, 330, 170, 40);
		tea_MainPanel.add(profile_dno_label);
		
		JLabel profile_street_label = new JLabel("Street");
		profile_street_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_street_label.setBounds(80, 370, 170, 40);
		tea_MainPanel.add(profile_street_label);
		
		JLabel profile_city_label = new JLabel("City");
		profile_city_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_city_label.setBounds(80, 410, 170, 40);
		tea_MainPanel.add(profile_city_label);
		
		JTextPane profile_name_pane = new JTextPane();
		profile_name_pane.setText("TNAME");
		profile_name_pane.setBounds(250, 57, 624, 20);
		tea_MainPanel.add(profile_name_pane);
		
		JTextPane Profile_Lname_pane = new JTextPane();
		Profile_Lname_pane.setText("TLNAME");
		Profile_Lname_pane.setBounds(250, 97, 624, 20);
		tea_MainPanel.add(Profile_Lname_pane);
		
		JTextPane profile_age_pane = new JTextPane();
		profile_age_pane.setText("TAGE");
		profile_age_pane.setBounds(250, 137, 624, 20);
		tea_MainPanel.add(profile_age_pane);
		
		JTextPane profile_id_pane = new JTextPane();
		profile_id_pane.setText("TID");
		profile_id_pane.setBounds(250, 177, 624, 20);
		tea_MainPanel.add(profile_id_pane);
		
		JTextPane profile_course_pane = new JTextPane();
		profile_course_pane.setText("Course name");
		profile_course_pane.setBounds(250, 217, 624, 20);
		tea_MainPanel.add(profile_course_pane);
		
		JTextPane profile_department_pane = new JTextPane();
		profile_department_pane.setText("DEpartment Name");
		profile_department_pane.setBounds(250, 257, 624, 20);
		tea_MainPanel.add(profile_department_pane);
		
		JTextPane profile_salary_pane = new JTextPane();
		profile_salary_pane.setText("TSAL");
		profile_salary_pane.setBounds(250, 297, 624, 20);
		tea_MainPanel.add(profile_salary_pane);
		
		JTextPane profile_dno_pane = new JTextPane();
		profile_dno_pane.setText("TDNO");
		profile_dno_pane.setBounds(250, 337, 624, 20);
		tea_MainPanel.add(profile_dno_pane);
		
		JTextPane profile_street_pane = new JTextPane();
		profile_street_pane.setText("TSTR");
		profile_street_pane.setBounds(250, 377, 624, 20);
		tea_MainPanel.add(profile_street_pane);
		
		JTextPane profile_city_pane = new JTextPane();
		profile_city_pane.setText("TCITY");
		profile_city_pane.setBounds(250, 417, 624, 20);
		tea_MainPanel.add(profile_city_pane);
		
		
		//on clicking profile
		
	}
}
