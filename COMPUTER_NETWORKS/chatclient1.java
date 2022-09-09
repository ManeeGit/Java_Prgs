import java.io.*;
import java.net.*;
import java.lang.*;

public class chatclient1
{
public static void main(String args[])
	throws IOException
	{
	Socket csoc = null;
	String host;
	if(args.length>0)
	host=args[0];
	else host="localhost";
	PrintWriter pout=null;
	BufferedReader bin=null;
	try
	{
		csoc = new Socket(host,7);
		pout = new PrintWriter(csoc.getOutputStream(),true);
		bin = new BufferedReader(new InputStreamReader(csoc.getInputStream()));	
	}
	catch(UnknownHostException e)
	{
		System.err.println("unknown Host");
		System.exit(1);
	}
	catch(IOException e){}
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	String input;
	while(true)
	{
		input = in.readLine();
		pout.println(input);
		String msg=bin.readLine();
		System.out.println("Server: "+msg);
		if(msg.equals("Bye")) break;
	}
	in.close();
	pout.close();
	bin.close();
	csoc.close();
	}
}
