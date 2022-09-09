class Factorial
{
    public static void main(String args[])
    {
      int i=1,f=1,n;
      n=Integer.parseInt(args[2]);
      while(i<=n)
      {
        f=f*i;
        i++;
      }
      System.out.println("Factorial="+f);
    }
}