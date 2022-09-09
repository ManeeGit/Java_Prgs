package allprog;
public class palin
{
    private int n,n1,r,v=0;
    public void compute2(int x)
    {
      n=x;
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
         System.out.println("The Given Number is not palindrome");
    }
}