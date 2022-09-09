class exception
{
        int a;

        public void display()
        {
            try
           {
                int a=5/2;
                System.out.println("Result = "+a);
                String b="xyz";
                int i=Integer.parseInt(b);
                System.out.println("Number = "+i);
                String s=null;
                System.out.println("Result= "+s.length());
            }
          catch(ArithmeticException m)
          {
                 System.out.println("Result = "+m);
           }
 
          catch(NumberFormatException c)
          {
               System.out.println("Result = "+c);
          }
          catch(NullPointerException mb)
          {
           System.out.println("Result: "+mb);
          }
     }

   public static void main(String args[])
   {
          exception mb1=new exception();
          mb1.display();    
    }
}




