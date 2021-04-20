import javax.swing.*;
//code
import java.sql.*;
import javax.swing.table.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
public class Admin extends JFrame{
	private String s;
	public Admin() {
		getContentPane().setBackground(Color.CYAN);
		setSize(1280,720);
		getContentPane().setLayout(null);
		JLabel adm_lb_1 = new JLabel("HOME");
		adm_lb_1.setForeground(Color.RED);
		adm_lb_1.setBackground(Color.YELLOW);
		adm_lb_1.setHorizontalAlignment(SwingConstants.CENTER);
		adm_lb_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		adm_lb_1.setBounds(525, 77, 186, 37);
		getContentPane().add(adm_lb_1);
		JButton vstu = new JButton("Students");
		vstu.setFont(new Font("Tahoma", Font.PLAIN, 30));
		vstu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//done
				String[][] data = new String[60][7];
				int i = 0;
				s = "STUDENTS ";
				Admin_View adv = new Admin_View();
				JLabel Ad_v_info_label = new JLabel(s + "INFORMATION");
				Ad_v_info_label.setBackground(Color.YELLOW);
				Ad_v_info_label.setHorizontalAlignment(SwingConstants.CENTER);
				Ad_v_info_label.setForeground(Color.RED);
				Ad_v_info_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
				Ad_v_info_label.setBounds(27, 70, 1229, 46);
				adv.contentPane.add(Ad_v_info_label);
				//querycodetable
				try {
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","ororacle");
					String sql = "select sid,sname,sage,sdno,sstr,scity,bname from student,bhavan where bvno = bid";
					PreparedStatement ps = conn.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
			    	String stt[] = {"ID","Name","Age","Dno","Street","City","Bhavan"};//column names
				    while(rs.next()){
						String st1 = String.valueOf(rs.getInt("sid"));
						String st2=rs.getString("sname");
						String st3 = String.valueOf(rs.getInt("sage"));
						String st4 = String.valueOf(rs.getInt("sdno"));
						String st5 = rs.getString("sstr");
						String st6 = rs.getString("scity");
						String st7 = rs.getString("bname");
                        data[i][0]= st1;
                        data[i][1]= st2;
                        data[i][2]= st3;
                        data[i][3]= st4;
                        data[i][4]= st5;
                        data[i][5]= st6;
                        data[i][6]= st7;
                        i++;
				    }
				    JTable table = new JTable(data,stt){
				        public boolean isCellEditable(int row, int column) {                
				                return false;               
				        };
				    };
                    JScrollPane jsp = new JScrollPane(table);
					adv.jjpanel.add(jsp);
					conn.close();
				}catch(Exception ex) {System.out.println(ex);}
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
				//done
				String[][] data = new String[12][10];
				int i =0;
				s = "TEACHERS ";
				Admin_View adv = new Admin_View();
				JLabel Ad_v_info_label = new JLabel(s + "INFORMATION");
				Ad_v_info_label.setBackground(Color.YELLOW);
				Ad_v_info_label.setHorizontalAlignment(SwingConstants.CENTER);
				Ad_v_info_label.setForeground(Color.RED);
				Ad_v_info_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
				Ad_v_info_label.setBounds(27, 70, 1229, 46);
				adv.contentPane.add(Ad_v_info_label);
				//querycodetable
				try {
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","ororacle");
					//error
					String sql = " select tid,tname,tlname,tdno,tstr,tcity,tage,tsal,cname,dname from teacher ,course ,depnt where cono  = cid and depntno = depntid";
					PreparedStatement ps = conn.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
			    	String stt[] = {"ID","Fname","LName","Age","DoorNo","Street","City","Salary","Course","Dept"};
				    while(rs.next()){
						String st1 = String.valueOf(rs.getInt("tid"));
						String st2=rs.getString("tname");
						String st3 = rs.getString("tlname");
						String st4 = String.valueOf(rs.getInt("tage"));
						String st5 = String.valueOf(rs.getInt("tdno"));
						String st6 = rs.getString("tstr");
						String st7 = rs.getString("tcity");
						String st8 = rs.getString("tsal");
						String st9 = rs.getString("cname");
						String st10 = rs.getString("dname");
                        data[i][0]= st1;
                        data[i][1]= st2;
                        data[i][2]= st3;
                        data[i][3]= st4;
                        data[i][4]= st5;
                        data[i][5]= st6;
                        data[i][6]= st7;
                        data[i][7]= st8;
                        data[i][8]= st9;
                        data[i][9]= st10;
                        i++;
				    }
				    JTable table = new JTable(data,stt){
				        public boolean isCellEditable(int row, int column) {                
				                return false;               
				        };
				    };
                    JScrollPane jsp = new JScrollPane(table);
					adv.jjpanel.add(jsp);
					conn.close();
				}catch(Exception ex) {System.out.println(ex);}
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
				String[][] data = new String[10][4];
				int i = 0;
				s = "TAs ";
				Admin_View adv = new Admin_View();
				JLabel Ad_v_info_label = new JLabel(s + "INFORMATION");
				Ad_v_info_label.setBackground(Color.YELLOW);
				Ad_v_info_label.setHorizontalAlignment(SwingConstants.CENTER);
				Ad_v_info_label.setForeground(Color.RED);
				Ad_v_info_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
				Ad_v_info_label.setBounds(27, 70, 1229, 46);
				adv.contentPane.add(Ad_v_info_label);
				//querycodetable
				try {
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","ororacle");
					String sql = "select cname,taname,taage,tasal from course,teach_assistant where cno = cid";
					PreparedStatement ps = conn.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
			    	String stt[] = {"Course","Name","Age","Salary"};//column names
				    while(rs.next()){
						String st1=rs.getString("cname");
						String st2 = rs.getString("taname");
						String st3 = String.valueOf(rs.getInt("taage"));
						String st4 = String.valueOf(rs.getInt("tasal"));
                        data[i][0]= st1;
                        data[i][1]= st2;
                        data[i][2]= st3;
                        data[i][3]= st4;
                        i++;
				    }
				    JTable table = new JTable(data,stt){
				        public boolean isCellEditable(int row, int column) {                
				                return false;               
				        };
				    };
                    JScrollPane jsp = new JScrollPane(table);
					adv.jjpanel.add(jsp);
					conn.close();
			}catch(Exception ex) {System.out.println(ex);}
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
				//done
				String[][] data = new String[10][3];
				int i = 0;
				s = "COURSES ";
				Admin_View adv = new Admin_View();
				JLabel Ad_v_info_label = new JLabel(s + "INFORMATION");
				Ad_v_info_label.setBackground(Color.YELLOW);
				Ad_v_info_label.setHorizontalAlignment(SwingConstants.CENTER);
				Ad_v_info_label.setForeground(Color.RED);
				Ad_v_info_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
				Ad_v_info_label.setBounds(27, 70, 1229, 46);
				adv.contentPane.add(Ad_v_info_label);
				//querycodetable
				try {
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","ororacle");
					String sql = "select * from course";
					PreparedStatement ps = conn.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
			    	String stt[] = {"ID","Name","Credits"};
				    while(rs.next()){
						String st1 = String.valueOf(rs.getInt("cid"));
						String st2=rs.getString("cname");
						String st3 = String.valueOf(rs.getInt("credits"));
                        data[i][0]= st1;
                        data[i][1]= st2;
                        data[i][2]= st3;
                        i++;
				    }
				    JTable table = new JTable(data,stt){
				        public boolean isCellEditable(int row, int column) {                
				                return false;               
				        };
				    };
                    JScrollPane jsp = new JScrollPane(table);
					adv.jjpanel.add(jsp);
					conn.close();
				}catch(Exception ex) {System.out.println(ex);}
				adv.setVisible(true);
				dispose();
			}
		});
		vcou.setFont(new Font("Tahoma", Font.PLAIN, 30));
		vcou.setBounds(365, 368, 215, 102);
		getContentPane().add(vcou);
		
		JButton chcou = new JButton("Alter Course Credits");
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
				//done
				String[][] data = new String[20][6];
				int i=0;
				s = "EVENTS ";//only for this eco is displayed instead of student name
				Admin_View adv = new Admin_View();
				JLabel Ad_v_info_label = new JLabel(s + "INFORMATION");
				Ad_v_info_label.setBackground(Color.YELLOW);
				Ad_v_info_label.setHorizontalAlignment(SwingConstants.CENTER);
				Ad_v_info_label.setForeground(Color.RED);
				Ad_v_info_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
				Ad_v_info_label.setBounds(27, 70, 1229, 46);
				adv.contentPane.add(Ad_v_info_label);
				//querycodetable
				try {
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","ororacle");
					String sql = "select * from event";
					PreparedStatement ps = conn.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
			    	String stt[] = {"ID","Name","Start","End","Fee","EcoID"};
				    while(rs.next()){
						String eid = String.valueOf(rs.getInt("eid"));
						String ename =rs.getString("ename");
						String strdate = String.valueOf(rs.getDate("strdate"));
						String enddate = String.valueOf(rs.getDate("enddate"));
						String efee = String.valueOf(rs.getInt("efee"));
						String eco = String.valueOf(rs.getInt("eco"));
                        data[i][0]= eid;
                        data[i][1]= ename;
                        data[i][2]= strdate;
                        data[i][3]= enddate;
                        data[i][4]= efee;
                        data[i][5]= eco;
                        i++;
				    }
				    JTable table = new JTable(data,stt){
				        public boolean isCellEditable(int row, int column) {                
				                return false;               
				        };
				    };
                    JScrollPane jsp = new JScrollPane(table);
					adv.jjpanel.add(jsp);
					conn.close();
				}catch(Exception ex) {System.out.println(ex);}
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
				//done
				String[][] data = new String[6][5];
				int i =0;
				s = "JANITORS ";
				Admin_View adv = new Admin_View();
				JLabel Ad_v_info_label = new JLabel(s + "INFORMATION");
				Ad_v_info_label.setBackground(Color.YELLOW);
				Ad_v_info_label.setHorizontalAlignment(SwingConstants.CENTER);
				Ad_v_info_label.setForeground(Color.RED);
				Ad_v_info_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
				Ad_v_info_label.setBounds(27, 70, 1229, 46);
				adv.contentPane.add(Ad_v_info_label);
				//querycodetable
				try {
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","ororacle");
					String sql = "select jid,jname,salary,age,bname from janitor, bhavan where bvid = bid";
					PreparedStatement ps = conn.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
			    	String stt[] = {"ID","Name","Salary","Age","Bhavan"};
				    while(rs.next()){
						String st1 = String.valueOf(rs.getInt("jid"));
						String st2 =rs.getString("jname");
						String st3 = String.valueOf(rs.getInt("salary"));
						String st4 = String.valueOf(rs.getInt("age"));
						String st5 = rs.getString("bname"); 
						data[i][0]= st1;
                        data[i][1]= st2;
                        data[i][2]= st3;
                        data[i][3]= st4;
                        data[i][4]= st5;
                        i++;
				    }
				    JTable table = new JTable(data,stt){
				        public boolean isCellEditable(int row, int column) {                
				                return false;               
				        };
				    };
                    JScrollPane jsp = new JScrollPane(table);
					adv.jjpanel.add(jsp);
					conn.close();
				}catch(Exception ex) {System.out.println(ex);}
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
		
		JPanel tea_headingPanel = new JPanel();
		tea_headingPanel.setLayout(null);
		tea_headingPanel.setBackground(Color.YELLOW);
		tea_headingPanel.setBounds(0, 0, 1266, 65);
		getContentPane().add(tea_headingPanel);
		
		JLabel tea_heading = new JLabel("Admin Management System ");
		tea_heading.setForeground(Color.RED);
		tea_heading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		tea_heading.setBounds(367, 10, 614, 46);
		tea_headingPanel.add(tea_heading);
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
