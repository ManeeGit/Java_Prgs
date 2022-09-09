package allprog;
public class ang
{
  private int n,n1,sum=0,r;
  public void compute(int x)
  {
    n=x;
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