import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class signUp extends JFrame{
	public signUp() {
		setVisible(true);
		setSize(402,397);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 384, 366);
		getContentPane().add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(365, 0, 17, 353);
		panel_1.add(scrollBar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(45, 161, 103, 14);
		panel_1.add(lblNewLabel);
		
	}
}
