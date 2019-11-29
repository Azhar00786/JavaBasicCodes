class ass5setaq3 implements Runnable{
	String str;
	int no;
	Thread t;
	ass5setaq3(){}
	
	ass5setaq3(String s,int n){
		str=s;
		no=n;
		t=new Thread(this);
	}
	
	public void run(){
		int i;
		for(i=0;i<no;i++){
			System.out.println(str);
		}
	}	
}

class Testass5setaq3{
	public static void main(String args[]){
		ass5setaq3 p1=new ass5setaq3("I am in FY",10);
		ass5setaq3 p2=new ass5setaq3("I am in SY",20);
		ass5setaq3 p3=new ass5setaq3("I am in TY",30);
		
		p1.t.start();
		p2.t.start();
		p3.t.start();
		
		try{
			p1.t.join();
			p2.t.join();
			p3.t.join();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}