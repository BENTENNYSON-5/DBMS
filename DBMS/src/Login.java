import javax.swing.*;



import java.awt.*;



import java.awt.Font;
import java.awt.desktop.PrintFilesEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.sql.*;
class Login extends JFrame{
		JLabel login_page_label,userid_label,password_label,l4;
		JTextField userid,t4;
		JPasswordField password;
		JButton login_button2;
		JComboBox comboBox;
		Login(){
			getContentPane().setBackground(Color.CYAN);
			Font f=new Font("Arial",Font.BOLD,24);
			login_page_label=new JLabel("Login Page");
			login_page_label.setFont(f);
			userid_label=new JLabel("User Id");
			userid=new JTextField();
			password_label=new JLabel("Password");
			password=new JPasswordField();
			login_button2=new JButton("Login");
			login_page_label.setBounds(562,107,136,28);
			userid_label.setBounds(535,160,100,20);
			userid.setBounds(535,190,200,30); 
			password_label.setBounds(535,240,100,20);
			password.setBounds(535,270,200,30);
			login_button2.setBounds(586,400,100,30);
			getContentPane().add(login_page_label);
			getContentPane().add(userid_label);
			getContentPane().add(userid);
			getContentPane().add(password_label);
			getContentPane().add(password);
			getContentPane().add(login_button2);
			getContentPane().setLayout(null);
			String[] designation= {"Teacher","Student","Administration","Teaching Assistant" };
			comboBox = new JComboBox(designation);
			comboBox.setBounds(535, 350, 200, 30);
			getContentPane().add(comboBox);
			
			JLabel designation_label = new JLabel("Designation");
			designation_label.setBounds(535, 320, 76, 14);
			getContentPane().add(designation_label);
			
			JPanel login_heading_panel = new JPanel();
			login_heading_panel.setBackground(Color.YELLOW);
			login_heading_panel.setBounds(0, 0, 1266, 65);
			getContentPane().add(login_heading_panel);
			login_heading_panel.setLayout(null);
			
			JLabel login_heading = new JLabel("College Management System ");
			login_heading.setBounds(370, 10, 614, 46);
			login_heading_panel.add(login_heading);
			login_heading.setForeground(Color.RED);
			login_heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
			setVisible(true);
			setSize(1280,720);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			login_button2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					
					ResultSet rs;
					try 
					{
						Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "ororacle");
						Statement st=con.createStatement();
						String sql="select * from login_cred";
						rs=st.executeQuery(sql);
						System.out.println(String.valueOf(password.getPassword())); 
						while(rs.next())
						{
							String dum1=userid.getText(),dum2=rs.getString(1),dum3=rs.getString(2);
							String dum4 = new String(password.getPassword());
							if(dum1.equals(dum2) && dum4.equals(dum3))
							{
								if((comboBox.getSelectedItem().toString()).equals("Student"))
								{
									JOptionPane.showMessageDialog(null, "Logged in successfully");
									con.close();
									student ssst = new student(dum1);
									ssst.setVisible(true);
									dispose();
									break;
									
									
								}
								if((comboBox.getSelectedItem().toString()).equals("Teacher"))
								{
									JOptionPane.showMessageDialog(null, "Logged in successfully");
									con.close();
									Teacher ssst = new Teacher(dum1);
									ssst.setVisible(true);
									dispose();
									break;
									
								}
								if((comboBox.getSelectedItem().toString()).equals("Administration"))
								{
									JOptionPane.showMessageDialog(null, "Logged in successfully");
									con.close();
									Admin ssst = new Admin();
									ssst.setVisible(true);
									dispose();
									break;
									
								}
								if((comboBox.getSelectedItem().toString()).equals("Teaching Assistant"))
								{
									JOptionPane.showMessageDialog(null, "Logged in successfully");
									con.close();
									ta ssst = new ta(dum1);
									ssst.setVisible(true);
									dispose();
									break;
								}
							}	
						}
						if(rs.next())
						{
							
						}
						else {
							JOptionPane.showMessageDialog(null, "Invalid username or password");
							
						}
						
						dispose();
				    }
					catch (Exception e) {
						System.out.print(e);
					}
			
		}
});
		}
}