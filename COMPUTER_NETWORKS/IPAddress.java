import java.net.*;
public class IPAddress 
{
  public static void main (String args[]) 
	{
	try 
		{
     		InetAddress  addresses =   InetAddress.getByName("www.yahoo.com");

		System.out.println(addresses);
          		}
    	catch (UnknownHostException ex) 
		{
     	 	System.out.println("Could not find www.yahoo.com");
   		}
	}
}
