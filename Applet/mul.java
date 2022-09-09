import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class mul extends Applet implements ActionListener
{
  int a,b,c;
  TextField t1,t2;
  Label l1,l2;
  Button m;
  public void init()
  {
    t1=new TextField(10);
    t2=new TextField(10);
    l1=new Label("First value");
    l2=new Label("Second Value");
    m=new Button("MULTIPLICATION");
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(m);
	m.addActionListener(this);
   }
   public void actionPerformed(ActionEvent mb)
   {
      a=Integer.parseInt(t1.getText());
      b=Integer.parseInt(t2.getText());
      c=a*b;
      repaint();
   }
   public void paint(Graphics g)
   {
     g.drawString("THE RESULT= "+c,50,50);
    }
}

/*<applet code="mul.class" width="200" height="300">
   </applet>*/