import java.io.*;
import java.util.Scanner;

class ass5setcq1 extends Thread{
	public String fname;
	ass5setcq1(String st){
		fname=st;
	}
	public void run(){
			File f=new File(fname);
			if(f.exists()){
				System.out.println(fname+" File Exist");
			}
			else{
				System.out.println(fname+"File does not Exist");
			}	
	}

}

class FileWatcher{
	public static void main(String[] arg){
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many file names you want to enter:");
		n=sc.nextInt();
		String st[]=new String[n];
		ass5setcq1 a[]=new ass5setcq1[n];
		System.out.println("Enter "+n+" names:");
		for(i=0;i<n;i++){
			st[i]=sc.next();
			a[i]=new ass5setcq1(st[i]);
		}
		for(i=0;i<n;i++){
			a[i].start();
		}
	}
}