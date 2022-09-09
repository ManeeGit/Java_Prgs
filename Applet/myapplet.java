import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class myapplet extends Applet
{
	String a="MANEESH MALEPATI";
	String b="Student ";
	public void init()
	{
	  System.out.println("Applet is Born & Ready to start");
	  setBackground(Color.black);
	}
	public void start()
	{
	   System.out.println("Applet is Running manee");
	}
	public void stop()
	{
	   System.out.println("Applet stopped manee");
	}
	public void paint(Graphics g)
	{
	   g.setColor(Color.green);
	   g.drawString("Name: "+a,50,50);
	   g.setColor(Color.red);
	   g.drawString("Proffession: "+b,50,75);
	}
	public void destroy()
	{
	   System.out.println("Applet Destroyed manee");
	}
}
/*<applet code="myapplet.class" height="500" width="400"></applet>*/