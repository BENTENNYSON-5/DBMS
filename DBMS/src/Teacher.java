import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

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
		tea_MainPanel.setBackground(new Color(245, 245, 220));
		tea_MainPanel.setBounds(186, 65, 1080, 615);
		contentPane.add(tea_MainPanel);
		tea_MainPanel.setLayout(null);
	}
}
