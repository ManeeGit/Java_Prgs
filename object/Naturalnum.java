import java.util.Scanner;
class Naturalnumbers
{
    public static void main(String args[]){
       int n,sum=0,a=1;
       Scanner manu=new Scanner(System.in);
       System.out.println("Enter N value\n");
       n=manu.nextInt();
       while(a<=n)
       {
          sum=sum+a;
          a++;
        }
       System.out.println("Sum Of N Natural numbers="+sum);
      }
}