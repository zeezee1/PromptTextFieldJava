import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;


public class PromptTextField extends JTextField implements FocusListener
{
	
	String text = "";
	
	public PromptTextField(String prompttext, int columns)
	{
		text=prompttext;
		setForeground(Color.gray);
		setText(prompttext);
		setColumns(columns);
		addFocusListener(this);
	}
	
	public void focusGained(FocusEvent fe)
	{
		if(getText().equals(text))
		{
			setForeground(Color.black);
			setText("");
		}
	}
	
	public void focusLost(FocusEvent fe)
	{
		if(getText().equals(""))
		{
			setForeground(Color.gray);
			setText(text);
		}
	}
}
