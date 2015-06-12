
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;



public class MyTimer extends JFrame{

	public MyTimer(){
		
		Words object = new Words();
		Push object3 = new Push();
		add(object,BorderLayout.NORTH);
		add(object3,BorderLayout.SOUTH);
	 

	}
	
	
		
	public static void main(String[] args){
		
		MyTimer frame = new MyTimer();
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




class Push extends JPanel{
	
	int hour;
	int min;
	int sec;
	int hour1;
	int min1;
	int sec1;
	
	
	
	private JTextField jtfHour = new JTextField(5);
	private JTextField jtfMinute = new JTextField(5);
	private JTextField jtfSecond = new JTextField(5);
	private JButton jbtStart = new JButton("START");
	private JButton jbtStop = new JButton("STOP");
	private JButton jbtClear = new JButton("THROUGH");
	
	public Push(){
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(jbtStart);
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p2.add(jbtStop);
		
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p3.add(jbtClear);
		
		setLayout(new GridLayout(2,3));
		
		add(jtfHour);
		add(jtfMinute);
		add(jtfSecond);
		add(p1);
		add(p2);
		add(p3);
		
		jbtStart.addActionListener(new ButtonListener1());	
		jbtStop.addActionListener(new ButtonListener2());
		jbtClear.addActionListener(new ButtonListener3());
	}
	
	 
    private class ButtonListener1 implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
		
			Calendar calendar = new GregorianCalendar();
			
			hour = calendar.get(Calendar.HOUR_OF_DAY);
			min = calendar.get(Calendar.MINUTE);
			sec = calendar.get(Calendar.SECOND);
	
			jtfHour.setText(String.format("%d",hour));
			jtfMinute.setText(String.format("%d",min));
			jtfSecond.setText(String.format("%d",sec));
		}
	}
	
	private class ButtonListener2 implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			
			Calendar calendar = new GregorianCalendar();
			
			hour1 = calendar.get(Calendar.HOUR_OF_DAY);
			min1 = calendar.get(Calendar.MINUTE);
			sec1 = calendar.get(Calendar.SECOND);
			jtfHour.setText(String.format("%d",hour1));
			jtfMinute.setText(String.format("%d",min1));
			jtfSecond.setText(String.format("%d",sec1));
			
		
			
		}
	}
	
	private class ButtonListener3 implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			jtfHour.setText("");
			jtfMinute.setText("");
			jtfSecond.setText(String.format("%d",3600*(hour1-hour)+60*(min1-min)+(sec1-sec)));
			
			
			
		}
	}
	
	
		
}








