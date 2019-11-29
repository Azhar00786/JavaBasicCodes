import java.net.*;
import java.io.*;
import java.util.*;
class server{
	public static void main(String[] arg) throws Exception{
		ServerSocket s=new ServerSocket(1234);
		Socket ss=s.accept();
		BufferedReader in=new BufferedReader(new InputStreamReader(ss.getInputStream()));
		PrintStream out=new PrintStream(ss.getOutputStream());
		Date d=new Date();
		out.println("Hi Client:"+d);
		String msg;
		msg=in.readLine();
		System.out.println(msg);
	}
}