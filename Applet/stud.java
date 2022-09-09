import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class stud extends Applet implements ActionListener
{
  String a=new String();
  String b=new String();
  String c=new String();
  TextField t1,t2,t3;
  Label l1,l2,l3;
  Button v1,v2;
  public void init()
  {
	setBackground(Color.pink);
	t1=new TextField(10);
	t2=new TextField(10);
        t3=new TextField(10);
	l1=new Label("SAN number");
        l2=new Label("STUDENT NAME");
	l3=new Label("Course");
	v1=new Button("SUBMIT");
	v2=new Button("CANCEL");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(v1);
		add(v2);
	v1.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
    a=t1.getText();
    b=t2.getText();
    c=t3.getText();
    repaint();
  }
  public void paint(Graphics g)
  {
    g.setColor(Color.white);
    g.drawString("Student Number= "+a,50,50);
    g.setColor(Color.white);
    g.drawString("Student Name= "+b,75,75);
    g.setColor(Color.white);
    g.drawString("Course= "+c,100,100);
  }
}
/*<applet code="stud.class" width="600" height="700">
  </applet>*/