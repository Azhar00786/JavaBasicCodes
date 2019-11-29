import java.io.*;
import java.net.*;
import java.util.*;
class server{
	public static void main(String[] arg) throws Exception{
		String fname,rline;
		//int flag=0;
		ServerSocket s=new ServerSocket(4567);
		Socket ss=s.accept();
		BufferedReader in=new BufferedReader(new InputStreamReader(ss.getInputStream()));
		PrintStream out=new PrintStream(ss.getOutputStream());
		fname=in.readLine();
		BufferedReader fopen=new BufferedReader(new FileReader(fname));
		while((rline=fopen.readLine())!=null){
			out.println(rline);
		}
	}
}