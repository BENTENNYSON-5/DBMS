import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class firstScreen extends JFrame{
	
	public firstScreen() {
		getContentPane().setBackground(Color.CYAN);
		getContentPane().setLayout(null);
		
		JButton login_button1 = new JButton("LOGIN");
		login_button1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		login_button1.setBounds(538, 203, 217, 77);
		getContentPane().add(login_button1);
		
		JButton signup_button1 = new JButton("SIGNUP");
		signup_button1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		signup_button1.setBounds(538, 326, 217, 87);
		getContentPane().add(signup_button1);
		setVisible(true);
		setSize(1280,720);
		
		login_button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				new Login();
				dispose();
			}
		});
	
	signup_button1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			new signUp();
			dispose();
		}
	});
}
	public static void main(String[] args){
		firstScreen FirstScreen=new firstScreen();
	}

}
