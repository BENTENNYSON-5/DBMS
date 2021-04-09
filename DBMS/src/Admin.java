import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
public class Admin extends JFrame{
	private String s;
	public Admin() {
		setSize(1280,720);
		getContentPane().setLayout(null);
		JLabel adm_lb_1 = new JLabel("ADMIN HOME");
		adm_lb_1.setForeground(Color.RED);
		adm_lb_1.setBackground(Color.YELLOW);
		adm_lb_1.setHorizontalAlignment(SwingConstants.CENTER);
		adm_lb_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		adm_lb_1.setBounds(10, 10, 1234, 55);
		getContentPane().add(adm_lb_1);
		JButton vstu = new JButton("Students");
		vstu.setFont(new Font("Tahoma", Font.PLAIN, 30));
		vstu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = "STUDENTS ";
				Admin_View adv = new Admin_View();
				JLabel Ad_v_info_label = new JLabel(s + "INFORMATION");
				Ad_v_info_label.setBackground(Color.YELLOW);
				Ad_v_info_label.setHorizontalAlignment(SwingConstants.CENTER);
				Ad_v_info_label.setForeground(Color.RED);
				Ad_v_info_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
				Ad_v_info_label.setBounds(27, 10, 1229, 46);
				adv.contentPane.add(Ad_v_info_label);
				adv.Ad_v_edit.setVisible(false);
				//querycodetable
				adv.setVisible(true);
				dispose();
			}
		});
		vstu.setBounds(365, 206, 215, 102);
		getContentPane().add(vstu);
		
		JLabel adm_lb_2 = new JLabel("View");
		adm_lb_2.setHorizontalAlignment(SwingConstants.CENTER);
		adm_lb_2.setFont(new Font("Tahoma", Font.PLAIN, 44));
		adm_lb_2.setBounds(264, 77, 118, 90);
		getContentPane().add(adm_lb_2);
		
		JButton vtea = new JButton("Teachers");
		vtea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = "TEACHERS ";
				Admin_View adv = new Admin_View();
				JLabel Ad_v_info_label = new JLabel(s + "INFORMATION");
				Ad_v_info_label.setBackground(Color.YELLOW);
				Ad_v_info_label.setHorizontalAlignment(SwingConstants.CENTER);
				Ad_v_info_label.setForeground(Color.RED);
				Ad_v_info_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
				Ad_v_info_label.setBounds(27, 10, 1229, 46);
				adv.contentPane.add(Ad_v_info_label);
				//querycodetable
				adv.setVisible(true);
				dispose();
			}
		});
		vtea.setFont(new Font("Tahoma", Font.PLAIN, 30));
		vtea.setBounds(76, 206, 215, 102);
		getContentPane().add(vtea);
		
		JLabel adm_lb_3 = new JLabel("Change");
		adm_lb_3.setHorizontalAlignment(SwingConstants.CENTER);
		adm_lb_3.setFont(new Font("Tahoma", Font.PLAIN, 44));
		adm_lb_3.setBounds(879, 77, 165, 90);
		getContentPane().add(adm_lb_3);
		
		JButton vtas = new JButton("TAs");
		vtas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = "TAs ";
				Admin_View adv = new Admin_View();
				JLabel Ad_v_info_label = new JLabel(s + "INFORMATION");
				Ad_v_info_label.setBackground(Color.YELLOW);
				Ad_v_info_label.setHorizontalAlignment(SwingConstants.CENTER);
				Ad_v_info_label.setForeground(Color.RED);
				Ad_v_info_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
				Ad_v_info_label.setBounds(27, 10, 1229, 46);
				adv.contentPane.add(Ad_v_info_label);
				//querycodetable
				adv.setVisible(true);
				dispose();
			}
		});
		vtas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		vtas.setBounds(76, 368, 215, 102);
		getContentPane().add(vtas);
		
		JButton vcou = new JButton("Courses");
		vcou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = "COURSES ";
				Admin_View adv = new Admin_View();
				JLabel Ad_v_info_label = new JLabel(s + "INFORMATION");
				Ad_v_info_label.setBackground(Color.YELLOW);
				Ad_v_info_label.setHorizontalAlignment(SwingConstants.CENTER);
				Ad_v_info_label.setForeground(Color.RED);
				Ad_v_info_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
				Ad_v_info_label.setBounds(27, 10, 1229, 46);
				adv.contentPane.add(Ad_v_info_label);
				//querycodetable
				adv.setVisible(true);
				dispose();
			}
		});
		vcou.setFont(new Font("Tahoma", Font.PLAIN, 30));
		vcou.setBounds(365, 368, 215, 102);
		getContentPane().add(vcou);
		
		JButton chcou = new JButton("Alter Course Details");
		chcou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_ACou aac = new Admin_ACou();
				aac.setVisible(true);
				dispose();
			}
		});
		chcou.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chcou.setBounds(705, 372, 215, 102);
		getContentPane().add(chcou);
		
		JButton chtea = new JButton("Recruit Teachers");
		chtea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_RT art = new Admin_RT();
				art.setVisible(true);
				dispose();
			}
		});
		chtea.setFont(new Font("Tahoma", Font.PLAIN, 23));
		chtea.setBounds(705, 206, 215, 102);
		getContentPane().add(chtea);
		
		JButton chtas = new JButton("Allot TAs");
		chtas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_ATA ata = new Admin_ATA();
				ata.setVisible(true);
				dispose();
			}
		});
		chtas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chtas.setBounds(999, 206, 215, 102);
		getContentPane().add(chtas);
		
		JButton chevent = new JButton("Manage Events");
		chevent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_EVE aev = new Admin_EVE();
				aev.setVisible(true);
				dispose();
			}
		});
		chevent.setFont(new Font("Tahoma", Font.PLAIN, 26));
		chevent.setBounds(999, 368, 215, 102);
		getContentPane().add(chevent);
		
		JButton vevent = new JButton("Events");
		vevent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = "EVENTS ";
				Admin_View adv = new Admin_View();
				JLabel Ad_v_info_label = new JLabel(s + "INFORMATION");
				Ad_v_info_label.setBackground(Color.YELLOW);
				Ad_v_info_label.setHorizontalAlignment(SwingConstants.CENTER);
				Ad_v_info_label.setForeground(Color.RED);
				Ad_v_info_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
				Ad_v_info_label.setBounds(27, 10, 1229, 46);
				adv.contentPane.add(Ad_v_info_label);
				//querycodetable
				adv.setVisible(true);
				dispose();
			}
		});
		vevent.setFont(new Font("Tahoma", Font.PLAIN, 30));
		vevent.setBounds(76, 535, 215, 102);
		getContentPane().add(vevent);
		
		JButton vjani = new JButton("Janitors");
		vjani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = "JANITORS ";
				Admin_View adv = new Admin_View();
				JLabel Ad_v_info_label = new JLabel(s + "INFORMATION");
				Ad_v_info_label.setBackground(Color.YELLOW);
				Ad_v_info_label.setHorizontalAlignment(SwingConstants.CENTER);
				Ad_v_info_label.setForeground(Color.RED);
				Ad_v_info_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
				Ad_v_info_label.setBounds(27, 10, 1229, 46);
				adv.contentPane.add(Ad_v_info_label);
				adv.Ad_v_edit.setVisible(false);
				//querycodetable
				adv.setVisible(true);
				dispose();
			}
		});
		vjani.setFont(new Font("Tahoma", Font.PLAIN, 30));
		vjani.setBounds(365, 535, 215, 102);
		getContentPane().add(vjani);
		
		JButton Alogout = new JButton("LOGOUT");
		Alogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg = new Login();
				lg.setVisible(true);
				dispose();
			}
		});
		Alogout.setBackground(Color.YELLOW);
		Alogout.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Alogout.setForeground(Color.RED);
		Alogout.setBounds(1082, 584, 132, 53);
		getContentPane().add(Alogout);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin adframe = new Admin();
					adframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
