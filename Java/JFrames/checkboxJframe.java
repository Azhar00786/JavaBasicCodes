import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class checkboxJframe extends JFrame implements ItemListener{
	JCheckBox  c[];
	JTextField t1;
	
	checkboxJframe(){
		super("checkboxJframe");
		setLocation(300,300);
		setResizable(false);
		setSize(300,300);
		setLayout(new FlowLayout());
		setVisible(true);
		
		c=new JCheckBox[3];
		c[0]=new JCheckBox("FY");
		c[1]=new JCheckBox("SY");
		c[2]=new JCheckBox("TY");
		t1=new JTextField(20);
		
		add(c[0]);
		add(c[1]);
		add(c[2]);
		add(t1);
		
		c[0].addItemListener(this);
		c[1].addItemListener(this);
		c[2].addItemListener(this);	
	}
	
	public void itemStateChanged(ItemEvent ie){
		String msg="";
		
		for(int i=0;i<c.length;i++){
			if(c[i].isSelected()==true)
				msg=msg+" "+c[i].getLabel();
				
				
			t1.setText(msg);
		}
	}
	
	public static void main(String[] arg){
		checkboxJframe j=new checkboxJframe();
	}
}