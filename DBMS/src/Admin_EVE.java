import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_EVE extends JFrame {

	private JPanel contentPane;
	private JTextField EVEcancelIDtf;
	private JTextField EVEaddIDtf;
	private JTextField EVEaddnametf;
	private JTextField EVEaddsdtf;
	private JTextField EVEaddedtf;
	private JTextField EVEaddentryfeetf;
	private JTextField EVEaddcoIDtf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_EVE frame = new Admin_EVE();
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
	public Admin_EVE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280,720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCancel = new JLabel("Cancel");
		lblCancel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCancel.setBackground(Color.RED);
		lblCancel.setBounds(200, 56, 121, 67);
		contentPane.add(lblCancel);
		
		JLabel lblNewEvent = new JLabel("New Event");
		lblNewEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewEvent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewEvent.setBackground(Color.YELLOW);
		lblNewEvent.setBounds(894, 56, 121, 67);
		contentPane.add(lblNewEvent);
		
		JPanel EVEcpanel = new JPanel();
		EVEcpanel.setBackground(Color.GREEN);
		EVEcpanel.setBounds(603, 0, 28, 683);
		contentPane.add(EVEcpanel);
		
		JLabel lblNewLabel_1_2 = new JLabel("Event ID");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(98, 149, 121, 50);
		contentPane.add(lblNewLabel_1_2);
		
		JButton EVEcanceldone = new JButton("Done");
		EVEcanceldone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//querycode
				Admin AD = new Admin();
				AD.setVisible(true);
				dispose();
			}
		});
		EVEcanceldone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EVEcanceldone.setBounds(306, 251, 121, 50);
		contentPane.add(EVEcanceldone);
		
		EVEcancelIDtf = new JTextField();
		EVEcancelIDtf.setColumns(10);
		EVEcancelIDtf.setBounds(277, 149, 179, 50);
		contentPane.add(EVEcancelIDtf);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Event ID");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(742, 149, 121, 50);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Name");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_2.setBounds(742, 238, 121, 50);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Dates");
		lblNewLabel_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_3.setBounds(742, 335, 121, 50);
		contentPane.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Entry Fee");
		lblNewLabel_1_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_4.setBounds(742, 425, 121, 50);
		contentPane.add(lblNewLabel_1_2_4);
		
		JLabel lblNewLabel_1_2_5 = new JLabel("Co ordinator ID");
		lblNewLabel_1_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_5.setBounds(742, 517, 138, 50);
		contentPane.add(lblNewLabel_1_2_5);
		
		JButton EVEaddevent = new JButton("ADD EVENT");
		EVEaddevent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//querycode
				Admin AD = new Admin();
				AD.setVisible(true);
				dispose();
			}
		});
		EVEaddevent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EVEaddevent.setBounds(1009, 604, 169, 58);
		contentPane.add(EVEaddevent);
		
		EVEaddIDtf = new JTextField();
		EVEaddIDtf.setColumns(10);
		EVEaddIDtf.setBounds(940, 149, 179, 50);
		contentPane.add(EVEaddIDtf);
		
		EVEaddnametf = new JTextField();
		EVEaddnametf.setColumns(10);
		EVEaddnametf.setBounds(940, 238, 179, 50);
		contentPane.add(EVEaddnametf);
		
		EVEaddsdtf = new JTextField();
		EVEaddsdtf.setColumns(10);
		EVEaddsdtf.setBounds(894, 340, 155, 50);
		contentPane.add(EVEaddsdtf);
		
		EVEaddedtf = new JTextField();
		EVEaddedtf.setColumns(10);
		EVEaddedtf.setBounds(1062, 340, 155, 50);
		contentPane.add(EVEaddedtf);
		
		JLabel lblNewLabel = new JLabel("Start");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(894, 314, 73, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnd = new JLabel("End");
		lblEnd.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnd.setBounds(1062, 314, 73, 24);
		contentPane.add(lblEnd);
		
		EVEaddentryfeetf = new JTextField();
		EVEaddentryfeetf.setColumns(10);
		EVEaddentryfeetf.setBounds(940, 425, 179, 50);
		contentPane.add(EVEaddentryfeetf);
		
		EVEaddcoIDtf = new JTextField();
		EVEaddcoIDtf.setColumns(10);
		EVEaddcoIDtf.setBounds(940, 517, 179, 50);
		contentPane.add(EVEaddcoIDtf);
	}

}
