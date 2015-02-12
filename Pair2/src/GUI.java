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
        JMenu edit = new JMenu("Edit");
        JMenu insert = new JMenu("Insert");
        jm.add(file);
        jm.add(edit);
        jm.add(insert);
        
        JMenuItem cut = new JMenuItem("Cut");
        cut.addActionListener(this);
        edit.add(cut);
        JMenuItem copy = new JMenuItem("Copy");
        copy.addActionListener(this);
        edit.add(copy);
        JMenuItem paste = new JMenuItem("Paste");
        paste.addActionListener(this);
        edit.add(paste);
        
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
            System.exit(ABORT);
        else if (e.getActionCommand().equals("Date"))
            jt.append(DateFormat.getDateInstance().format(new Date()));
        else if (e.getActionCommand().equals("Cut"))
            jt.cut();
        else if (e.getActionCommand().equals("Copy"))
            jt.copy();
        else if (e.getActionCommand().equals("Paste"))
            jt.paste();
    }
    
    public static void main(String[] args)
    {
        GUI g = new GUI();
    }

}
