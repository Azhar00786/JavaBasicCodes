import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class bouncingballthread extends Thread{
	public int top;
	public int left;
	mypanel p;			
	boolean flag;
	
	bouncingballthread(int t,int l,mypanel pp){
		top=t;
		left=l;
		p=pp;
	}	
	
	public void run(){
		try{
			while(true){
				Thread.sleep(10);
				if(top>=p.getHeight()-48){
					flag=true;
				}
				if(top<=0){
					flag=false;
				}
				if(flag){
					top=top-1;
				}
				else{
					top=top+1;
				}
				p.repaint();
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

class ball extends JFrame implements ActionListener{
	bouncingballthread bb[];
	JButton jb1,jb2;
	Panel p1;
	mypanel p2;
	int n,top,left;
	
	ball(){
	    setVisible(true);
		setSize(200,200);
		bb=new bouncingballthread[10];
		setLayout(new BorderLayout());
		p2=new mypanel(this);
		p2.setBackground(Color.white);
		add(p2,BorderLayout.CENTER);
		
		p1=new Panel();
		p1.setBackground(Color.red);
		add(p1,BorderLayout.SOUTH);
		
		jb1=new JButton("START");
		p1.add(jb1);
		jb1.addActionListener(this);
		jb2=new JButton("RESTART");
		p1.add(jb2);
		jb2.addActionListener(this);
		jb1.setEnabled(true);
		jb2.setEnabled(false);	
	}
	public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==jb2){
				left=0;
				top=0;
				n=0;
				jb2.setEnabled(false);
				jb1.setEnabled(true);
			}
			if(n==9){
				jb1.setEnabled(false);
				jb2.setEnabled(true);
				JOptionPane.showMessageDialog(null,"Max limit 9 balls only");
			}
			bb[n]=new bouncingballthread(top,left,p2);
			bb[n].start();
			top=top+25;
			left=left+65;
			n++;
	}
	
	public static void main(String arg[]){
		ball b=new ball();
	}
}	
class mypanel extends Panel{
		ball bbb;
		Color c[]={Color.red,Color.green,Color.black,Color.blue,Color.pink,Color.yellow,Color.gray,Color.magenta,Color.cyan,Color.darkGray};
		mypanel(ball b){
			bbb=b;
		}
		public void paint(Graphics g){
			for(int i=0;i<bbb.n;i++){
				g.setColor(c[i]);
				g.fillOval(bbb.bb[i].left,bbb.bb[i].top,50,50);
			}
		}
	}