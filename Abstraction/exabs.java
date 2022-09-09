abstract class figure
{
   int dim1;
   int dim2;
   figure(int dim1,int dim2)
   {
     this.dim1=dim1;
     this.dim2=dim2;
   }
   abstract int area();
}
class rect extends figure
{
   rect(int x,int y)
   {
     super(x,y);
   }
   int area()
   {
     System.out.println("Area of Rectangle defined");
     return(dim1*dim2);
   }
}
class triangle extends figure
{
   triangle(int x,int y)
   {
     super(x,y);
   }
   int area()
   {
     System.out.println("Area of Triangle defined");
     return(dim1*dim2/2);
   }
}
class exabs
{
   public static void main(String args[])
   {
      rect r=new rect(4,5);
      triangle t=new triangle(5,6);
      figure fref;
      fref=r;
      System.out.println(fref.area());
      fref=t;
      System.out.println(fref.area());
   }
}