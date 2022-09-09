import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
      int n,n1,r,v=0;
      Scanner man=new Scanner(System.in);
      System.out.println("Enter N value=");
      n=man.nextInt();
      n1=n;
      while(n1>0)
      {
         r=n1%10;
         v=v*10+r;
         n1=n1/10;
      }
      if(n==v)
        System.out.println("Palindrome ="+n);
      else
        System.out.println("The Given Number is not Palindrome");
    }
}