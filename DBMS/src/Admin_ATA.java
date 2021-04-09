import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_ATA extends JFrame {

	private JPanel contentPane;
	private JTextField ATAremovenametf;
	private JTextField ATAremovecnotf;
	private JTextField ATAaddnametf;
	private JTextField ATAaddcnotf;
	private JTextField ATAaddagetf;
	private JTextField ATAaddsaltf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_ATA frame = new Admin_ATA();
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
	public Admin_ATA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280,720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD");
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(843, 58, 121, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblRemove = new JLabel("REMOVE");
		lblRemove.setBackground(Color.RED);
		lblRemove.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemove.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRemove.setBounds(199, 58, 121, 67);
		contentPane.add(lblRemove);
		
		JLabel lblNewLabel_1 = new JLabel("TA name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(105, 196, 121, 50);
		contentPane.add(lblNewLabel_1);
		
		ATAremovenametf = new JTextField();
		ATAremovenametf.setBounds(301, 196, 179, 50);
		contentPane.add(ATAremovenametf);
		ATAremovenametf.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Course no.");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(105, 277, 121, 50);
		contentPane.add(lblNewLabel_1_1);
		
		ATAremovecnotf = new JTextField();
		ATAremovecnotf.setColumns(10);
		ATAremovecnotf.setBounds(301, 277, 179, 50);
		contentPane.add(ATAremovecnotf);
		
		JButton ATAremovedone = new JButton("Done");
		ATAremovedone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//querycode
				Admin AD = new Admin();
				AD.setVisible(true);
				dispose();
			}
		});
		ATAremovedone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ATAremovedone.setBounds(345, 427, 121, 50);
		contentPane.add(ATAremovedone);
		
		JLabel lblNewLabel_1_2 = new JLabel("TA name");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(705, 196, 121, 50);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Course no.");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(705, 277, 121, 50);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("TA age");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(705, 363, 121, 50);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("TA sal");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_5.setBounds(705, 455, 121, 50);
		contentPane.add(lblNewLabel_1_5);
		
		ATAaddnametf = new JTextField();
		ATAaddnametf.setColumns(10);
		ATAaddnametf.setBounds(914, 196, 179, 50);
		contentPane.add(ATAaddnametf);
		
		ATAaddcnotf = new JTextField();
		ATAaddcnotf.setColumns(10);
		ATAaddcnotf.setBounds(914, 277, 179, 50);
		contentPane.add(ATAaddcnotf);
		
		ATAaddagetf = new JTextField();
		ATAaddagetf.setColumns(10);
		ATAaddagetf.setBounds(914, 363, 179, 50);
		contentPane.add(ATAaddagetf);
		
		ATAaddsaltf = new JTextField();
		ATAaddsaltf.setColumns(10);
		ATAaddsaltf.setBounds(914, 447, 179, 50);
		contentPane.add(ATAaddsaltf);
		
		JButton ATAadddone = new JButton("Done");
		ATAadddone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//querycode
				Admin AD = new Admin();
				AD.setVisible(true);
				dispose();
			}
		});
		ATAadddone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ATAadddone.setBounds(953, 564, 121, 50);
		contentPane.add(ATAadddone);
		
		JPanel ATAcpanel = new JPanel();
		ATAcpanel.setBackground(Color.BLUE);
		ATAcpanel.setBounds(592, 0, 28, 683);
		contentPane.add(ATAcpanel);
	}
}
