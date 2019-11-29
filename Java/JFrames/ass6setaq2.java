import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class ass6setaq2 extends JFrame implements ActionListener,ItemListener{
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JCheckBox c[];
	JRadioButton r0,r1,r2;
	ButtonGroup bg;
	String s="";
	int i;
	
	ass6setaq2(){
		super("ass6setaq2");
		setSize(300,300);
		setLayout(new FlowLayout());
		setResizable(true);
		setVisible(true);
		
		l1=new JLabel("Enter Name");
		l2=new JLabel("Your Class");
		l3=new JLabel("Your Hobbies");
		t1=new JTextField(20);
		t2=new JTextField(20);
		c=new JCheckBox[3];
		c[0]=new JCheckBox("MUSIC");
		c[1]=new JCheckBox("DANCE");
		c[2]=new JCheckBox("SPORTS");
		bg=new ButtonGroup();
		r0=new JRadioButton("FY");
		r1=new JRadioButton("SY");
		r2=new JRadioButton("TY");
		
		
		
		add(l1);
		add(t1);
		
		add(l2);
		bg.add(r0);
		bg.add(r1);
		bg.add(r2);
		add(r0);
		add(r1);
		add(r2);
		
		add(l3);
		add(c[0]);
		add(c[1]);
		add(c[2]);
		
		add(t2);
		
		t1.addActionListener(this);
		c[0].addItemListener(this);
		c[1].addItemListener(this);
		c[2].addItemListener(this);
		r0.addItemListener(this);
		r1.addItemListener(this);
		r2.addItemListener(this);
		
	}
		
			
		public void actionPerformed(ActionEvent ae){
				s=t1.getText();
				t2.setText(s);
		}
		//t2.setText(s);
		public void itemStateChanged(ItemEvent ie){
			for(i=0;i<3;i++){
				if(c[i].isSelected()==true)	
						s=s+""+c[i].getLabel();
						t2.setText(s);		
			}
			//t2.setText(s);
			if(r0.isSelected()==true){
					s=r0.getLabel()+"";
					t2.setText(s);	
			}
			//t2.setText(s);
			//t2.setText(s);
			if(r1.isSelected()==true){
					s=""+r1.getLabel();
					t2.setText(s);	
			}
			//t2.setText(s);
			if(r2.isSelected()==true){
					s=""+r2.getLabel();
					t2.setText(s);	
			}
			t2.getText();
	
		}
		public static void main(String arg[]){
			ass6setaq2 a=new ass6setaq2();
		}
	
}
	