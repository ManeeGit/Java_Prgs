interface values
{
  final static double p=3.14;
  public void circle(double r);
  public void rect(double l,double b);
}
class area implements values
{
   public void circle(double r)
   {
     System.out.println("Area of circle= "+(p*r*r));
   }
   public void rect(double l,double b)
   {
     System.out.println("Area of Rectangle= "+(l*b));
   }
   public static void main(String args[])
   {
     area mb=new area();
     mb.circle(7.2);
     mb.rect(2.2,3.3);
   }
}
