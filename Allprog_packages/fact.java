package allprog;
public class fact
{
    private int i=1,f=1,n;
    public void compute1(int x)
    {
      n=x;
      while(i<=n)
      {
        f=f*i;
        i++;
      }
      System.out.println("Factorial="+f);
    }
}