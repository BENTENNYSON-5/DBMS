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
	protected JTable table;
	protected JButton Ad_v_edit;

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(200, 87, 1056, 586);
		contentPane.add(table);
		
		Ad_v_edit = new JButton("EDIT");
		Ad_v_edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin ad = new Admin();
				ad.setVisible(true);
				dispose();
			}
		});
		Ad_v_edit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Ad_v_edit.setBounds(27, 162, 152, 59);
		contentPane.add(Ad_v_edit);
		
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
	}
}
