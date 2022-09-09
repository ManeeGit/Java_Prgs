 class big2
{
   int a,b;
  big2(int a,int b)
  {
    this.a=a;
    this.b=b;
  }
 void show()
  {
    String result1=(a>b)?a+" is big value":b+" is big value";
    System.out.println(result1);
  }
}
class big3 extends big2
{
  int c;
  big3(int a,int b,int c)
  {
    super(a,b);
    this.c=c;
  }
  void show2()
  {
    if(a>b && a>c)
    {
      System.out.println(a+" is the biggest value");
    }
    else if(b>a && b>c)
    {
      System.out.println(b+" is the biggest value");
    }
    else
       System.out.println(c+" is the biggest number");
   }
}
class bigInheritence
{
  public static void main(String[] args)
  {
    big2 mb=new big2(1,10);
    mb.show();
    big3 bm=new big3(3,4,7);
    bm.show2();
  }
}