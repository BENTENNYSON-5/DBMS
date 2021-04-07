import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
public class Admin extends JFrame{
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
		
		JButton btnNewButton_4 = new JButton("Students");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(365, 206, 215, 102);
		getContentPane().add(btnNewButton_4);
		
		JLabel adm_lb_2 = new JLabel("View");
		adm_lb_2.setHorizontalAlignment(SwingConstants.CENTER);
		adm_lb_2.setFont(new Font("Tahoma", Font.PLAIN, 44));
		adm_lb_2.setBounds(264, 77, 118, 90);
		getContentPane().add(adm_lb_2);
		
		JButton btnNewButton_4_3 = new JButton("Teachers");
		btnNewButton_4_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_4_3.setBounds(76, 206, 215, 102);
		getContentPane().add(btnNewButton_4_3);
		
		JLabel adm_lb_3 = new JLabel("Change");
		adm_lb_3.setHorizontalAlignment(SwingConstants.CENTER);
		adm_lb_3.setFont(new Font("Tahoma", Font.PLAIN, 44));
		adm_lb_3.setBounds(879, 77, 165, 90);
		getContentPane().add(adm_lb_3);
		
		JButton btnNewButton_4_3_1 = new JButton("TAs");
		btnNewButton_4_3_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_4_3_1.setBounds(76, 368, 215, 102);
		getContentPane().add(btnNewButton_4_3_1);
		
		JButton btnNewButton_4_3_3 = new JButton("Courses");
		btnNewButton_4_3_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_4_3_3.setBounds(365, 368, 215, 102);
		getContentPane().add(btnNewButton_4_3_3);
		
		JButton btnNewButton_4_3_5 = new JButton("Alter Course Details");
		btnNewButton_4_3_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4_3_5.setBounds(705, 368, 215, 102);
		getContentPane().add(btnNewButton_4_3_5);
		
		JButton btnNewButton_4_3_6 = new JButton("Recruit Teachers");
		btnNewButton_4_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_3_6.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_4_3_6.setBounds(705, 206, 215, 102);
		getContentPane().add(btnNewButton_4_3_6);
		
		JButton btnNewButton_4_3_2 = new JButton("Allot TAs");
		btnNewButton_4_3_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_4_3_2.setBounds(999, 206, 215, 102);
		getContentPane().add(btnNewButton_4_3_2);
		
		JButton btnNewButton_4_3_4 = new JButton("Manage Events");
		btnNewButton_4_3_4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton_4_3_4.setBounds(999, 368, 215, 102);
		getContentPane().add(btnNewButton_4_3_4);
		
		JButton btnNewButton_4_3_7 = new JButton("Events");
		btnNewButton_4_3_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_4_3_7.setBounds(224, 536, 215, 102);
		getContentPane().add(btnNewButton_4_3_7);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
