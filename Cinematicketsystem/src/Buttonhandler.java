import java.awt.BorderLayout;
import static javax.swing.JFrame.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

public class Buttonhandler extends JFrame implements ActionListener {
	Buttonhandler()
	{
		this.setTitle("¶©Æ±");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel northPanel = new JPanel();
		this.getContentPane().add(northPanel, BorderLayout.NORTH);
		JPanel westPanel = new JPanel();
		JButton backbutton = new JButton("·µ»Ø");
		this.getContentPane().add(westPanel, BorderLayout.WEST);
		westPanel.add(backbutton);
		JPanel eastPanel = new JPanel();
		this.getContentPane().add(eastPanel, BorderLayout.EAST);
		JButton buybutton = new JButton("¹ºÂò");
		SeatHandler buyHandler=new SeatHandler();
		buybutton.addActionListener(buyHandler);
		eastPanel.add(buybutton);
			JLabel label=new JLabel("×ùÎ»Ê£Óà");
			label.setVisible(true);
			label.setBounds(5,5,160,80);
			northPanel.add(label);
		this.setBounds(400, 200, 400, 200);
		this.setVisible(false);
	}
	public void actionPerformed(ActionEvent e) {
		this.setVisible(true);
	}
}
