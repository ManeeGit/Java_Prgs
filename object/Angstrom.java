import java.util.Scanner;
class Angstrom
   {
     public static void main(String args[])
     {
       int n1,n,sum=0,r;
       Scanner men=new Scanner(System.in);
       System.out.println("Entere N value\n");
       n=men.nextInt();
       n1=n;
       while(n1>0)
       {
          r=n1%10;
          sum=sum+(r*r*r);
          n1=n1/10;
        }
        if(sum==n)
             System.out.println("The Entered Value is Angstrom Number ="+n); 
         else 
           System.out.println("The Entered number is not angstrom="+n);
       }
}


 