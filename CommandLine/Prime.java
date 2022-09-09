class Prime
{
   public static void main(String args[])
   {
      int n,i,count=0;
      n=Integer.parseInt(args[2]);
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
      }
}
