import java .io.*;
import java.net.*;
import java.lang.*;

public class https{
	public static void main(String args[]) throws Exception {
		ServerSocket ssoc = new ServerSocket(1111);
		System.out.println("Server waiting for client");
		Socket soc=ssoc.accept();
		System.out.println("client connected to the Server:\n");
		BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
		PrintWriter pw=new PrintWriter(soc.getOutputStream(),true);
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int ch;
 		do{
			ch=Integer.parseInt(br.readLine());
			String file;
			byte line[]=null;
			File f;
			switch(ch) {
				case 1:
					System.out.println("1.Head");
					file =br.readLine();
					f=new File(file) ;
					int index = file.lastIndexOf(".");
					String type = file.substring(index+1);
					pw.println(type);
					long length=f.length();
					pw.println(length);
					break;
				case 2:
					System.out.println("2.Post");
					file =br.readLine();
					System.out.println("Message from Client : \n");
					System.out.println(file);
					break;
				case 3:
					System.out.println("3.Get");
					file =br.readLine();
					FileInputStream fs = new FileInputStream(file);
					while(fs.available()!=0){
						if(fs.available()<1024)
							line =new byte[fs.available()];
						else line =new byte[1024];
						fs.read(line);
						file = new String (line);
						pw.println(file);
					}
					pw.println("***");	
					fs.close();
					break;
				case 4:
					System.out.println("4.Delete");
					file =br.readLine();
					f=new File(file) ;
					f.delete();
					break;
				case 5 :
					System.out.println("Other-Exit");
					System.exit(0);			
			}
		}while(ch>0&&ch<5);
	soc.close();
	ssoc.close();
	}
	
}

