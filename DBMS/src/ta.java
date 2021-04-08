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
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ta extends JFrame {

	private JPanel ta_contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ta frame = new ta();
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
	public ta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		ta_contentPane = new JPanel();
		ta_contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ta_contentPane);
		ta_contentPane.setLayout(null);
		
		JLayeredPane ta_layeredPane = new JLayeredPane();
		ta_layeredPane.setBounds(186, 65, 1080, 615);
		ta_contentPane.add(ta_layeredPane);
		ta_layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel ta_profile_panel = new JPanel();
		ta_profile_panel.setBackground(Color.CYAN);
		ta_layeredPane.add(ta_profile_panel, "name_349220811387700");
		ta_profile_panel.setLayout(null);
		
		JPanel ta_studentsmarks_panel = new JPanel();
		ta_studentsmarks_panel.setBackground(Color.CYAN);
		ta_layeredPane.add(ta_studentsmarks_panel, "name_349237760040100");
		ta_studentsmarks_panel.setLayout(null);
		
		JPanel ta_headingPanel = new JPanel();
		ta_headingPanel.setBackground(Color.YELLOW);
		ta_headingPanel.setBounds(0, 0, 1266, 65);
		ta_contentPane.add(ta_headingPanel);
		ta_headingPanel.setLayout(null);
		
		JLabel ta_heading = new JLabel("Teaching Assistant's Management System ");
		ta_heading.setBounds(255, 10, 823, 46);
		ta_heading.setForeground(Color.RED);
		ta_heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		ta_headingPanel.add(ta_heading);
		
		JPanel ta_contentPanel2 = new JPanel();
		ta_contentPanel2.setBackground(new Color(127, 255, 212));
		ta_contentPanel2.setBounds(0, 110, 186, 570);
		ta_contentPane.add(ta_contentPanel2);
		ta_contentPanel2.setLayout(null);
		
		JButton ta_profile_button = new JButton("Profile");
		ta_profile_button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ta_profile_button.setBounds(0, 0, 186, 60);
		ta_contentPanel2.add(ta_profile_button);
		ta_profile_button.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		        ta_layeredPane.removeAll();
		        ta_layeredPane.add(ta_profile_panel);
		        ta_layeredPane.repaint();
		        ta_layeredPane.revalidate();    
		    }  
		    });
		
		JButton ta_studentsmarks_button = new JButton("Student's Marks");
		ta_studentsmarks_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ta_studentsmarks_button.setBounds(0, 60, 186, 60);
		ta_contentPanel2.add(ta_studentsmarks_button);
		ta_studentsmarks_button.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		        ta_layeredPane.removeAll();
		        ta_layeredPane.add(ta_studentsmarks_panel);
		        ta_layeredPane.repaint();
		        ta_layeredPane.revalidate();    
		    }  
		    });
		
		JButton ta_LogOut = new JButton("LOG OUT");
		ta_LogOut.setFont(new Font("Tahoma", Font.PLAIN, 24));
		ta_LogOut.setBounds(0, 510, 186, 60);
		ta_contentPanel2.add(ta_LogOut);
		
		JPanel ta_contentPanel1 = new JPanel();
		ta_contentPanel1.setBackground(new Color(127, 255, 0));
		ta_contentPanel1.setBounds(0, 65, 186, 45);
		ta_contentPane.add(ta_contentPanel1);
		ta_contentPanel1.setLayout(null);
		
		JLabel ta_contents = new JLabel("Contents");
		ta_contents.setBounds(34, 10, 113, 25);
		ta_contents.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
		ta_contentPanel1.add(ta_contents);
				
		
		JLabel taname_label = new JLabel("Name");
		taname_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		taname_label.setBounds(80, 50, 170, 40);
		ta_profile_panel.add(taname_label);
		
		JLabel taage_label = new JLabel("Age");
		taage_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		taage_label.setBounds(80, 90, 170, 40);
		ta_profile_panel.add(taage_label);
		
		JLabel tacourse_label = new JLabel("Course assigned");
		tacourse_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		tacourse_label.setBounds(80, 130, 170, 40);
		ta_profile_panel.add(tacourse_label);
		
		JLabel tasalary_label = new JLabel("Salary");
		tasalary_label.setFont(new Font("Lato Semibold", Font.PLAIN, 20));
		tasalary_label.setBounds(80, 170, 170, 40);
		ta_profile_panel.add(tasalary_label);
		
		JTextPane taname_pane = new JTextPane();
		taname_pane.setText("TANAME");
		taname_pane.setBounds(250, 57, 624, 20);
		ta_profile_panel.add(taname_pane);
		taname_pane.setEditable(false);
		
		JTextPane taage_pane = new JTextPane();
		taage_pane.setText("TAAGE");
		taage_pane.setBounds(250, 97, 624, 20);
		ta_profile_panel.add(taage_pane);
		taage_pane.setEditable(false);
		
		JTextPane tacourse_pane = new JTextPane();
		tacourse_pane.setText("Course name");
		tacourse_pane.setBounds(250, 137, 624, 20);
		ta_profile_panel.add(tacourse_pane);
		tacourse_pane.setEditable(false);
		
		JTextPane tasalary_pane = new JTextPane();
		tasalary_pane.setText("TASAL");
		tasalary_pane.setBounds(250, 177, 624, 20);
		ta_profile_panel.add(tasalary_pane);
		tasalary_pane.setEditable(false);
		
		JLabel ta2_course_label = new JLabel("Course");
		ta2_course_label.setForeground(Color.BLACK);
		ta2_course_label.setBackground(Color.WHITE);
		ta2_course_label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ta2_course_label.setBounds(133, 77, 93, 37);
		ta_studentsmarks_panel.add(ta2_course_label);
		
		JTextPane ta2_course_pane = new JTextPane();
		ta2_course_pane.setBackground(Color.LIGHT_GRAY);
		ta2_course_pane.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ta2_course_pane.setText("Course Name");
		ta2_course_pane.setEditable(false);
		ta2_course_pane.setBounds(402, 71, 187, 43);
		ta_studentsmarks_panel.add(ta2_course_pane);
		
		JLabel ta2_studentID_label = new JLabel("Student I.D");
		ta2_studentID_label.setForeground(Color.BLACK);
		ta2_studentID_label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ta2_studentID_label.setBackground(Color.WHITE);
		ta2_studentID_label.setBounds(133, 174, 155, 37);
		ta_studentsmarks_panel.add(ta2_studentID_label);
		
		JTextPane ta2_studentID_pane = new JTextPane();
		ta2_studentID_pane.setText("SNO");
		ta2_studentID_pane.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ta2_studentID_pane.setBackground(Color.WHITE);
		ta2_studentID_pane.setBounds(402, 168, 187, 43);
		ta_studentsmarks_panel.add(ta2_studentID_pane);
		
		JLabel ta2_marks_label = new JLabel("Marks Obtained");
		ta2_marks_label.setForeground(Color.BLACK);
		ta2_marks_label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ta2_marks_label.setBackground(Color.WHITE);
		ta2_marks_label.setBounds(133, 271, 210, 37);
		ta_studentsmarks_panel.add(ta2_marks_label);
		
		JTextPane ta2_marks_pane = new JTextPane();
		ta2_marks_pane.setText("M1 or M2 or..M5, based on how you give subject numbers");
		ta2_marks_pane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ta2_marks_pane.setBackground(Color.WHITE);
		ta2_marks_pane.setBounds(402, 265, 187, 43);
		ta_studentsmarks_panel.add(ta2_marks_pane);
		
		JButton ta2_add_button = new JButton("Add");
		ta2_add_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ta2_add_button.setBounds(251, 406, 186, 60);
		ta_studentsmarks_panel.add(ta2_add_button);
		
		
	}
}
