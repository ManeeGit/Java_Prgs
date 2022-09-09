import java.util.Scanner;
class addition
{
    public static void main(String args[])
    {
       int a,b,c;
       Scanner man=new Scanner(System.in);
       System.out.println("Enter a,b values\n");
       a=man.nextInt();
       b=man.nextInt();
       c=a+b;
       System.out.println("Result="+c);
     }
}