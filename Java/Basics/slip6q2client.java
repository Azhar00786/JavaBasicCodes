import java.net.*;
import java.io.*;
import java.util.Scanner;

class client{
	public static void main(String[] arg) throws Exception{
		Socket s=new Socket("localhost",1234);
		String msg,res;
		Scanner sc=new Scanner(System.in);
		BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintStream out=new PrintStream(s.getOutputStream());
		do{
			System.out.println("Enter message:");
			msg=sc.next();
			out.println(msg);
			res=in.readLine();
			System.out.println("Received Message:"+res);
		}while(!msg.equals("end"));
	}
}