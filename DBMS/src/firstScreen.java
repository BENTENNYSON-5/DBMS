import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class firstScreen extends JFrame{
	
	public firstScreen() {
		getContentPane().setBackground(new Color(0, 255, 204));
		getContentPane().setLayout(null);
		
		JButton login_button1 = new JButton("LOGIN");
		login_button1.setForeground(Color.BLACK);
		login_button1.setBackground(Color.WHITE);
		login_button1.setFont(new Font("Tahoma", Font.PLAIN, 43));
		login_button1.setBounds(538, 244, 217, 77);
		getContentPane().add(login_button1);
		
		JButton signup_button1 = new JButton("REGISTER");
		signup_button1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		signup_button1.setBounds(538, 389, 217, 87);
		getContentPane().add(signup_button1);
		
		JPanel first_screen_heading_panel = new JPanel();
		first_screen_heading_panel.setLayout(null);
		first_screen_heading_panel.setBackground(Color.YELLOW);
		first_screen_heading_panel.setBounds(0, 0, 1266, 65);
		getContentPane().add(first_screen_heading_panel);
		
		JLabel first_screen_heading = new JLabel("College Management System ");
		first_screen_heading.setForeground(Color.RED);
		first_screen_heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		first_screen_heading.setBounds(370, 10, 614, 46);
		first_screen_heading_panel.add(first_screen_heading);
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
