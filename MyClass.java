import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class MyClass 
{
	JFrame frame;
	Container con;
	JTextField field;
	PromptTextField textfield, arsal, hassan, talha, usman, bakar, zubaid;
	
	MyClass()
	{
		frame=new JFrame("Prompt Text Field");
		con=frame.getContentPane();
		con.setLayout(new FlowLayout());
		field=new JTextField("Simple Textfield", 10);
		textfield=new PromptTextField("My Textfield", 10);
		arsal=new PromptTextField("Placeholder", 10);
		hassan=new PromptTextField("Hassan's", 10);
		talha=new PromptTextField("Talha's", 10);
		usman=new PromptTextField("Usman's", 10);
		bakar=new PromptTextField("Bakar's", 10);
		zubaid=new PromptTextField("Zubaid's", 10);
		zubaid.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		zubaid.setBackground(Color.CYAN);
		con.add(field);
		con.add(textfield);
		con.add(arsal);
		con.add(hassan);
		con.add(talha);
		con.add(zubaid);
		con.add(usman);
		con.add(bakar);
		frame.setSize(200,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		MyClass myobj=new MyClass();
	}
}
