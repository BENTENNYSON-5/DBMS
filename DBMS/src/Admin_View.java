import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_View extends JFrame {

	protected JPanel contentPane;
	protected JPanel jjpanel;
	private JPanel admin_view_headingPanel;
	private JLabel admin_view_heading;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_View frame = new Admin_View();
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
	public Admin_View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280,720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Ad_v_lo = new JButton("LOGOUT");
		Ad_v_lo.setBackground(Color.YELLOW);
		Ad_v_lo.setForeground(Color.RED);
		Ad_v_lo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg = new Login();
				lg.setVisible(true);
				dispose();
			}
		});
		Ad_v_lo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Ad_v_lo.setBounds(27, 614, 152, 59);
		contentPane.add(Ad_v_lo);
		
		JButton Ad_v_back = new JButton("BACK");
		Ad_v_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin AD = new Admin();
				AD.setVisible(true);
				dispose();
			}
		});
		Ad_v_back.setBackground(Color.YELLOW);
		Ad_v_back.setForeground(Color.BLACK);
		Ad_v_back.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Ad_v_back.setBounds(27, 545, 152, 59);
		contentPane.add(Ad_v_back);
		
		jjpanel = new JPanel();
		jjpanel.setBackground(Color.CYAN);
		jjpanel.setBounds(217, 162, 867, 511);
		contentPane.add(jjpanel);
		
		admin_view_headingPanel = new JPanel();
		admin_view_headingPanel.setLayout(null);
		admin_view_headingPanel.setBackground(Color.YELLOW);
		admin_view_headingPanel.setBounds(0, 0, 1266, 65);
		contentPane.add(admin_view_headingPanel);
		
		admin_view_heading = new JLabel("Admin Management System ");
		admin_view_heading.setForeground(Color.RED);
		admin_view_heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		admin_view_heading.setBounds(381, 10, 614, 46);
		admin_view_headingPanel.add(admin_view_heading);
	}
}
