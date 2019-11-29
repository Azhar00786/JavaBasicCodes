import java.net.*;
import java.io.*;
import java.util.*;
class client{
	public static void main(String[] arg) throws Exception{
		Socket s=new Socket("localhost",1234);
		BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintStream out=new PrintStream(s.getOutputStream());
		String msg;
		msg=in.readLine();
		System.out.println(msg);
		out.println("Got your message Server");
		
	}
}