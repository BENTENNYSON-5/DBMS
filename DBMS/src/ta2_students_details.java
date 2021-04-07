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
		
		JButton ta2_TimeTable = new JButton("Students Details");
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
		
		JLabel ta2coursename_label = new JLabel("Course Assigned");
		ta2coursename_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		ta2coursename_label.setBounds(80, 50, 170, 40);
		ta2_MainPanel.add(ta2coursename_label);
		
		JTextPane ta2coursename_pane = new JTextPane();
		ta2coursename_pane.setText("TANAME");
		ta2coursename_pane.setBounds(250, 57, 624, 20);
		ta2_MainPanel.add(ta2coursename_pane);
		ta2coursename_pane.setEditable(false);
		
		
	}
}
