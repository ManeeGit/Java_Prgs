package allprog;
public class prime
{
  private int n,i,count=0;
  public void compute3(int x)
   {
     n=x;
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