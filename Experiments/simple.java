import java.util.Scanner;
class simple
{
  public static void main(String args[])
  {
    double p,t,r,si;
    Scanner mb=new Scanner(System.in);
    System.out.println("Maneesh.Malepati is calcing the Simple_interest of an emp");
    p=mb.nextDouble();
    t=mb.nextDouble();
    r=mb.nextDouble();
    si=(p*t*r)/100;
    System.out.println("Simple Interest: "+si);
  }
}  