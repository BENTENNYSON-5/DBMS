import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

public class teacher_course_details extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacher_course_details frame = new teacher_course_details();
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
	public teacher_course_details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel tea3_headingPanel = new JPanel();
		tea3_headingPanel.setBackground(Color.YELLOW);
		tea3_headingPanel.setBounds(0, 0, 1266, 65);
		contentPane.add(tea3_headingPanel);
		tea3_headingPanel.setLayout(null);
		
		JLabel tea3_heading = new JLabel("Random College Mangement Sysytem ");
		tea3_heading.setBounds(255, 10, 743, 46);
		tea3_heading.setForeground(Color.RED);
		tea3_heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		tea3_headingPanel.add(tea3_heading);
		
		JPanel tea3_contentPanel2 = new JPanel();
		tea3_contentPanel2.setBackground(new Color(127, 255, 212));
		tea3_contentPanel2.setBounds(0, 110, 186, 570);
		contentPane.add(tea3_contentPanel2);
		tea3_contentPanel2.setLayout(null);
		
		JButton tea3_profile = new JButton("Profile");
		tea3_profile.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tea3_profile.setForeground(new Color(0, 0, 0));
		tea3_profile.setBounds(0, 0, 186, 60);
		tea3_contentPanel2.add(tea3_profile);
		
		JButton tea3_TimeTable = new JButton("Time Table");
		tea3_TimeTable.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tea3_TimeTable.setBounds(0, 60, 186, 60);
		tea3_contentPanel2.add(tea3_TimeTable);
		
		JButton tea3_CourseDetails = new JButton("Course Details");
		tea3_CourseDetails.setFont(new Font("Tahoma", Font.PLAIN, 24));
		tea3_CourseDetails.setBounds(0, 120, 186, 60);
		tea3_contentPanel2.add(tea3_CourseDetails);
		
		JButton tea3_LogOut = new JButton("LOG OUT");
		tea3_LogOut.setFont(new Font("Tahoma", Font.PLAIN, 24));
		tea3_LogOut.setBounds(0, 510, 186, 60);
		tea3_contentPanel2.add(tea3_LogOut);
		
		JPanel tea3_contentPanel1 = new JPanel();
		tea3_contentPanel1.setBackground(new Color(127, 255, 0));
		tea3_contentPanel1.setBounds(0, 65, 186, 45);
		contentPane.add(tea3_contentPanel1);
		tea3_contentPanel1.setLayout(null);
		
		JLabel tea3_contents = new JLabel("Contents");
		tea3_contents.setBounds(34, 10, 113, 25);
		tea3_contents.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
		tea3_contentPanel1.add(tea3_contents);
		
		JPanel tea3_MainPanel = new JPanel();
		tea3_MainPanel.setBackground(new Color(0, 255, 255));
		tea3_MainPanel.setBounds(186, 65, 1080, 615);
		contentPane.add(tea3_MainPanel);
		tea3_MainPanel.setLayout(null);
		
		JLabel course_name_label = new JLabel("Course");
		course_name_label.setBounds(69, 26, 170, 40);
		course_name_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		tea3_MainPanel.add(course_name_label);
		
		JTextPane course_name_pane = new JTextPane();
		course_name_pane.setBounds(282, 34, 624, 20);
		course_name_pane.setText("Course name");
		tea3_MainPanel.add(course_name_pane);
		course_name_pane.setEditable(false);
		
		JLabel tea3_studentsenrolled_label = new JLabel("Students Enrolled:");
		tea3_studentsenrolled_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		tea3_studentsenrolled_label.setBounds(69, 65, 170, 40);
		tea3_MainPanel.add(tea3_studentsenrolled_label);
		
		table = new JTable();
		table.setBounds(69, 131, 944, 441);
		tea3_MainPanel.add(table);
		
	}
}
