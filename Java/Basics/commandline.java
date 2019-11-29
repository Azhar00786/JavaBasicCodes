class Add{
	int a;
	int b;
	
	public Add(){
		a=0;
		b=0;
	}
	
	public Add(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	void addition(){
		int c;
		c=a+b;
		System.out.println("Addition of two numbers is:"+c);	
	}


}



class TestAdd{
	public static void main(String[] arg){
		int n,no1,no2,i;
		n=arg.length;
		try{
		    if(n==2){
				no1=Integer.parseInt(arg[0]);
				no2=Integer.parseInt(arg[1]);
			
				Add ob=new Add(no1,no2);
			
				ob.addition();
			
		}
		
		
		else{ 
			System.out.println("Numbers entered are more than Two which is not valid");
		}
		
		}catch(Exception e){
				System.out.println("Please enter 2 numbers as Error generated is:"+e);
		
			}
	
	
	}



}