class Rectangle
{
   public static void main(String args[])
   {
     float l=Float.parseFloat(args[0]);
     float b=Float.parseFloat(args[1]);
     float ar=l*b;
     float peri=2*(l+b);
     System.out.println("Area of Rectangle="+ar);
     System.out.println("Perimeter ="+peri);
   }
}