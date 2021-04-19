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
			Font f=new Font("Arial",Font.BOLD,24);
			login_page_label=new JLabel("Login Page");
			login_page_label.setFont(f);
			userid_label=new JLabel("User Id");
			userid=new JTextField();
			password_label=new JLabel("Password");
			password=new JPasswordField();
			login_button2=new JButton("Login");
			login_page_label.setBounds(70,35,200,40);
			userid_label.setBounds(70,100,100,20);
			userid.setBounds(70,120,200,30); 
			password_label.setBounds(70,170,100,20);
			password.setBounds(70,190,200,30);
			login_button2.setBounds(170,309,100,30);
			getContentPane().add(login_page_label);
			getContentPane().add(userid_label);
			getContentPane().add(userid);
			getContentPane().add(password_label);
			getContentPane().add(password);
			getContentPane().add(login_button2);
			getContentPane().setLayout(null);
			String[] designation= {"Teacher","Student","Administration","Teaching Assistant" };
			comboBox = new JComboBox(designation);
			comboBox.setBounds(70, 259, 200, 30);
			getContentPane().add(comboBox);
			
			JLabel designation_label = new JLabel("Designation");
			designation_label.setBounds(70, 241, 76, 14);
			getContentPane().add(designation_label);
			setVisible(true);
			setSize(400,401);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			login_button2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					
					ResultSet rs;
					try 
					{
						//int i=1;
						//boolean bool=true;
						//Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "ororacle");
						Statement st=con.createStatement();
						String sql="select * from login_cred";
						//String sql="select * from login_cred where username='"+userid.getText()+"' and password='"+String.valueOf(password.getPassword())+"'";
						rs=st.executeQuery(sql);
						//rs.next();
						System.out.println(String.valueOf(password.getPassword())); 
						while(rs.next())
						{
							//System.out.println("hjelolo");
							String dum1=userid.getText(),dum2=rs.getString(1),dum3=rs.getString(2);
							String dum4 = new String(password.getPassword());
							//System.out.println(dum1);
							if(dum1.equals(dum2) && dum4.equals(dum3))
							{
								//System.out.println("hjelolo");
								//JOptionPane.showMessageDialog(null, "Logged in successfully");
								if((comboBox.getSelectedItem().toString()).equals("Student"))
								{
									//int dum3;
									//dum3=Integer.parseInt(dum1);
									//System.out.println("hjelolo");
									con.close();
									student ssst = new student(dum1);
									ssst.setVisible(true);
									//rs.absolute(1);
									//con.close();
									break;
									
									
								}
								if((comboBox.getSelectedItem().toString()).equals("Teacher"))
								{
									//int dum3;
									//dum3=Integer.parseInt(dum1);
									//System.out.println("hjelolo");
									con.close();
									Teacher ssst = new Teacher(dum1);
									ssst.setVisible(true);
									//rs.absolute(1);
									//con.close();
									break;
									
								}
								if((comboBox.getSelectedItem().toString()).equals("Administration"))
								{
									//int dum3;
									//dum3=Integer.parseInt(dum1);
									//System.out.println("hjelolo");
									con.close();
									Admin ssst = new Admin();
									ssst.setVisible(true);
									//rs.absolute(1);
									//con.close();
									break;
									
								}
								if((comboBox.getSelectedItem().toString()).equals("Teaching Assistant"))
								{
									//int dum3;
									//dum3=Integer.parseInt(dum1);
									//System.out.println("hjelolo");
									con.close();
									ta ssst = new ta(dum1);
									ssst.setVisible(true);
									//rs.absolute(1);
									//con.close();
									break;
									
								}
								
								
							}
								
						}
						
						dispose();
				    }
					catch (Exception e) {
						System.out.print(e);
					}
			
		}
	//public static void main(String[] args){
		//Login login=new Login();
	//}
});
		}
}