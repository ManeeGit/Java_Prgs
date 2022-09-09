import java.net.*;
import java.io.*;

public class ftpclient{
	public static void main(String args[]){
	Socket s;
	BufferedReader in,br;
	PrintWriter pw;
	String spath,dpath;
	FileOutputStream fos;
	int c;
	try{
 		s=new Socket("localhost",1111);
		in=new BufferedReader(new InputStreamReader(System.in));
		br=new BufferedReader(new InputStreamReader (s.getInputStream()));
		pw=new PrintWriter(s.getOutputStream(),true);
		System.out.println("\n Enter source file to be copied");
		spath=in.readLine();
		System.out.println("\n Enter Destination Path to Transfer:");
		dpath=in.readLine();
		fos=new FileOutputStream(dpath);
		pw.println(spath);
		while((c=br.read())!=-1){
			fos.write((char)c);
			fos.flush();
		}
		System.out.println("File Transfer Completed");
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
}
