interface exp1
{
   public void big1(int a,int b);
}
interface exp2 extends exp1
{
  public void big2(int a,int b,int c);
}
class bigg implements exp2
{
  
   String m;
   public void big1(int a,int b)
   {
     m=(a>b)?a+" is the biggest":b+" is the biggest";
     System.out.println(m);
   }
   public void big2(int a,int b,int c)
   {    
     if(a>b && a>c)
        System.out.println(a+ " is the Biggest");
     else if(b>a && b>c)
        System.out.println(b+ " is the biggest");
     else
        System.out.println(c+ " is the biggest");
    }
   public static void main(String args[])
   {
      bigg mb=new bigg();
      mb.big1(5,9);
      mb.big2(23,32,55);
   }
}