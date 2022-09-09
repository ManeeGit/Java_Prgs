class Fibonacci
{
   public static void main(String args[])
   {
      int n,a=0,b=1,c;
      n=Integer.parseInt(args[0]);
      while(n>0)
      {
        c=a+b;
        System.out.print(" "+c);
        a=b;
        b=c;
        n--;
       }
     }
}