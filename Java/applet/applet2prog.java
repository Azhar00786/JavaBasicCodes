import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class applet2prog extends Applet implements ItemListener{
	TextField t1;
	Choice l;
	Label l1;
	
	public void init(){
		setLayout(new FlowLayout());
		setVisible(true);
		t1=new TextField(20);
		l1=new Label("Accepted course is:");
		l=new Choice();
			l.add(" ");
			l.add("COMP SCIENCE");
			l.add("MCS");
			l.add("BCS");
			l.add("BCA");
		add(l);
		add(l1);
		add(t1);
		
		l.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e){
		t1.setText(l.getSelectedItem());
	}
}