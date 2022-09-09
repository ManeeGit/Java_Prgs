
import java.util.Scanner;
class ang extends Thread
{
  public void run()
  {
    int n,n1,sum=0,r;
     Scanner mb=new Scanner(System.in);
     System.out.println("Enter ANGSTROM value");
     n=mb.nextInt();
     n1=n;
     while(n1>0)
     {
        r=n1%10;
        sum=sum+(r*r*r);
        n1=n1/10;
      }
     if(sum==n)
       System.out.println("The Given Number Is Angstrom:"+n);
     else
       System.out.println("The Given Number Is NOT Angstrom:"+n);
    System.out.println("Exit ANGSTROM thread");
   }
}
class prime extends Thread
{
   public void run()
   {
     int n,i,count=0;
      Scanner mb1=new Scanner(System.in);
      System.out.println("Enter PRIME value");
      n=mb1.nextInt();
      for(i=1;i<=n;i++)
      {
          if(n%i==0)
           {
             count++;
            }
       }
      if(count==2)
      {
         System.out.println("The number is Prime="+n);
       }
       else
        {
           System.out.println("The number is Composite="+n);
        }
      System.out.println("Exit PRIME thread");
    }
}
class fibo extends Thread
{
   public void run()
   {
     int n,a=0,b=1,c;
       Scanner mb2=new Scanner(System.in);
       System.out.println("Enter FIBONACCI value");
       n=mb2.nextInt();
      while(n>0)
      {
        c=a+b;
        System.out.println(" "+c);
        a=b;
        b=c;
        n--;
       }
     System.out.println("Exit Fibonacci thread");
    }
}
class fact extends Thread
{
   public void run()
   {
     int i=1,f=1,n;
       Scanner mb3=new Scanner(System.in);
     System.out.println("Enter FACTORIAL value");
     n=mb3.nextInt();
      while(i<=n)
      {
        f=f*i;
        i++;
      }
      System.out.println("Factorial="+f);
     System.out.println("Exit Factorial thread");
    }
}
class palin extends Thread
{
  public void run()
  {
    int n,n1,r,v=0;
      Scanner mb4=new Scanner(System.in);
      System.out.println("Enter PALINDROME value");
      n=mb4.nextInt();
      n1=n;
      while(n1>0)
      {
        r=n1%10;
        v=v*10+r;
        n1=n1/10;
       }
      if(n==v)
         System.out.println("Palindrome="+n);
       else
        { System.out.println("The Given Number is not palindrome");}
      System.out.println("Exit PALINDROME thread");
    }
}
class natural extends Thread
{
   public void run()
   {
     int n,sum=0,a=1;
       Scanner mb5=new Scanner(System.in);
     System.out.println("Enter NATURAL value");
     n=mb5.nextInt();
      while(a<=n)
      {
         sum=sum+a;
         a++;
       }
      System.out.println("SUM of %d naturals= "+n+sum);
     System.out.println("Exit Natural thread");
    }
}
class alprogs 
{
  public static void main(String args[])
  {
    ang a=new ang();
    a.run();
    
    prime b=new prime();
    b.run();
   
    fibo c=new fibo();
    c.run();
   
    fact d=new fact();
    d.run();
   
    palin e=new palin();
    e.run();
   
    natural f=new natural();
    f.run();
    
  }
}
     