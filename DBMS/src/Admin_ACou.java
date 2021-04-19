import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//code
public class Admin_ACou extends JFrame {

	private JPanel contentPane;
	private JTextField AACCredits;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_ACou frame = new Admin_ACou();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Admin_ACou() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280,720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String[] CourseCombo = {"Mathematics","Biology","Physics","Chemistry","Economics","Commerce","English","German","French","Sanskrit"};
		JComboBox AACcomboBox = new JComboBox(CourseCombo);
		AACcomboBox.setFont(new Font("Tahoma", Font.PLAIN, 25));
		AACcomboBox.setBounds(541, 71, 242, 64);
		contentPane.add(AACcomboBox);
		
		JLabel lblNewLabel = new JLabel("Select Course");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(324, 71, 166, 64);
		contentPane.add(lblNewLabel);
		
		JLabel lblSetCredits = new JLabel("Set Credits");
		lblSetCredits.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSetCredits.setHorizontalAlignment(SwingConstants.CENTER);
		lblSetCredits.setBounds(324, 248, 166, 64);
		contentPane.add(lblSetCredits);
		
		AACCredits = new JTextField();
		AACCredits.setHorizontalAlignment(SwingConstants.CENTER);
		AACCredits.setFont(new Font("Tahoma", Font.PLAIN, 30));
		AACCredits.setBounds(541, 249, 203, 64);
		contentPane.add(AACCredits);
		AACCredits.setColumns(10);
		
		JButton AACDone = new JButton("Done");
		AACDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","ororacle");
					String credits=AACCredits.getText().toString();
					String cname= AACcomboBox.getSelectedItem().toString();
					String sql = "update course set credits = "+credits +" where cname = "+"'"+cname+"'";
					PreparedStatement ps = conn.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
					conn.close();
				}catch(Exception ex) {System.out.println(ex);}
				//querycode
				Admin AD = new Admin();
				AD.setVisible(true);
				dispose();
			}
		});
		AACDone.setFont(new Font("Tahoma", Font.PLAIN, 25));
		AACDone.setBounds(631, 439, 153, 52);
		contentPane.add(AACDone);
	}
}
