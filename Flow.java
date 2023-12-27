package cse22542;
import java.awt.*;
import javax.swing.*;

public class Flow {
	JFrame f;
	Flow()
	{
		f = new JFrame();
		JButton b1 = new JButton("ONE");
		JButton b2 = new JButton("TWO");
		JButton b3 = new JButton("THREE");
		JButton b4 = new JButton("FOUR");
		JButton b5 = new JButton("FIVE");
		JButton b6 = new JButton("SIX");
		JButton b7 = new JButton("SEVEN");
		JButton b8 = new JButton("EIGHT");
		JButton b9 = new JButton("NINE");
		JButton b10 = new JButton("TEN");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		
		f.setSize(300,300);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		
	}
	public static void main(String[] args)
	{
		new Flow();
	}
	

}
