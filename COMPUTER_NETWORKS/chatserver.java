import java.io.*;
import java.net.*;
import java.lang.*;

public class chatserver
{
public static void main(String args[])
	throws IOException
	{
ServerSocket ssoc = null;
	try{
	
	ssoc = new ServerSocket(7);
	}
	
	catch(IOException e)
	{
		System.err.println("No Connection Established");
		System.exit(1);
	}
	                        
	Socket csoc = null;
	try
	{	
		csoc=ssoc.accept();
	}
	catch(IOException e)
	{
		System.err.println("not Accepted");
		System.exit(1);
	}
	 	PrintWriter pw = new PrintWriter(csoc.getOutputStream(),true);
	BufferedReader	br = new BufferedReader(new InputStreamReader(csoc.getInputStream()));
	String inline,outline;
	try
	{
	DataInputStream din= new DataInputStream(System.in);
	while(true)
	{
		inline = br.readLine();
		System.out.println("Client : "+inline);
		outline=din.readLine();
		pw.println(outline);
		if(outline.equals("Bye")) break;
	}
	}
	catch(IOException e)
	{
	System.err.println(e);
	}
	pw.close();
	br.close();
	ssoc.close();
	csoc.close();
}
}
