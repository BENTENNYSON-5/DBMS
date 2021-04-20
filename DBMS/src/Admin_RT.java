import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//code
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
	private JTextField RTaddcnotf;
	private JTextField RTadddnotf;
	private JTextField RTadddoortf;
	private JTextField RTaddstrtf;
	private JTextField RTaddcitf;

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
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRemove = new JLabel("REMOVE");
		lblRemove.setBackground(Color.RED);
		lblRemove.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemove.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRemove.setBounds(205, 10, 121, 67);
		contentPane.add(lblRemove);
		
		JLabel lblNewLabel = new JLabel("ADD");
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(808, 10, 121, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_2 = new JLabel("Teacher ID");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(87, 134, 121, 50);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Teacher ID");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_2.setBounds(682, 88, 121, 50);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("First name");
		lblNewLabel_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_3.setBounds(682, 134, 121, 50);
		contentPane.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Last name");
		lblNewLabel_1_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_4.setBounds(682, 194, 121, 50);
		contentPane.add(lblNewLabel_1_2_4);
		
		JLabel lblNewLabel_1_2_5 = new JLabel("Age");
		lblNewLabel_1_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_5.setBounds(682, 254, 121, 50);
		contentPane.add(lblNewLabel_1_2_5);
		
		JLabel lblNewLabel_1_2_6 = new JLabel("Salary");
		lblNewLabel_1_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_6.setBounds(702, 314, 121, 50);
		contentPane.add(lblNewLabel_1_2_6);
		
		RTremoveIDtf = new JTextField();
		RTremoveIDtf.setColumns(10);
		RTremoveIDtf.setBounds(291, 134, 179, 50);
		contentPane.add(RTremoveIDtf);
		
		RTaddIDtf = new JTextField();
		RTaddIDtf.setColumns(10);
		RTaddIDtf.setBounds(913, 87, 179, 50);
		contentPane.add(RTaddIDtf);
		
		RTaddfntf = new JTextField();
		RTaddfntf.setColumns(10);
		RTaddfntf.setBounds(913, 139, 179, 50);
		contentPane.add(RTaddfntf);
		
		RTaddlntf = new JTextField();
		RTaddlntf.setColumns(10);
		RTaddlntf.setBounds(913, 199, 179, 50);
		contentPane.add(RTaddlntf);
		
		RTaddagetf = new JTextField();
		RTaddagetf.setColumns(10);
		RTaddagetf.setBounds(913, 259, 179, 50);
		contentPane.add(RTaddagetf);
		
		RTaddsaltf = new JTextField();
		RTaddsaltf.setColumns(10);
		RTaddsaltf.setBounds(913, 319, 179, 50);
		contentPane.add(RTaddsaltf);
		
		JButton RTremovedone = new JButton("Done");
		RTremovedone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","ororacle");
					String tid = RTremoveIDtf.getText().toString();
					String sql0 = "delete from teacher_phno where tno = "+ tid;
					String sql = "delete from teacher where tid = "+ tid;
					PreparedStatement ps = conn.prepareStatement(sql0);
					ResultSet rs = ps.executeQuery();
					PreparedStatement pss = conn.prepareStatement(sql);
					ResultSet rss = pss.executeQuery();
					conn.close();
				}catch(Exception ex) {System.out.println(ex);}
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
				try {
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","ororacle");
					String tid=RTaddIDtf.getText().toString();
					String tname= RTaddfntf.getText().toString();
					String tlname = RTaddlntf.getText().toString();
					String tdno = RTadddoortf.getText().toString();
					String tstr= RTaddstrtf.getText().toString();
					String tcity =RTaddcitf.getText().toString();
					String tage=RTaddagetf.getText().toString();
					String cono=RTaddcnotf.getText().toString();
					String tsal=RTaddsaltf.getText().toString();
					String depntno=RTadddnotf.getText().toString();
					String phno1 = RTaddph1tf.getText().toString();
					String phno2 = RTaddph2tf.getText().toString();
					String sql = "insert into teacher values("+tid+","+"'"+tname+"'"+","+"'"+tlname+"'"+","+tdno+","+"'"+tstr+"'"+","+"'"+tcity+"'"+","+tage+","+cono+","+tsal+","+"'"+depntno+"'"+")";
					/*
					PreparedStatement ps = conn.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();*/
					String sql2= "insert into login_cred values("+tid+","+"'jshduj"+tid.substring(3)+"'"+")";
					PreparedStatement ps = conn.prepareStatement(sql);
					PreparedStatement ps2 = conn.prepareStatement(sql2);
					ResultSet rs = ps.executeQuery();
					ResultSet rs2 = ps2.executeQuery();
					if (RTaddph2tf.getText().isEmpty()) {
						String sqlp1 = "insert into teacher_phno values("+ tid + ","+phno1+")";
						PreparedStatement pss = conn.prepareStatement(sqlp1);
						ResultSet rss = pss.executeQuery();
					}else {
						String sqlp1 = "insert into teacher_phno values("+ tid + ","+phno1+")";
						String sqlp2 = "insert into teacher_phno values("+ tid + ","+phno2+")";
						PreparedStatement pss = conn.prepareStatement(sqlp1);
						ResultSet rss = pss.executeQuery();
						PreparedStatement psss = conn.prepareStatement(sqlp2);
						ResultSet rsss = psss.executeQuery();
					}
					conn.close();
				}catch(Exception ex) {System.out.println(ex);}
				//querycode
				Admin AD = new Admin();
				AD.setVisible(true);
				dispose();
			}
		});
		RTadddone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		RTadddone.setBounds(945, 633, 121, 50);
		contentPane.add(RTadddone);
		
		JPanel RTcpanel = new JPanel();
		RTcpanel.setBackground(Color.BLUE);
		RTcpanel.setBounds(595, 0, 35, 380);
		contentPane.add(RTcpanel);
		
		JLabel lblNewLabel_1_2_6_1 = new JLabel("Phone no");
		lblNewLabel_1_2_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_6_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_6_1.setBounds(702, 568, 121, 50);
		contentPane.add(lblNewLabel_1_2_6_1);
		
		RTaddph1tf = new JTextField();
		RTaddph1tf.setColumns(10);
		RTaddph1tf.setBounds(839, 573, 179, 50);
		contentPane.add(RTaddph1tf);
		
		RTaddph2tf = new JTextField();
		RTaddph2tf.setColumns(10);
		RTaddph2tf.setBounds(1039, 573, 179, 50);
		contentPane.add(RTaddph2tf);
		
		JLabel lblNewLabel_1_2_6_2 = new JLabel("Courseno");
		lblNewLabel_1_2_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_6_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_6_2.setBounds(702, 374, 121, 50);
		contentPane.add(lblNewLabel_1_2_6_2);
		
		JLabel lblNewLabel_1_2_6_3 = new JLabel("Depntno");
		lblNewLabel_1_2_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_6_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_6_3.setBounds(702, 435, 121, 50);
		contentPane.add(lblNewLabel_1_2_6_3);
		
		RTaddcnotf = new JTextField();
		RTaddcnotf.setColumns(10);
		RTaddcnotf.setBounds(913, 379, 179, 50);
		contentPane.add(RTaddcnotf);
		
		RTadddnotf = new JTextField();
		RTadddnotf.setColumns(10);
		RTadddnotf.setBounds(913, 435, 179, 50);
		contentPane.add(RTadddnotf);
		
		JLabel lblNewLabel_1_2_6_3_1 = new JLabel("Dno");
		lblNewLabel_1_2_6_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_6_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_6_3_1.setBounds(167, 419, 121, 50);
		contentPane.add(lblNewLabel_1_2_6_3_1);
		
		JPanel RTcpanel_1 = new JPanel();
		RTcpanel_1.setBackground(Color.BLUE);
		RTcpanel_1.setBounds(10, 374, 619, 32);
		contentPane.add(RTcpanel_1);
		
		RTadddoortf = new JTextField();
		RTadddoortf.setColumns(10);
		RTadddoortf.setBounds(333, 424, 179, 50);
		contentPane.add(RTadddoortf);
		
		JLabel lblNewLabel_1_2_6_3_1_1 = new JLabel("Street");
		lblNewLabel_1_2_6_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_6_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_6_3_1_1.setBounds(167, 479, 121, 50);
		contentPane.add(lblNewLabel_1_2_6_3_1_1);
		
		JLabel lblNewLabel_1_2_6_3_1_2 = new JLabel("city");
		lblNewLabel_1_2_6_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_6_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_6_3_1_2.setBounds(167, 540, 121, 50);
		contentPane.add(lblNewLabel_1_2_6_3_1_2);
		
		RTaddstrtf = new JTextField();
		RTaddstrtf.setColumns(10);
		RTaddstrtf.setBounds(333, 484, 179, 50);
		contentPane.add(RTaddstrtf);
		
		RTaddcitf = new JTextField();
		RTaddcitf.setColumns(10);
		RTaddcitf.setBounds(333, 540, 179, 50);
		contentPane.add(RTaddcitf);
		
		JButton bacck = new JButton("Back");
		bacck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin ast = new Admin();
				ast.setVisible(true);
				dispose();
			}
		});
		bacck.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bacck.setBounds(36, 618, 156, 42);
		contentPane.add(bacck);
	}
}
