class bigger
{
  int a,b;
  bigger(int a,int b)
  {
    this.a=a;
    this.b=b;
  }
  bigger()
  {
    a=10;
    b=20;
   }
   void tere()
   {
     String great=(a>b)?a+" is biggest value":b+" is biggest value";
     System.out.println(great);
    }
   public static void main(String args[])
   {
     bigger m=new bigger(11,121);
     m.tere();
     bigger b=new bigger();
     b.tere();
    }
}