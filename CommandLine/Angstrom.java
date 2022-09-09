class Angstrom
{
   public static void main(String args[])
   {
     int n,n1,sum=0,r;
     n=Integer.parseInt(args[0]);
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
    }
}