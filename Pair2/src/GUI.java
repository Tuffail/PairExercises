import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.*;


public class GUI extends JFrame implements ActionListener {
	
	JTextArea jt;
	
	public GUI()
	{
		this.setSize(640,480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar jm = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu insert = new JMenu("Insert");
		jm.add(file);
		jm.add(insert);
		
		
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(this);
		file.add(exit);
		
		JMenuItem date = new JMenuItem("Date");
		date.addActionListener(this);
		insert.add(date);
		
		jt = new JTextArea(300,300);
		this.add(jt);
		
		this.setJMenuBar(jm);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals("Exit"))
		{
			System.exit(ABORT);
		}
		else if (e.getActionCommand().equals("Date"))
		{
			jt.append(DateFormat.getDateInstance().format(new Date()));
		}
	}
	
	public static void main(String[] args)
	{
		GUI g = new GUI();
	}

}
