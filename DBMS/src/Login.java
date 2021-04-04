import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Login extends JFrame{
		JLabel l1,l2,l3,l4;
		JTextField t1,t4;
		JPasswordField t2;
		JButton b1;
		Login(){
			Font f=new Font("Arial",Font.BOLD,24);
			l1=new JLabel("Login Page");
			l1.setFont(f);
			l2=new JLabel("UserName");
			t1=new JTextField();
			l3=new JLabel("Password");
			t2=new JPasswordField();
			b1=new JButton("Login");
			l1.setBounds(70,35,200,40);
			l2.setBounds(70,100,100,20);
			t1.setBounds(70,120,200,30); 
			l3.setBounds(70,170,100,20);
			t2.setBounds(70,190,200,30);
			b1.setBounds(170,309,100,30);
			getContentPane().add(l1);
			getContentPane().add(l2);
			getContentPane().add(t1);
			getContentPane().add(l3);
			getContentPane().add(t2);
			getContentPane().add(b1);
			getContentPane().setLayout(null);
			setVisible(true);
			setSize(400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					System.out.println(t1.getText());
					System.out.println(t2.getText());
				}
			});
		}
	public static void main(String[] args){
		Login login=new Login();
	}
}