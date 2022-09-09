class except
{
   public void display()
   {
     try
     { 
       String s="abc";
       int i=Integer.parseInt(s);
     }
     catch(NumberFormatException mb)
     {
       System.out.println("Result: "+mb);
     }
    }
    public static void main(String args[])
    {
      except m=new except();
      m.display();
     }
}