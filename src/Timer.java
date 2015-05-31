
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;


public class Timer extends JFrame{

	public Timer(){
		
		Words object = new Words();
		Numbers object2 = new Numbers();
		Push object3 = new Push();
		add(object,BorderLayout.NORTH);
		add(object2,BorderLayout.CENTER);
		add(object3,BorderLayout.SOUTH);
		
	}
		
	public static void main(String[] args){
		
		Timer frame = new Timer();
		frame.setTitle("U10316030_Timer");
		frame.setLocationRelativeTo(null); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}


class Words extends JPanel{
	
	public Words(){
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(new JLabel("Hour"));
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p2.add(new JLabel("Minute"));
		
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p3.add(new JLabel("Second"));
		
		setLayout(new GridLayout(1,3));
		
		add(p1);
		add(p2);
		add(p3);
		
	}
}


class Numbers extends JPanel{
	
	private JTextField jtfHour = new JTextField(5);
	private JTextField jtfMinute = new JTextField(5);
	private JTextField jtfSecond = new JTextField(5);
	
	int hour;
	int min;
	int sec;
	
	public Numbers(){
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(jtfHour);
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p2.add(jtfMinute);
		
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p3.add(jtfSecond);
		
		setLayout(new GridLayout(1,3));
		
		add(p1);
		add(p2);
		add(p3);
		
	}
	
}

class Push extends JPanel{
	
	private JButton jbtStart = new JButton("START");
	private JButton jbtPause = new JButton("PAUSE");
	private JButton jbtStop = new JButton("STOP");
	
	public Push(){
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(jbtStart);
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p2.add(jbtPause);
		
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p3.add(jbtStop);
		
		setLayout(new GridLayout(1,3));
		
		add(p1);
		add(p2);
		add(p3);
		
	}
	
}