package cse22542;
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Menu1 extends JFrame implements ActionListener{

   JMenu menu,sub;

   JMenuBar mb;

   JMenuItem i1,i2,i3,i4;

   static JLabel l;

   Menu1()

   {

	   JFrame f=new JFrame("MENU BAR");

	   l=new JLabel("Selected:");

	   mb=new JMenuBar();

	   menu=new JMenu("File");

	   sub=new JMenu("SAVE");

	   i1=new JMenuItem("New");

	   i2=new JMenuItem("Open");

	   i3=new JMenuItem("Save as");

	   i4=new JMenuItem("Save All");

	   

	   mb.add(menu);

	   menu.add(i1);

	   menu.add(i2);

	   menu.add(sub);

	   sub.add(i3);

	   sub.add(i4);

	   f.setJMenuBar(mb);

       menu.addActionListener(this);

	   i1.addActionListener(this);

	   i2.addActionListener(this);

	   i3.addActionListener(this);

	   i4.addActionListener(this);

	   l.setSize(500,500);

	   f.add(l);

	   f.setSize(800,800);

	   f.setLayout(null);

	   f.setVisible(true);

     }

	public void actionPerformed(ActionEvent e)

	   {

		   String s=e.getActionCommand();

		   l.setText("Selected:  "+s);

	   }



   public static void main(String args[])

   {

	   new Menu1();

   }

}



