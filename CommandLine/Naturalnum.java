class Naturalnum
{
    public static void main(String args[])
    {
      int n,sum=0,a=1;
      n=Integer.parseInt(args[0]);
      while(a<=n)
      {
         sum=sum+a;
         a++;
       }
      System.out.println("SUM of %d naturals= "+n+sum);
    }
}