import java.net.*;
import java.io.*;
import java.util.Scanner;

class server{
	public static void main(String[] arg) throws Exception{
		ServerSocket s=new ServerSocket(1234);
		Socket ss=s.accept();
		String msg,res;
		Scanner sc=new Scanner(System.in);
		BufferedReader in=new BufferedReader(new InputStreamReader(ss.getInputStream()));
		PrintStream out=new PrintStream(ss.getOutputStream());
		do{
			System.out.println("Enter message:");
			msg=sc.next();
			out.println(msg);
			res=in.readLine();
			System.out.println("Received Message:"+res);
		}while(!res.equals("end"));
	}
}