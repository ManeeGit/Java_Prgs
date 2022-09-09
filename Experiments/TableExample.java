import javax.swing.*;    
public class table 
{    
    JFrame f;    
    TableExample()
    {    
      f=new JFrame();    
      String data[][]={ {"116","Maneesh","900000000"},    
                          {"4","Bhavana","900000000"}
                        };    
      String column[]={"ID","NAME","SALARY"};         
      JTable jt=new JTable(data,column);    
      jt.setBounds(30,40,200,300);          
      JScrollPane sp=new JScrollPane(jt);    
      f.add(sp);          
      f.setSize(300,400);    
      f.setVisible(true);    
    }     
    public static void main(String[] args)
   {    
      new table();    
   }    
}  