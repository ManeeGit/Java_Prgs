import java.util.Scanner;
class Fibonacci
{
   public static void main(String args[])
   {
     int n,a=0,b=1,c;
     Scanner man=new Scanner(System.in);
     System.out.println("Enter n value\n");
     n=man.nextInt();
     while(n>0)
     {
       c=a+b;
       System.out.println(" "+c);
       a=b;
       b=c;
       n--;
     }
   }
}