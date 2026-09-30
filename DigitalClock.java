import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DigitalClock extends JFrame{
	DigitalClock(String a){
		super(a);
	}

		// Reffernce Variable
	ImageIcon ic1;
	JLabel pic;
	JLabel tm;
	SimpleDateFormat sd1;
	SimpleDateFormat sd2;
	JLabel dt;

void Compo(){
		// Object
	ic1 = new ImageIcon("/img1.png");
	pic = new JLabel();
	tm = new JLabel();
	sd1 = new SimpleDateFormat("hh:mm:ss a");
	dt = new JLabel("Date");
	sd2 = new SimpleDateFormat("dd-MM-yyyy");
	
		// set components
	pic.setBounds(25, 2, 500, 500);	
	pic.setIcon(ic1);
	tm.setBounds(250, 340, 200, 100);
	tm.setFont(new Font("", Font.BOLD, 30));
	dt.setBounds(250, 180, 200, 100);
	dt.setFont(new Font("", Font.BOLD, 30));
	dt.setText(sd2.format(Calendar.getInstance().getTime()) );
		
		// add
	add(pic);
	add(tm);
	add(dt);

		// other work
	Timer timer = new Timer(1000, new ActionListener(){
		public void actionPerformed(ActionEvent a1){
			String tim = sd1.format(Calendar.getInstance().getTime());
			tm.setText(tim); 
		}
	});
	timer.start();
}

public static void main(String args[]){
		DigitalClock dc = new DigitalClock("Today Time");
		dc.setSize(500, 550);
		dc.setResizable(false);
		dc.setLayout(null);
		dc.Compo();
		dc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dc.setVisible(true);
}}
