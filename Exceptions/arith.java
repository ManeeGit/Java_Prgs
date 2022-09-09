class except
{
   int a;
   public void display()
   {
     try
     { 
       a=5/0;
       System.out.println("Result= "+a);
     }
     catch(ArithmeticException mb)
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