import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;

public class Teacher extends JFrame {

	private JPanel contentPane;
	private JTable timetable_table;
	private JTable table;

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(186, 65, 1080, 615);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel tea_panel_1 = new JPanel();
		tea_panel_1.setBackground(Color.CYAN);
		layeredPane.add(tea_panel_1, "name_332569207428300");
		
		JPanel tea_panel_2 = new JPanel();
		tea_panel_2.setBackground(Color.GREEN);
		layeredPane.add(tea_panel_2, "name_332525239451000");
		tea_panel_2.setLayout(null);
		
		JPanel tea_panel_3 = new JPanel();
		tea_panel_3.setBackground(Color.ORANGE);
		layeredPane.add(tea_panel_3, "name_332625872803200");
		tea_panel_3.setLayout(null);
		tea_panel_1.setLayout(null);
		
		JPanel tea_headingPanel = new JPanel();
		tea_headingPanel.setBackground(Color.YELLOW);
		tea_headingPanel.setBounds(0, 0, 1266, 65);
		contentPane.add(tea_headingPanel);
		tea_headingPanel.setLayout(null);
		
		JLabel tea_heading = new JLabel("Teacher's Management System ");
		tea_heading.setBounds(335, 10, 614, 46);
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
		tea_profile.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		        layeredPane.removeAll();
		        layeredPane.add(tea_panel_1);
		        layeredPane.repaint();
		        layeredPane.revalidate();    
		    }  
		    });
		
		JButton tea_TimeTable = new JButton("Time Table");
		tea_TimeTable.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tea_TimeTable.setBounds(0, 60, 186, 60);
		tea_contentPanel2.add(tea_TimeTable);
		tea_TimeTable.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		        layeredPane.removeAll();
		        layeredPane.add(tea_panel_2);
		        layeredPane.repaint();
		        layeredPane.revalidate();    
		    }  
		    });
		
		JButton tea_CourseDetails = new JButton("Course Details");
		tea_CourseDetails.setFont(new Font("Tahoma", Font.PLAIN, 24));
		tea_CourseDetails.setBounds(0, 120, 186, 60);
		tea_contentPanel2.add(tea_CourseDetails);
		tea_CourseDetails.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		        layeredPane.removeAll();
		        layeredPane.add(tea_panel_3);
		        layeredPane.repaint();
		        layeredPane.revalidate();    
		    }  
		    });
		
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
		

		
		
		
		JLabel Profile_name_label = new JLabel("First Name");
		Profile_name_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		Profile_name_label.setBounds(80, 50, 170, 40);
		tea_panel_1.add(Profile_name_label);
		
		JLabel Profile_Lname_label = new JLabel("Last Name");
		Profile_Lname_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		Profile_Lname_label.setBounds(80, 90, 170, 40);
		tea_panel_1.add(Profile_Lname_label);
		
		JLabel profile_age_label = new JLabel("Age");
		profile_age_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_age_label.setBounds(80, 130, 170, 40);
		tea_panel_1.add(profile_age_label);
		
		JLabel profile_id_label = new JLabel("I.D");
		profile_id_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_id_label.setBounds(80, 170, 170, 40);
		tea_panel_1.add(profile_id_label);
		
		JLabel profile_course_label = new JLabel("Course");
		profile_course_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_course_label.setBounds(80, 210, 170, 40);
		tea_panel_1.add(profile_course_label);
		
		JLabel profile_department_label = new JLabel("Department");
		profile_department_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_department_label.setBounds(80, 250, 170, 40);
		tea_panel_1.add(profile_department_label);
		
		JLabel profile_salary_label = new JLabel("Salary");
		profile_salary_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_salary_label.setBounds(80, 290, 170, 40);
		tea_panel_1.add(profile_salary_label);
		
		JLabel profile_dno_label = new JLabel("Door No.");
		profile_dno_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_dno_label.setBounds(80, 330, 170, 40);
		tea_panel_1.add(profile_dno_label);
		
		JLabel profile_street_label = new JLabel("Street");
		profile_street_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_street_label.setBounds(80, 370, 170, 40);
		tea_panel_1.add(profile_street_label);
		
		JLabel profile_city_label = new JLabel("City");
		profile_city_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		profile_city_label.setBounds(80, 410, 170, 40);
		tea_panel_1.add(profile_city_label);
		
		JTextPane profile_name_pane = new JTextPane();
		profile_name_pane.setText("TNAME");
		profile_name_pane.setBounds(250, 57, 624, 20);
		tea_panel_1.add(profile_name_pane);
		profile_name_pane.setEditable(false);
		
		JTextPane Profile_Lname_pane = new JTextPane();
		Profile_Lname_pane.setText("TLNAME");
		Profile_Lname_pane.setBounds(250, 97, 624, 20);
		tea_panel_1.add(Profile_Lname_pane);
		Profile_Lname_pane.setEditable(false);
		
		JTextPane profile_age_pane = new JTextPane();
		profile_age_pane.setText("TAGE");
		profile_age_pane.setBounds(250, 137, 624, 20);
		tea_panel_1.add(profile_age_pane);
		profile_age_pane.setEditable(false);
		
		JTextPane profile_id_pane = new JTextPane();
		profile_id_pane.setText("TID");
		profile_id_pane.setBounds(250, 177, 624, 20);
		tea_panel_1.add(profile_id_pane);
		profile_id_pane.setEditable(false);
		
		JTextPane profile_course_pane = new JTextPane();
		profile_course_pane.setText("Course name");
		profile_course_pane.setBounds(250, 217, 624, 20);
		tea_panel_1.add(profile_course_pane);
		profile_course_pane.setEditable(false);
		
		JTextPane profile_department_pane = new JTextPane();
		profile_department_pane.setText("DEpartment Name");
		profile_department_pane.setBounds(250, 257, 624, 20);
		tea_panel_1.add(profile_department_pane);
		profile_department_pane.setEditable(false);
		
		JTextPane profile_salary_pane = new JTextPane();
		profile_salary_pane.setText("TSAL");
		profile_salary_pane.setBounds(250, 297, 624, 20);
		tea_panel_1.add(profile_salary_pane);
		profile_salary_pane.setEditable(false);
		
		JTextPane profile_dno_pane = new JTextPane();
		profile_dno_pane.setText("TDNO");
		profile_dno_pane.setBounds(250, 337, 624, 20);
		tea_panel_1.add(profile_dno_pane);
		profile_dno_pane.setEditable(false);
		
		JTextPane profile_street_pane = new JTextPane();
		profile_street_pane.setText("TSTR");
		profile_street_pane.setBounds(250, 377, 624, 20);
		tea_panel_1.add(profile_street_pane);
		profile_street_pane.setEditable(false);
		
		JTextPane profile_city_pane = new JTextPane();
		profile_city_pane.setText("TCITY");
		profile_city_pane.setBounds(250, 417, 624, 20);
		tea_panel_1.add(profile_city_pane);
		profile_city_pane.setEditable(false);
		
		timetable_table = new JTable();
		timetable_table.setBounds(69, 52, 944, 509);
		tea_panel_2.add(timetable_table);
		
		JLabel timetable_label = new JLabel("Time Table");
		timetable_label.setFont(new Font("Tahoma", Font.BOLD, 30));
		timetable_label.setBounds(438, 10, 166, 37);
		tea_panel_2.add(timetable_label);
		
		JLabel course_name_label = new JLabel("Course");
		course_name_label.setBounds(69, 26, 170, 40);
		course_name_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		tea_panel_3.add(course_name_label);
		
		JTextPane course_name_pane = new JTextPane();
		course_name_pane.setBounds(282, 34, 624, 20);
		course_name_pane.setText("Course name");
		tea_panel_3.add(course_name_pane);
		course_name_pane.setEditable(false);
		
		JLabel tea3_studentsenrolled_label = new JLabel("Students Enrolled:");
		tea3_studentsenrolled_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		tea3_studentsenrolled_label.setBounds(69, 65, 170, 40);
		tea_panel_3.add(tea3_studentsenrolled_label);
		
		table = new JTable();
		table.setBounds(69, 131, 944, 441);
		tea_panel_3.add(table);
		
		
		
	}
}
