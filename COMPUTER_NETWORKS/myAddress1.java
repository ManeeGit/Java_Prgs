//Print the IP address of the local machine & host name
import java.net.*;
class myAddress1 {
  public static void main (String args[]) {
    try {
// To get local machine’s IP address      
InetAddress address = InetAddress.getLocalHost();
     	 System.out.println("\n IP Address is: "+address);
	
// To get the local machine’s name
String s1=address.getHostName();
	System.out.println("System name is: "+s1);
    }
    catch (UnknownHostException e) {
      System.out.println("Could not find this computer's address.");
    }
  }
}
