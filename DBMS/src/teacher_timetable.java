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
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class teacher_timetable extends JFrame {

	private JPanel contentPane;
	private JTable timetable_table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacher_timetable frame = new teacher_timetable();
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
	public teacher_timetable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel tea2_headingPanel = new JPanel();
		tea2_headingPanel.setBackground(Color.YELLOW);
		tea2_headingPanel.setBounds(0, 0, 1266, 65);
		contentPane.add(tea2_headingPanel);
		tea2_headingPanel.setLayout(null);
		
		JLabel tea2_heading = new JLabel("Random College Mangement Sysytem ");
		tea2_heading.setBounds(255, 10, 743, 46);
		tea2_heading.setForeground(Color.RED);
		tea2_heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		tea2_headingPanel.add(tea2_heading);
		
		JPanel tea2_contentPanel2 = new JPanel();
		tea2_contentPanel2.setBackground(new Color(127, 255, 212));
		tea2_contentPanel2.setBounds(0, 110, 186, 570);
		contentPane.add(tea2_contentPanel2);
		tea2_contentPanel2.setLayout(null);
		
		JButton tea2_profile = new JButton("Profile");
		tea2_profile.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tea2_profile.setForeground(new Color(0, 0, 0));
		tea2_profile.setBounds(0, 0, 186, 60);
		tea2_contentPanel2.add(tea2_profile);
		
		JButton tea2_TimeTable = new JButton("Time Table");
		tea2_TimeTable.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tea2_TimeTable.setBounds(0, 60, 186, 60);
		tea2_contentPanel2.add(tea2_TimeTable);
		
		JButton tea2_CourseDetails = new JButton("Course Details");
		tea2_CourseDetails.setFont(new Font("Tahoma", Font.PLAIN, 24));
		tea2_CourseDetails.setBounds(0, 120, 186, 60);
		tea2_contentPanel2.add(tea2_CourseDetails);
		
		JButton tea2_LogOut = new JButton("LOG OUT");
		tea2_LogOut.setFont(new Font("Tahoma", Font.PLAIN, 24));
		tea2_LogOut.setBounds(0, 510, 186, 60);
		tea2_contentPanel2.add(tea2_LogOut);
		
		JPanel tea2_contentPanel1 = new JPanel();
		tea2_contentPanel1.setBackground(new Color(127, 255, 0));
		tea2_contentPanel1.setBounds(0, 65, 186, 45);
		contentPane.add(tea2_contentPanel1);
		tea2_contentPanel1.setLayout(null);
		
		JLabel tea2_contents = new JLabel("Contents");
		tea2_contents.setBounds(34, 10, 113, 25);
		tea2_contents.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
		tea2_contentPanel1.add(tea2_contents);
		
		JPanel tea2_MainPanel = new JPanel();
		tea2_MainPanel.setBackground(new Color(0, 255, 255));
		tea2_MainPanel.setBounds(186, 65, 1080, 615);
		contentPane.add(tea2_MainPanel);
		tea2_MainPanel.setLayout(null);
		
		timetable_table = new JTable();
		timetable_table.setBounds(69, 52, 944, 509);
		tea2_MainPanel.add(timetable_table);
		
		JLabel timetable_label = new JLabel("Time Table");
		timetable_label.setFont(new Font("Tahoma", Font.BOLD, 30));
		timetable_label.setBounds(438, 10, 166, 37);
		tea2_MainPanel.add(timetable_label);
		
		//on clicking profile
		tea2_profile.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		        new Teacher();
		    }  
		    });
		
		//on clicking course details
		tea2_CourseDetails.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		        new teacher_course_details();
		    }  
		    });
	}
}
