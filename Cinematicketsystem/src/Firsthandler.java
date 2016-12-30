import java.awt.GridLayout;
import static javax.swing.JFrame.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Firsthandler extends JFrame implements ActionListener {
	JButton[] film = new JButton[6];
	 
	Firsthandler() { 
		for(int i=0;i<6;i++)   
		 {film[i] = new JButton("NULL"); 
		 film[i].setVisible(false);}
		this.setTitle("订票");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		GridLayout gridlayout = new GridLayout(6, 1);
		this.setLayout(gridlayout);
		Buttonhandler film0Handler = new Buttonhandler();
		film[0].addActionListener(film0Handler);
		Buttonhandler film1Handler = new Buttonhandler();
		film[1].addActionListener(film1Handler);
		Buttonhandler film2Handler = new Buttonhandler();
		film[2].addActionListener(film2Handler);
		Buttonhandler film3Handler = new Buttonhandler();
		film[3].addActionListener(film3Handler);
		Buttonhandler film4Handler = new Buttonhandler();
		film[4].addActionListener(film4Handler);
		Buttonhandler film5Handler = new Buttonhandler();
		film[5].addActionListener(film5Handler);
		this.getContentPane().add(film[0]);
		this.getContentPane().add(film[1]);
		this.getContentPane().add(film[2]);
		this.getContentPane().add(film[3]);
		this.getContentPane().add(film[4]);
		this.getContentPane().add(film[5]);
		this.setBounds(400, 400, 800, 400);
		this.setVisible(false);

	}

	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<Interfance.movielist.size();i++)
		{
			film[i].setText("电影:  "+Interfance.movielist.get(i).Movie_Name+"   时间:  "+Interfance.movielist.get(i).Movie_Date_Released+" "+Interfance.movielist.get(i).Movie_Time);
			film[i].setVisible(true);
		}
		this.setVisible(true);

	}
}
