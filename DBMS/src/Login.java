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
			login_page_label=new JLabel("LOGIN PAGE");
			login_page_label.setFont(new Font("Times New Roman", Font.BOLD, 38));
			userid_label=new JLabel("User Id");
			userid_label.setFont(new Font("Tahoma", Font.PLAIN, 30));
			userid=new JTextField();
			userid.setFont(new Font("Tahoma", Font.PLAIN, 24));
			password_label=new JLabel("Password");
			password_label.setFont(new Font("Tahoma", Font.PLAIN, 30));
			password=new JPasswordField();
			password.setFont(new Font("Tahoma", Font.PLAIN, 24));
			login_button2=new JButton("LOGIN");
			login_button2.setFont(new Font("Tahoma", Font.PLAIN, 40));
			login_page_label.setBounds(508,98,244,44);
			userid_label.setBounds(450,316,98,37);
			userid.setBounds(450,363,360,52); 
			password_label.setBounds(449,434,127,37);
			password.setBounds(450,481,360,52);
			login_button2.setBounds(544,599,182,57);
			getContentPane().add(login_page_label);
			getContentPane().add(userid_label);
			getContentPane().add(userid);
			getContentPane().add(password_label);
			getContentPane().add(password);
			getContentPane().add(login_button2);
			getContentPane().setLayout(null);
			String[] designation= {"Teacher","Student","Administration","Teaching Assistant" };
			comboBox = new JComboBox(designation);
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 30));
			comboBox.setBounds(449, 229, 361, 52);
			getContentPane().add(comboBox);
			
			JLabel designation_label = new JLabel("Designation");
			designation_label.setFont(new Font("Tahoma", Font.PLAIN, 30));
			designation_label.setBounds(448, 182, 158, 37);
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
			
			JButton login_button2_1 = new JButton("BACK");
			login_button2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					firstScreen fs= new firstScreen();
					fs.setVisible(true);
					dispose();
				}
			});
			login_button2_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
			login_button2_1.setBounds(74, 599, 182, 57);
			getContentPane().add(login_button2_1);
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