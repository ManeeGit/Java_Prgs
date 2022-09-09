import java.util.Scanner;
class Factorial
{
   public static void main(String args[])
   {
     int i=1,f=1,n;
     Scanner man=new Scanner(System.in);
     System.out.println("Enter N value\n");
     n=man.nextInt();
     while(i<=n)
     {
       f=f*i;
       i++;
      }
     System.out.println("Factorial ="+f);
   }
}