import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class slip9q1 extends Applet implements MouseListener,MouseMotionListener{
	String msg;
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void paint(Graphics g){
		g.drawString(msg,100,150);
	}
	public void mouseEntered(MouseEvent me1){
		msg="MouseEntered:"+me1.getX()+","+me1.getY();
		repaint();
	}
	public void mousePressed(MouseEvent me2){
		msg="MousePressed:"+me2.getX()+","+me2.getY()+"MouseButton:"+me2.getButton();
		repaint();
	}
	public void mouseExited(MouseEvent me3){
		msg="MouseExited:"+me3.getX()+","+me3.getY();
		repaint();
	}
	public void mouseMoved(MouseEvent me4){
		msg="MouseMoved:"+me4.getX()+","+me4.getY();
		repaint();
	}
	public void mouseReleased(MouseEvent me5){
		msg="MouseReleased:"+me5.getX()+","+me5.getY();
		repaint();
	}
	public void mouseClicked(MouseEvent me6){
		msg="MouseEntered:"+me6.getX()+","+me6.getY()+"MouseButton:"+me6.getButton();
		repaint();
	}
	public void mouseDragged(MouseEvent me7){
		msg="MouseDragged:"+me7.getX()+","+me7.getY();
		repaint();
	}
}
