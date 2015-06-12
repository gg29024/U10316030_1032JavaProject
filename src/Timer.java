
import java.awt.*;

import javax.swing.*;

import java.util.*;
import java.awt.event.*;
import java.util.Date;

import java.util.TimerTask;



public class Timer extends JFrame{

	public Timer(){
		
		Words object = new Words();
		Numbers object2 = new Numbers();
		Push object3 = new Push();
		add(object,BorderLayout.NORTH);
		add(object2,BorderLayout.CENTER);
		add(object3,BorderLayout.SOUTH);
		EggTimer eggTimer = new EggTimer(1);
	    eggTimer.start();

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
	
	int hour;
	int min;
	int sec;
	
	private JTextField jtfHour = new JTextField(5);
	private JTextField jtfMinute = new JTextField(5);
	private JTextField jtfSecond = new JTextField(5);
	private JButton jbtStart = new JButton("START");
	private JButton jbtStop = new JButton("STOP");
	private JButton jbtClear = new JButton("CLEAR");
	
	public Push(){
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(jbtStart);
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p2.add(jbtStop);
		
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p3.add(jbtClear);
		
		setLayout(new GridLayout(1,3));
		
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
			hour = Integer.valueOf(jtfHour.getText());
			min = Integer.valueOf(jtfMinute.getText());
			sec = Integer.valueOf(jtfSecond.getText());
			jtfHour.setText("");
			jtfMinute.setText("");
			jtfSecond.setText(String.format("%.2f",));
			eggTimer.repaint();
		}
	}
	
	private class ButtonListener2 implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			hour = Integer.valueOf(jtfHour.getText());
			min = Integer.valueOf(jtfMinute.getText());
			sec = Integer.valueOf(jtfSecond.getText());
			jtfHour.setText("");
			jtfMinute.setText("");
			jtfSecond.setText(String.format("%.2f",getTime2()));
			
		
			
		}
	}
	
	private class ButtonListener3 implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			jtfHour.setText("");
			jtfMinute.setText("");
			jtfSecond.setText("");
			
			
			
		}
	}
		
}


class EggTimer {

    private final Timer timer = new Timer();
    private final int minutes;
    
    EggTimer(int minutes) {
        this.minutes = minutes;
    }

    public void start() {
        Date now = new Date();
        timer.schedule(new RemindTask() , now, minutes * 2 * 1000);
    }

    class RemindTask extends TimerTask {
    	int hour;
    	int min;
    	int sec;
        int runtimer= hour*3600 + min*60 + sec;

        public void run(){
            if (runtimer> 0){
                System.out.println(runtimer);
                runtimer--;
            } else{
                System.out.println("--");
                timer.cancel(); 
            }
        }
    }
   

}