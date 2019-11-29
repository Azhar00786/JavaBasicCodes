import java.io.*;
import java.util.Scanner;

class Myfile{
	public static void main(String[] arg){
		int n,i,no;
		n=arg.length;
		if(n==1){
			File f1=new File(arg[0]);
			Scanner sc=new Scanner(System.in);
			if(f1.isDirectory()){
				String name[],choice;
				name=f1.list();
				no=name.length;
				System.out.println("Total number of file Directory has:-"+no);
				for(i=0;i<no;i++){
					System.out.println(name[i]);
					File f2=new File(arg[i]+"\\"+name[i]);
					if(name[i].endsWith("txt")){
						System.out.println("File found:-"+name[i]);
						System.out.println("Press Y or N if you want to save it or no:");
						choice=sc.next();
						if(choice.charAt(0)=='Y'||choice.charAt(0)=='y'){
							f2.delete();	
						}
					}
				}	
			}
			else if(f1.isFile()){
				f1.getName();
				f1.getPath();
				f1.getAbsolutePath();
				f1.isHidden();
				f1.getUsableSpace();
			}
			else{
				System.out.println("Invalid File");
			}
		}
		else{
			System.out.println("Invalid Parameters");
		}	
	}
}