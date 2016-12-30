import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SeatHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
	JButton[] button=new JButton[40];
	JFrame frm=new JFrame();
	frm.setTitle("×ùÎ»");
	GridLayout gridlayout=new GridLayout(5,8);
	frm.setLayout(gridlayout);
	for(int i = 0;i < button.length;i++){
		button[i] = new JButton(String.valueOf("×ùÎ»"+(i+1)));
		frm.getContentPane().add(button[i]);
	}
	frm.setBounds(400, 200, 900, 500);
	frm.setVisible(true);
}}




