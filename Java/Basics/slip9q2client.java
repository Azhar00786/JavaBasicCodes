import java.io.*;
import java.net.*;
import java.util.Scanner;
class client{
	public static void main(String[] arg) throws Exception{
		String fname,rline;
		Socket s=new Socket("localhost",4567);
		Scanner sc=new Scanner(System.in);
		BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintStream out=new PrintStream(s.getOutputStream());
		//BufferedReader fopen=new BufferedReader(new FileReader(fname));
		System.out.println("Enter name of file:");
		fname=sc.next();
		out.println(fname);
		rline=in.readLine();
		System.out.println("Contents of file is:");
		System.out.println(rline);		
	}
}