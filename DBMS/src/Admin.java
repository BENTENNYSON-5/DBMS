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
		
		JButton vstu = new JButton("Students");
		vstu.setFont(new Font("Tahoma", Font.PLAIN, 30));
		vstu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		vtea.setFont(new Font("Tahoma", Font.PLAIN, 30));
		vtea.setBounds(76, 206, 215, 102);
		getContentPane().add(vtea);
		
		JLabel adm_lb_3 = new JLabel("Change");
		adm_lb_3.setHorizontalAlignment(SwingConstants.CENTER);
		adm_lb_3.setFont(new Font("Tahoma", Font.PLAIN, 44));
		adm_lb_3.setBounds(879, 77, 165, 90);
		getContentPane().add(adm_lb_3);
		
		JButton vtas = new JButton("TAs");
		vtas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		vtas.setBounds(76, 368, 215, 102);
		getContentPane().add(vtas);
		
		JButton vcou = new JButton("Courses");
		vcou.setFont(new Font("Tahoma", Font.PLAIN, 30));
		vcou.setBounds(365, 368, 215, 102);
		getContentPane().add(vcou);
		
		JButton chcou = new JButton("Alter Course Details");
		chcou.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chcou.setBounds(705, 372, 215, 102);
		getContentPane().add(chcou);
		
		JButton chtea = new JButton("Recruit Teachers");
		chtea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		chtea.setFont(new Font("Tahoma", Font.PLAIN, 23));
		chtea.setBounds(705, 206, 215, 102);
		getContentPane().add(chtea);
		
		JButton chtas = new JButton("Allot TAs");
		chtas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		chtas.setBounds(999, 206, 215, 102);
		getContentPane().add(chtas);
		
		JButton chevent = new JButton("Manage Events");
		chevent.setFont(new Font("Tahoma", Font.PLAIN, 26));
		chevent.setBounds(999, 368, 215, 102);
		getContentPane().add(chevent);
		
		JButton vevent = new JButton("Events");
		vevent.setFont(new Font("Tahoma", Font.PLAIN, 30));
		vevent.setBounds(76, 535, 215, 102);
		getContentPane().add(vevent);
		
		JButton vjani = new JButton("Janitors");
		vjani.setFont(new Font("Tahoma", Font.PLAIN, 30));
		vjani.setBounds(365, 535, 215, 102);
		getContentPane().add(vjani);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
