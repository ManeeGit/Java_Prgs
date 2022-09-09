class lab1
{
	int n,n1,r1,v=0;
	lab1(int n)
	{
	  this.n=n;
	}
	 void show()
	{
	  n1=n;
	  while(n1>0)
      {
        r1=n1%10;
        v=v*10+r1;
        n1=n1/10;
      }
      if(n==v)
        System.out.println("Palindrome="+n);
      else
        System.out.println("The Given Number is not palindrome");
	}
}
class lab2 extends lab1
{
	int n2,a=0,b=1,c;
	lab2(int n)
	{
	  super(n);
	  n2=n;
	}
	void show()
	{
	  System.out.println("The Fibbonacci series: ");
	  while(n2>0)
      {
        c=a+b;
        System.out.println(" "+c);
        a=b;
        b=c;
        n2--;
      }
	}
}
class lab3 extends lab1
{
	int i=1,f=1,n3;
	lab3(int n)
	{
		super(n);
		n3=n;
	}
	void show()
	{
	   while(i<=n3)
       {
        f=f*i;
        i++;
       }
       System.out.println("Factorial="+f);
	}
}
class lab4 extends lab1
{
	int n4,n5,sum=0,r2;
	lab4(int n)
	{
		super(n);
		n4=n;
	}
	void show()
	{

	     n5=n4;
         while(n1>0)
         {
          r2=n5%10;
          sum=sum+(r2*r2*r2);
          n5=n5/10;
         }
         if(sum==n4)
           System.out.println("The Given Number Is Angstrom:"+n4);
        else
           System.out.println("The Given Number Is NOT Angstrom:"+n4);
    }
}
class exp1
{
	public static void main(String args[])
	{
		lab1 mb=new lab1(121);
		lab2 bm=new lab2(5);
		lab3 m=new lab3(5);
		lab4 ind=new lab4(153);
		mb.show();
		bm.show();
		m.show();
	    ind.show();
	}
}

