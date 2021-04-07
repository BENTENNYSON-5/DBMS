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

public class ta2_students_details extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ta2_students_details frame = new ta2_students_details();
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
	public ta2_students_details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel ta2_headingPanel = new JPanel();
		ta2_headingPanel.setBackground(Color.YELLOW);
		ta2_headingPanel.setBounds(0, 0, 1266, 65);
		contentPane.add(ta2_headingPanel);
		ta2_headingPanel.setLayout(null);
		
		JLabel ta2_heading = new JLabel("Teaching Assistant's Management System ");
		ta2_heading.setBounds(255, 10, 823, 46);
		ta2_heading.setForeground(Color.RED);
		ta2_heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		ta2_headingPanel.add(ta2_heading);
		
		JPanel ta2_contentPanel2 = new JPanel();
		ta2_contentPanel2.setBackground(new Color(127, 255, 212));
		ta2_contentPanel2.setBounds(0, 110, 186, 570);
		contentPane.add(ta2_contentPanel2);
		ta2_contentPanel2.setLayout(null);
		
		JButton ta2_profile = new JButton("Profile");
		ta2_profile.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ta2_profile.setForeground(new Color(0, 0, 0));
		ta2_profile.setBounds(0, 0, 186, 60);
		ta2_contentPanel2.add(ta2_profile);
		
		JButton ta2_TimeTable = new JButton("Student's Marks");
		ta2_TimeTable.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ta2_TimeTable.setBounds(0, 60, 186, 60);
		ta2_contentPanel2.add(ta2_TimeTable);
		
		JButton ta2_LogOut = new JButton("LOG OUT");
		ta2_LogOut.setFont(new Font("Tahoma", Font.PLAIN, 24));
		ta2_LogOut.setBounds(0, 510, 186, 60);
		ta2_contentPanel2.add(ta2_LogOut);
		
		JPanel ta2_contentPanel1 = new JPanel();
		ta2_contentPanel1.setBackground(new Color(127, 255, 0));
		ta2_contentPanel1.setBounds(0, 65, 186, 45);
		contentPane.add(ta2_contentPanel1);
		ta2_contentPanel1.setLayout(null);
		
		JLabel ta2_contents = new JLabel("Contents");
		ta2_contents.setBounds(34, 10, 113, 25);
		ta2_contents.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
		ta2_contentPanel1.add(ta2_contents);
		
		JPanel ta2_MainPanel = new JPanel();
		ta2_MainPanel.setBackground(new Color(0, 255, 255));
		ta2_MainPanel.setBounds(186, 65, 1080, 615);
		contentPane.add(ta2_MainPanel);
		ta2_MainPanel.setLayout(null);
		
		JLabel ta2_course_label = new JLabel("Course");
		ta2_course_label.setForeground(Color.BLACK);
		ta2_course_label.setBackground(Color.WHITE);
		ta2_course_label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ta2_course_label.setBounds(133, 77, 93, 37);
		ta2_MainPanel.add(ta2_course_label);
		
		JTextPane ta2_course_pane = new JTextPane();
		ta2_course_pane.setBackground(new Color(224, 255, 255));
		ta2_course_pane.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ta2_course_pane.setText("Course Name");
		ta2_course_pane.setEditable(false);
		ta2_course_pane.setBounds(402, 71, 187, 43);
		ta2_MainPanel.add(ta2_course_pane);
		
		JLabel ta2_studentID_label = new JLabel("Student I.D");
		ta2_studentID_label.setForeground(Color.BLACK);
		ta2_studentID_label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ta2_studentID_label.setBackground(Color.WHITE);
		ta2_studentID_label.setBounds(133, 174, 155, 37);
		ta2_MainPanel.add(ta2_studentID_label);
		
		JTextPane ta2_studentID_pane = new JTextPane();
		ta2_studentID_pane.setText("SNO");
		ta2_studentID_pane.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ta2_studentID_pane.setBackground(Color.WHITE);
		ta2_studentID_pane.setBounds(402, 168, 187, 43);
		ta2_MainPanel.add(ta2_studentID_pane);
		
		JLabel ta2_marks_label = new JLabel("Marks Obtained");
		ta2_marks_label.setForeground(Color.BLACK);
		ta2_marks_label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ta2_marks_label.setBackground(Color.WHITE);
		ta2_marks_label.setBounds(133, 271, 210, 37);
		ta2_MainPanel.add(ta2_marks_label);
		
		JTextPane ta2_marks_pane = new JTextPane();
		ta2_marks_pane.setText("M1 or M2 or..M5, based on how you give subject numbers");
		ta2_marks_pane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ta2_marks_pane.setBackground(Color.WHITE);
		ta2_marks_pane.setBounds(402, 265, 187, 43);
		ta2_MainPanel.add(ta2_marks_pane);
		
		JButton ta2_add_button = new JButton("Add");
		ta2_add_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ta2_add_button.setBounds(251, 406, 186, 60);
		ta2_MainPanel.add(ta2_add_button);
		
		
	}
}
