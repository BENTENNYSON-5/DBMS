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

public class ta_profile extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ta_profile frame = new ta_profile();
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
	public ta_profile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JPanel ta_headingPanel = new JPanel();
		ta_headingPanel.setBackground(Color.YELLOW);
		ta_headingPanel.setBounds(0, 0, 1266, 65);
		contentPane.add(ta_headingPanel);
		ta_headingPanel.setLayout(null);
		
		JLabel ta_heading = new JLabel("Teaching Assistant's Management System ");
		ta_heading.setBounds(255, 10, 823, 46);
		ta_heading.setForeground(Color.RED);
		ta_heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		ta_headingPanel.add(ta_heading);
		
		JPanel ta_contentPanel2 = new JPanel();
		ta_contentPanel2.setBackground(new Color(127, 255, 212));
		ta_contentPanel2.setBounds(0, 110, 186, 570);
		contentPane.add(ta_contentPanel2);
		ta_contentPanel2.setLayout(null);
		
		JButton ta_profile = new JButton("Profile");
		ta_profile.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ta_profile.setForeground(new Color(0, 0, 0));
		ta_profile.setBounds(0, 0, 186, 60);
		ta_contentPanel2.add(ta_profile);
		
		JButton ta_TimeTable = new JButton("Students Details");
		ta_TimeTable.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ta_TimeTable.setBounds(0, 60, 186, 60);
		ta_contentPanel2.add(ta_TimeTable);
		
		JButton ta_LogOut = new JButton("LOG OUT");
		ta_LogOut.setFont(new Font("Tahoma", Font.PLAIN, 24));
		ta_LogOut.setBounds(0, 510, 186, 60);
		ta_contentPanel2.add(ta_LogOut);
		
		JPanel ta_contentPanel1 = new JPanel();
		ta_contentPanel1.setBackground(new Color(127, 255, 0));
		ta_contentPanel1.setBounds(0, 65, 186, 45);
		contentPane.add(ta_contentPanel1);
		ta_contentPanel1.setLayout(null);
		
		JLabel ta_contents = new JLabel("Contents");
		ta_contents.setBounds(34, 10, 113, 25);
		ta_contents.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
		ta_contentPanel1.add(ta_contents);
		
		JPanel ta_MainPanel = new JPanel();
		ta_MainPanel.setBackground(new Color(0, 255, 255));
		ta_MainPanel.setBounds(186, 65, 1080, 615);
		contentPane.add(ta_MainPanel);
		ta_MainPanel.setLayout(null);
		
		JLabel taname_label = new JLabel("Name");
		taname_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		taname_label.setBounds(80, 50, 170, 40);
		ta_MainPanel.add(taname_label);
		
		JLabel taage_label = new JLabel("Age");
		taage_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		taage_label.setBounds(80, 90, 170, 40);
		ta_MainPanel.add(taage_label);
		
		JLabel tacourse_label = new JLabel("Course assigned");
		tacourse_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		tacourse_label.setBounds(80, 130, 170, 40);
		ta_MainPanel.add(tacourse_label);
		
		JLabel tasalary_label = new JLabel("Salary");
		tasalary_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		tasalary_label.setBounds(80, 170, 170, 40);
		ta_MainPanel.add(tasalary_label);
		
		JTextPane taname_pane = new JTextPane();
		taname_pane.setText("TANAME");
		taname_pane.setBounds(250, 57, 624, 20);
		ta_MainPanel.add(taname_pane);
		taname_pane.setEditable(false);
		
		JTextPane taage_pane = new JTextPane();
		taage_pane.setText("TAAGE");
		taage_pane.setBounds(250, 97, 624, 20);
		ta_MainPanel.add(taage_pane);
		taage_pane.setEditable(false);
		
		JTextPane tacourse_pane = new JTextPane();
		tacourse_pane.setText("Course name");
		tacourse_pane.setBounds(250, 137, 624, 20);
		ta_MainPanel.add(tacourse_pane);
		tacourse_pane.setEditable(false);
		
		JTextPane profile_id_pane = new JTextPane();
		profile_id_pane.setText("TASAL");
		profile_id_pane.setBounds(250, 177, 624, 20);
		ta_MainPanel.add(profile_id_pane);
		profile_id_pane.setEditable(false);
	}

}
