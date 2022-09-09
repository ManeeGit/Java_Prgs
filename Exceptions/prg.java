class ar
{
    int a;
    public void display()
    {
      try
       {
         int a=5/0;
        }
      catch(ArithmeticException m)
      {
         System.out.println("Result = "+m);
      }
     }
}
class num
{
    public void display1()
    {
       try
       {
          String b="xyz";
          int i=Integer.parseInt(b);
       }
       catch(NumberFormatException mb)
       {
         System.out.println("Result = "+mb);
       }
     }
}
class prg
{
   public static void main(String args[])
   {
     ar mb1=new ar();
     mb1.display();
     num mb2=new num();
     mb2.display1();
    }
}