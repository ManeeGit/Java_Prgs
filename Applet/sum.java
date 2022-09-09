import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class sum extends Applet implements ActionListener
{
  int a,b,c;
  TextField t1,t2,t3;
  Label l1,l2,l3;
  Button m;
  public void init()
  {
    t1=new TextField(10);
    t2=new TextField(10);
    t3=new TextField(10);
    l1=new Label("Enter First value");
    l2=new Label("Enter Seconbd value");
    l3=new Label("Result");
    m=new Button("ADD");
      add(l1);
      add(t1);
      add(l2); 
      add(t2);
      add(l3);
      add(t3);
      add(m);
    m.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
    a=Integer.parseInt(t1.getText());
    b=Integer.parseInt(t2.getText());
    c=a+b;
    t3.setText(Integer.toString(c));
  }
}

/* 
  <applet code="sum.class" width="200" Height="300">
   </applet>
  */