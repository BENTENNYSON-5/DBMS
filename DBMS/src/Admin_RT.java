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

public class Admin_RT extends JFrame {

	private JPanel contentPane;
	private JTextField RTremoveIDtf;
	private JTextField RTaddIDtf;
	private JTextField RTaddfntf;
	private JTextField RTaddlntf;
	private JTextField RTaddagetf;
	private JTextField RTaddsaltf;
	private JTextField RTaddph1tf;
	private JTextField RTaddph2tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_RT frame = new Admin_RT();
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
	public Admin_RT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280,720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRemove = new JLabel("REMOVE");
		lblRemove.setBackground(Color.RED);
		lblRemove.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemove.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRemove.setBounds(207, 30, 121, 67);
		contentPane.add(lblRemove);
		
		JLabel lblNewLabel = new JLabel("ADD");
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(805, 30, 121, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_2 = new JLabel("Teacher ID");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(87, 134, 121, 50);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Teacher ID");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_2.setBounds(682, 134, 121, 50);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("First name");
		lblNewLabel_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_3.setBounds(682, 206, 121, 50);
		contentPane.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Last name");
		lblNewLabel_1_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_4.setBounds(682, 286, 121, 50);
		contentPane.add(lblNewLabel_1_2_4);
		
		JLabel lblNewLabel_1_2_5 = new JLabel("Age");
		lblNewLabel_1_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_5.setBounds(682, 368, 121, 50);
		contentPane.add(lblNewLabel_1_2_5);
		
		JLabel lblNewLabel_1_2_6 = new JLabel("Salary");
		lblNewLabel_1_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_6.setBounds(682, 448, 121, 50);
		contentPane.add(lblNewLabel_1_2_6);
		
		RTremoveIDtf = new JTextField();
		RTremoveIDtf.setColumns(10);
		RTremoveIDtf.setBounds(291, 134, 179, 50);
		contentPane.add(RTremoveIDtf);
		
		RTaddIDtf = new JTextField();
		RTaddIDtf.setColumns(10);
		RTaddIDtf.setBounds(913, 134, 179, 50);
		contentPane.add(RTaddIDtf);
		
		RTaddfntf = new JTextField();
		RTaddfntf.setColumns(10);
		RTaddfntf.setBounds(913, 211, 179, 50);
		contentPane.add(RTaddfntf);
		
		RTaddlntf = new JTextField();
		RTaddlntf.setColumns(10);
		RTaddlntf.setBounds(913, 291, 179, 50);
		contentPane.add(RTaddlntf);
		
		RTaddagetf = new JTextField();
		RTaddagetf.setColumns(10);
		RTaddagetf.setBounds(913, 373, 179, 50);
		contentPane.add(RTaddagetf);
		
		RTaddsaltf = new JTextField();
		RTaddsaltf.setColumns(10);
		RTaddsaltf.setBounds(913, 453, 179, 50);
		contentPane.add(RTaddsaltf);
		
		JButton RTremovedone = new JButton("Done");
		RTremovedone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//querycode
				Admin AD = new Admin();
				AD.setVisible(true);
				dispose();
			}
		});
		RTremovedone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		RTremovedone.setBounds(304, 269, 121, 50);
		contentPane.add(RTremovedone);
		
		JButton RTadddone = new JButton("Done");
		RTadddone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//querycode
				Admin AD = new Admin();
				AD.setVisible(true);
				dispose();
			}
		});
		RTadddone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		RTadddone.setBounds(944, 607, 121, 50);
		contentPane.add(RTadddone);
		
		JPanel RTcpanel = new JPanel();
		RTcpanel.setBackground(Color.BLUE);
		RTcpanel.setBounds(595, 0, 28, 683);
		contentPane.add(RTcpanel);
		
		JLabel lblNewLabel_1_2_6_1 = new JLabel("Phone no");
		lblNewLabel_1_2_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_6_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_6_1.setBounds(693, 524, 121, 50);
		contentPane.add(lblNewLabel_1_2_6_1);
		
		RTaddph1tf = new JTextField();
		RTaddph1tf.setColumns(10);
		RTaddph1tf.setBounds(840, 524, 179, 50);
		contentPane.add(RTaddph1tf);
		
		RTaddph2tf = new JTextField();
		RTaddph2tf.setColumns(10);
		RTaddph2tf.setBounds(1037, 524, 179, 50);
		contentPane.add(RTaddph2tf);
	}

}
