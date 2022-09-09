import java.util.Scanner;
class EvenOrOdd
{
   public static void main(String args[])
   {
       int a;
       Scanner man=new Scanner(System.in);
       System.out.println("Enter the Number=");
       a=man.nextInt();
       if(a%2==0)
       {
         System.out.println("The NUMBER is EVEN="+a);
       }
       else
       {
         System.out.println("The number is ODD="+a);
        }
     }
}