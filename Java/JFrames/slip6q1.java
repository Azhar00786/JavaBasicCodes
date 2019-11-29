import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
class slip6q1 extends JFrame implements ActionListener{
	JLabel	l1,l2,l3,l4;
	JTextField	t1,t2,t3,t4;
	JButton b1;
	//JPanel p1,p2;
    slip6q1(){
		setLayout(new FlowLayout());
		setSize(400,200);
		l1=new JLabel("Decimal Number");
		l2=new JLabel("Binary Number");
		l3=new JLabel("Octal Number");
		l4=new JLabel("Hexa Number");
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		//add(p1,BorderLayout.CENTER);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		
		
		//p2=new JPanel(new FlowLayout());
		b1=new JButton("Calculate");
		//add(p2,BorderLayout.SOUTH);
		add(b1);
		b1.addActionListener(this);
		//p2.setBackground(Color.BLACK);	
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1){
			String arg=t1.getText();
			int no;
			no=Integer.parseInt(arg);
			String no1=Integer.toBinaryString(no);
			String no2=Integer.toOctalString(no);
			String no3=Integer.toHexString(no);
			t2.setText(no1);
			t3.setText(no2);
			t4.setText(no3);
		}
	}
}
class test{
	public static void main(String[] arg){
		slip6q1 ss=new slip6q1();
	}
}