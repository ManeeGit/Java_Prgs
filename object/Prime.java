import java.util.Scanner;
class Prime
{
   public static void main(String args[])
   {
     int n,i,count=0;
     Scanner man=new Scanner(System.in);
     System.out.println("Enter N value\n");
     n=man.nextInt();
     for(i=1;i<=n;i++)
     {
       if(n%i==0)
        {
          count++;
        }
     }
     if(count==2)
     {   
        System.out.println("The Number is Prime:"+n);
     }
     else
      {
        System.out.println("The Number is composite:"+n);
       }
     }
} 