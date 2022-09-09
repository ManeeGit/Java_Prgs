import java.net.*;
import java.io.*;
public class ftpserver{
	public static void main(String args[]){
	Socket s;
	ServerSocket server;
	BufferedReader br;
	PrintWriter pw;
	String filename;
	FileInputStream fis;
	int c;
	try{
 		server=new ServerSocket(1111);
		System.out.println("Server Waiting for Connection:\n");
		s=server.accept();
		System.out.println("Connection Established:\n");
		br=new BufferedReader(new InputStreamReader (s.getInputStream()));
		pw=new PrintWriter(s.getOutputStream());
		filename=br.readLine();
		fis=new FileInputStream(filename);
		while((c=fis.read())!=-1){
			pw.print((char)c);
			pw.flush();
		}
		System.out.println(filename +  "copied to destination");
		s.close();
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
}
