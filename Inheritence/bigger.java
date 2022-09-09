class large
{
  static int a,b;
  large(int a,int b)
  { 
    this.a=a;
    this.b=b;
  }
  void show()
  {
    String res=(a>b)?a+" is the Biggest number":b+" is the biggest number";
    System.out.println(res);
  }
}
class large2 extends large
{
   static int c;
   large2(int a,int b,int c)
   {
     super(a,b);
     this.c=c;
   }
   void show()
   {
       if(a>b && a>c)
       {
         System.out.println(a+" is the biggest number");
       }
       else if(b>a && b>c)
       {
        System.out.println(b+" is the biggest number");
       }
       else
       {
       System.out.println(c+" is the biggest number");
       }
   }
}
class large3 extends large2
{
   static int d;
   large3(int a,int b,int c,int d)
   {
     super(a,b,c);
     this.d=d;
   }
   void show()
   {
     if(a>b && a>c && a>d)
     {
       System.out.println(a+" is the biggest value");
     }
     else if(b>a && b>c && b>d)
     {
       System.out.println(b+" is the biggest value");
     }
     else if(c>a && c>b && c>d)
     {
       System.out.println(c+" is the biggest number");
     }
     else 
     {
       System.out.println(d+" is the biggest number");
      }
    }
}
class bigger
{
   public static void main(String args[])
   {
     large3 mb=new large3(2,3,4,5);
     mb.show();
     large2 bm=new large2(4,7,9);
     bm.show();
     large m=new large(10,20);
     m.show();
   }
}  
    