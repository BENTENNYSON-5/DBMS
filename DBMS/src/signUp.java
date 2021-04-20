import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class signUp extends JFrame{
	private JTextField Pswd;
	private JTextField fname;
	private JTextField lname;
	private JTextField age;
	private JTextField dno;
	private JTextField street;
	private JTextField City;
	public signUp() {
		getContentPane().setBackground(Color.CYAN);
		setVisible(true);
		setSize(1280,720);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BRANCH");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(70, 95, 156, 45);
		getContentPane().add(lblNewLabel);
		String[] Stri = {"MPC","BiPC" ,"MEC"};
		JComboBox cb = new JComboBox(Stri);
		cb.setFont(new Font("Tahoma", Font.PLAIN, 30));
		cb.setBounds(225, 92, 313, 45);
		getContentPane().add(cb);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(338, 190, 156, 45);
		getContentPane().add(lblNewLabel_1);
		
		Pswd = new JTextField();
		Pswd.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Pswd.setBounds(643, 199, 181, 27);
		getContentPane().add(Pswd);
		Pswd.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Language");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(680, 92, 156, 45);
		getContentPane().add(lblNewLabel_2);
		String[] stt = {"German", "French", "Sanskrit"};
		JComboBox cb2 = new JComboBox(stt);
		cb2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		cb2.setBounds(870, 92, 313, 45);
		getContentPane().add(cb2);
		
		JLabel lblNewLabel_1_1 = new JLabel("FirstName");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(338, 245, 156, 45);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("LastName");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_2.setBounds(338, 300, 156, 45);
		getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Age");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_3.setBounds(338, 355, 156, 45);
		getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Dno");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_4.setBounds(338, 410, 156, 45);
		getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Street");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_5.setBounds(338, 465, 156, 45);
		getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("City");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_6.setBounds(338, 520, 156, 45);
		getContentPane().add(lblNewLabel_1_6);
		
		fname = new JTextField();
		fname.setFont(new Font("Tahoma", Font.PLAIN, 22));
		fname.setColumns(10);
		fname.setBounds(643, 254, 181, 27);
		getContentPane().add(fname);
		
		lname = new JTextField();
		lname.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lname.setColumns(10);
		lname.setBounds(643, 309, 181, 27);
		getContentPane().add(lname);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 22));
		age.setColumns(10);
		age.setBounds(643, 364, 181, 27);
		getContentPane().add(age);
		
		dno = new JTextField();
		dno.setFont(new Font("Tahoma", Font.PLAIN, 22));
		dno.setColumns(10);
		dno.setBounds(643, 419, 181, 27);
		getContentPane().add(dno);
		
		street = new JTextField();
		street.setFont(new Font("Tahoma", Font.PLAIN, 22));
		street.setColumns(10);
		street.setBounds(643, 473, 181, 27);
		getContentPane().add(street);
		
		City = new JTextField();
		City.setFont(new Font("Tahoma", Font.PLAIN, 22));
		City.setColumns(10);
		City.setBounds(643, 529, 181, 27);
		getContentPane().add(City);
		
		JButton SignUP = new JButton("REGISTER");
		SignUP.setFont(new Font("Tahoma", Font.PLAIN, 30));
		SignUP.setBounds(495, 613, 171, 45);
		getContentPane().add(SignUP);
		
		JButton back = new JButton("BACK");
		back.setFont(new Font("Tahoma", Font.PLAIN, 30));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login llg = new Login();
				llg.setVisible(true);
				dispose();
			}
		});
		back.setBounds(1027, 196, 156, 42);
		getContentPane().add(back);
		
		JPanel login_heading_panel = new JPanel();
		login_heading_panel.setLayout(null);
		login_heading_panel.setBackground(Color.YELLOW);
		login_heading_panel.setBounds(0, 0, 1266, 65);
		getContentPane().add(login_heading_panel);
		
		JLabel login_heading = new JLabel("College Management System ");
		login_heading.setForeground(Color.RED);
		login_heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		login_heading.setBounds(370, 10, 614, 46);
		login_heading_panel.add(login_heading);
		SignUP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					/*maths 101
					 * bio102
					 * phy103
					 * chem104
					 * eco105
					 * comme106
					 * eng107
					 * ger108
					 * fre109
					 * sans110
					 * */
					ResultSet rss;
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","ororacle");
					String pswdd = Pswd.getText().toString();
					String  ffname=fname.getText().toString();
					String llname = lname.getText().toString();
					String aage = age.getText().toString();
					String ddno= dno.getText().toString();
					String str =street.getText().toString();
					String city=City.getText().toString();
					String sql = "select Max(sid) from student";
					PreparedStatement ps = conn.prepareStatement(sql);
					rss = ps.executeQuery();
					rss.next();
					int id = rss.getInt(1);
					id++;
					String sqla = "select bvno,count(bvno) from student group by bvno";
					PreparedStatement pss = conn.prepareStatement(sqla);
					rss = pss.executeQuery();
					int bv=0 ;
					String bvv="";
					while(rss.next()) {
						if(rss.getInt(2)<=20) {
							bv = 3;
							bvv = "Laxmi";
						}else if(rss.getInt(2)<=40) {
							bv = 2;
							bvv = "Gitanjali";
						}else if(rss.getInt(2)<=60) {
							bv = 1;
							bvv = "Parimala";
						}
						}
					String sqll = "insert into student values("+id+","+"'"+ffname+"'"+","+"'"+llname+"'"+","+ddno+","+"'"+str+"'"+","+"'"+city+"'"+","+bv+","+aage+")";
					PreparedStatement psss = conn.prepareStatement(sqll);
					rss = psss.executeQuery();
					String s="";
					String ss="";
					String sss="";
					String ssss ="";
					if((cb.getSelectedItem().toString()).equals("MPC")){
						s = "insert into stu_cour values("+id+","+101+")";
						ss = "insert into stu_cour values("+id+","+103+")";
						sss = "insert into stu_cour values("+id+","+104+")";
						ssss = "insert into stu_cour values("+id+","+107+")";
					}else if((cb.getSelectedItem().toString()).equals("BiPC")) {
						s = "insert into stu_cour values("+id+","+102+")";
						ss = "insert into stu_cour values("+id+","+103+")";
						sss = "insert into stu_cour values("+id+","+104+")";
						ssss = "insert into stu_cour values("+id+","+107+")";
					}else if((cb.getSelectedItem().toString()).equals("MEC")) {
						s = "insert into stu_cour values("+id+","+101+")";
						ss = "insert into stu_cour values("+id+","+105+")";
						sss = "insert into stu_cour values("+id+","+106+")";
						ssss = "insert into stu_cour values("+id+","+107+")";
					}
					String sg ="";
					if((cb2.getSelectedItem().toString()).equals("German")){
						sg = "insert into stu_cour values("+id+","+108+")";
					}else if((cb2.getSelectedItem().toString()).equals("French")) {
						sg = "insert into stu_cour values("+id+","+109+")";
					}else if((cb2.getSelectedItem().toString()).equals("Sanskrit")) {
						sg = "insert into stu_cour values("+id+","+110+")";
					}
					PreparedStatement pty = conn.prepareStatement(s);
					rss = pty.executeQuery();
					PreparedStatement ptyy = conn.prepareStatement(ss);
					rss = ptyy.executeQuery();
					PreparedStatement ptyyy = conn.prepareStatement(sss);
					rss = ptyyy.executeQuery();
					PreparedStatement ptyt = conn.prepareStatement(ssss);
					rss = ptyt.executeQuery();
					PreparedStatement ptytt = conn.prepareStatement(sg);
					rss = ptytt.executeQuery();
					JOptionPane.showMessageDialog(null,"Your USERNAME is "+id+" and your allocated bhavan is "+ bvv);
					String sqs = "insert into login_cred values("+id+",'"+pswdd+"')";
					PreparedStatement ptty = conn.prepareStatement(sqs);
					rss = ptty.executeQuery();
					String tg ="insert into marks values("+id+",'','','','','')";
					PreparedStatement ttp = conn.prepareStatement(tg);
					rss = ttp.executeQuery();
					Login lg = new Login();
					lg.setVisible(true);
					dispose();
				}catch(Exception er) {System.out.println(er);}
			}
		});
		
	}
}
