import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

class slip2q1 extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu m1,m2;
	JMenuItem mi1,mi2,mi3,mi4,mi5;
	JTextArea jta;
	Integer a[]=new Integer[10];
	public slip2q1(){
		setLayout(new BorderLayout());
		setSize(700,250);
		mb=new JMenuBar();
		m1=new JMenu("Operation");
		m2=new JMenu("Sort");
		mi1=new JMenuItem("Load");
		mi2=new JMenuItem("Save");
		mi3=new JMenuItem("Exit");
		mi4=new JMenuItem("Ascending");
		mi5=new JMenuItem("Descending");
		jta=new JTextArea(10,10);
		
		add(mb,BorderLayout.NORTH);
		mb.add(m1);
		mb.add(m2);
		m1.add(mi1);
		m1.add(mi2);
		m1.add(new JSeparator());
		m1.add(mi3);
		m2.add(mi4);
		m2.add(mi5);
		add(jta,BorderLayout.SOUTH);
		setJMenuBar(mb);
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==mi1){
			int i;
			Random r=new Random();
			for(i=0;i<10;i++){
				a[i]=r.nextInt(100);
				//jta.setText(""+a[i]);
				jta.append(" "+a[i]);		//we must always use append for jtextarea
			}
		}
		if(ae.getSource()==mi2){
			int i;
			String arg=jta.getText();
			try{
				//File file=new File("numbers.txt");
				FileWriter fw=new FileWriter("numbers.txt");
				//BufferedWriter bw=new BufferedWriter(fw);
				fw.write(arg);
				fw.close();
			}catch(Exception e){}
		}
		if(ae.getSource()==mi3){
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			System.out.println("BYE!!");
			System.exit(0);
		}
		if(ae.getSource()==mi4){
			int t,i;
			try{		
				for(i=0;i<10;i++)
					for(int j=i+1;j<10;j++)    //for ascending
						if(a[i]>a[j])
						{
							t=a[i];
							a[i]=a[j];
							a[j]=t;
						}
			}catch(Exception e){}
			jta.append("\n");
			jta.append("Ascending order is:");
			for(i=0;i<10;i++){
				jta.append(" "+a[i]);
			}
		}
		
		if(ae.getSource()==mi5){
			int t,i;
			try{		
				for(i=0;i<10;i++)				//for descending
					for(int j=i+1;j<10;j++)
						if(a[i]<a[j])
						{
							t=a[i];
							a[i]=a[j];
							a[j]=t;
						}
			}catch(Exception e){}
			jta.append("\n");
			jta.append("Descending order is:");
			for(i=0;i<10;i++){
				jta.append(" "+a[i]);
			}
		}
	}

	public static void main(String[] arg){
		slip2q1 s=new slip2q1();
	}
}