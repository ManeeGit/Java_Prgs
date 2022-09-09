import java.util.Scanner;
class add extends Thread
{
   public void run()
   {
     double a,b,c;
     Scanner mb=new Scanner(System.in);
     System.out.println("Enter the values of a,b: ");
     a=mb.nextDouble();
     b=mb.nextDouble();
     c=a+b;
     System.out.println("Addition : "+c);
     System.out.println("EXIT ADD THREAD");
   }

   public void run()
   {
     double a,b,c;
     Scanner mb1=new Scanner(System.in);
     System.out.println("Enter the values of a,b: ");
     a=mb1.nextDouble();
     b=mb1.nextDouble();
     c=a-b;
     System.out.println("SUBTRACTION : "+c);
     System.out.println("EXIT SUB THREAD");
   }
   public void run()
   {
     double a,b,c;
     Scanner mb2=new Scanner(System.in);
     System.out.println("Enter the values of a,b: ");
     a=mb2.nextDouble();
     b=mb2.nextDouble();
     c=a*b;
     System.out.println("MULTIPLICATION : "+c);
     System.out.println("EXIT MUL THREAD");
   }

   public void run()
   {
     double a,b,c;
     Scanner mb3=new Scanner(System.in);
     System.out.println("Enter the values of a,b: ");
     a=mb3.nextDouble();
     b=mb3.nextDouble();
     c=a/b;
     System.out.println("DIVISION : "+c);
     System.out.println("EXIT DIV THREAD");
   }

  public void run()
   {
     double a,b,c;
     Scanner mb4=new Scanner(System.in);
     System.out.println("Enter the values of a,b: ");
     a=mb4.nextDouble();
     b=mb4.nextDouble();
     c=a+b;
     System.out.println("ModuloDivision : "+c);
     System.out.println("EXIT MODULO_DIV THREAD");
   }
}
class arith
{
   public static void main(String args[])
   {
     add m=new add(); 
     sub b=new sub();
     mul bm=new mul();
     div bm1=new div(); 
     mdiv bm2=new mdiv(); 
     m.run();
     b.run();
     bm.run();
     bm1.run();
     bm2.run();
   }
}








