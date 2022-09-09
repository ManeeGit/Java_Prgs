import java.util.Scanner;

   class Rectangle
   {
      public static void main(String args[])
      {
       int l,b,ar,peri;
       Scanner fan=new Scanner(System.in);
       System.out.println("Enter Length & Breadth values\n");
       l=fan.nextInt();
       b=fan.nextInt();
       ar=l*b; 
       peri=2*(l+b);
       System.out.println("AREA="+ar);
       System.out.println("PERIMETER="+peri);
      }
}
