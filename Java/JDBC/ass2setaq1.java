import java.sql.*;
import java.io.*;

class ass2setaq1{
	public static void main(String[] args){
	  try{		
		Connection con;
		Statement stm;
		ResultSet rs;
		int ch,c1;
		float c3;
		String no,no1,no2,c2;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Choice((1)Insert,(2)Modify,(3)Delete,(4)Search,(5)View all,(6)Exit");
		no=br.readLine();
		ch=Integer.parseInt(no);
		
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/semester2","postgres","azhar");
		stm=con.createStatement();
		switch(ch){
			case 1:	System.out.println("Enter Roll number");
					no1=br.readLine();
					c1=Integer.parseInt(no1);
					System.out.println("Enter name of student");
					c2=br.readLine();
					System.out.println("Enter percentage of student:");
					no2=br.readLine();
					c3=Float.parseFloat(no2);
					stm.executeUpdate("insert into student values(c1,c2,c3)");
		}
		
		
		
		
		/*rs=stm.executeQuery("select * from student");
		
		while(rs.next()){
			System.out.println("Roll number is:"+rs.getInt(1));
			System.out.println("Student name is:"+rs.getString(2));
			System.out.println("Percentage is:"+rs.getFloat(3));
		}*/
		
	  }catch(Exception e){
			System.out.println(e);
		}	
	}
}