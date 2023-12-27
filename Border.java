package cse22542;
import java.awt.*;
import javax.swing.*;

public class Border {
	JFrame f;
	Border()
	{
		f = new JFrame();
		JButton b1 = new JButton("top");
		JButton b2 = new JButton("right");
		JButton b3 = new JButton("bottom");
		JButton b4 = new JButton("left");
		JButton b5 = new JButton("middle");
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.EAST);
		f.add(b3,BorderLayout.SOUTH);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		f.setSize(300,300);
		f.setVisible(true);
	}
		public static void main(String[] args)
		{
			new Border();
		}
	}