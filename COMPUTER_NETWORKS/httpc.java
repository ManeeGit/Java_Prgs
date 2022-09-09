import java.io.*;
import java.net.*;
import java.lang.*;

public class httpc{
public static void main(String args[]) throws Exception{
	Socket soc=new Socket ("localhost",1111);
	BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
	PrintWriter pw=new PrintWriter(soc.getOutputStream(),true);
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Server is connected\n");
	int ch;
	do{
		System.out.println("commands");
		System.out.println("\n 1.head \n 2.post \n 3.get \n 4.delete \n other-exit");
		System.out.println("Enter ur choice");
		ch=Integer.parseInt(in.readLine());
		byte line[]=null;
		String file;
		switch(ch){
			case 1:
				pw.println("1");
				file = in.readLine();
				pw.println(file);
				String type=br.readLine();
				String length= br.readLine();
System.out.println("File:"+file+"  In type:"+type+"In length:"+length);
				break;
			case 2:
				pw.println("2");
				System.out.println("Enter text to post");
				file = in.readLine();
				pw.println(file);
				System.out.println("Text is posted.");
				break;
			case 3:
				pw.println("3");
				System.out.println("enter file name to get : ");
				file =in.readLine();
				pw.println(file);
				System.out.println("enter file name to save : ");
				file =in.readLine();
				FileOutputStream fs = new FileOutputStream(file);					
				while(true){
					String s = br.readLine();
					if(s.equals("***"))
						break;
					int count =s.length();
					if(count<1024)
						line=new byte[1024];
					line=s.getBytes();
					fs.write(line);
				}	
				fs.close();
				System.out.println("\n File transfer Succesful");
				break;
			case 4:
				pw.println("4");
				System.out.println("enter file name to delete: ");
				file=in.readLine();
				pw.println(file);
				System.out.println("Given file deleted:");
				break;
			default:
				pw.println("5");
				System.exit(0);
		}
	}while(ch>0&&ch<5);
soc.close();
}
}

