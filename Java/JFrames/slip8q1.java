import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class slip8q1 extends JFrame implements ItemListener{
	JLabel l1,l2,l3;
	JComboBox j1,j2;
	JCheckBox cb[];
	JTextField t1;
	JPanel p1,p2;
	String font[];
	slip8q1(){
		int i;
		setLayout(new BorderLayout());
		setSize(600,400);
		l1=new JLabel("Font");
		l2=new JLabel("Style");
		l3=new JLabel("Size");
		
		cb= new JCheckBox[2];
		cb[0]=new JCheckBox("Bold");
		cb[1]=new JCheckBox("Italic");
		t1=new JTextField("Azhar",10);
		font=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		j1=new JComboBox();
		for(i=0;i<font.length;i++){
				j1.addItem(font[i]);
		}
		j2=new JComboBox();
		j2.addItem("5");
		j2.addItem("6");
		j2.addItem("7");
		j2.addItem("8");
		j2.addItem("9");
		j2.addItem("10");
		
		p1=new JPanel(new GridLayout(4,2));
		p1.add(l1);
		p1.add(l2);
		p1.add(j1);
		p1.add(cb[0]);
		p1.add(l3);
		p1.add(cb[1]);
		p1.add(j2);
		
		p2=new JPanel();
		p2.add(t1);	
		
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		j1.addItemListener(this);
		j2.addItemListener(this);
		cb[0].addItemListener(this);
		cb[1].addItemListener(this);
		
		setVisible(true);
		
	}
	public static void main(String[] arg){
		slip8q1 s=new slip8q1();
	}
	public void itemStateChanged(ItemEvent ie){
		Font f;
		String fontname;
		int fontsize;
		fontname=(String)j1.getSelectedItem();
		fontsize=Integer.parseInt((String)j2.getSelectedItem());
		f=new Font(fontname,Font.PLAIN,fontsize);
		if(cb[0].isSelected()){
			f=new Font(fontname,Font.BOLD,fontsize);
		}
		if(cb[1].isSelected()){
			f=new Font(fontname,Font.ITALIC,fontsize);
		}
		if(cb[0].isSelected() && cb[1].isSelected()){
			f=new Font(fontname,Font.BOLD|Font.ITALIC,fontsize);
		}
		t1.setFont(f);
	}
 }