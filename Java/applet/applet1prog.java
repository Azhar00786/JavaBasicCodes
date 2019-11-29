import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class applet1prog extends Applet implements ActionListener{
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	JButton b1,b2;
	
	public void init(){
		setVisible(true);
		setLayout(new FlowLayout());
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		l1=new JLabel("Enter 1st number:");
		l2=new JLabel("Enter 2nd number:");
		l3=new JLabel("Final answer:");
		b1=new JButton("Add");
		b2=new JButton("Sub");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		add(t3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae){
		String a=t1.getText();
		String b=t2.getText();
		int no1=0;
		int no2=0;
		no1=Integer.parseInt(a);
		no2=Integer.parseInt(b);
		
		if(ae.getSource()==b1){
			t3.setText(""+(no1+no2));
			
		}
		if(ae.getSource()==b2){
			t3.setText(""+(no1-no2));
		}
	}
 	
}