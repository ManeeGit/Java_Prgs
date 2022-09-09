import java.util.Scanner;
class Biggestnum{
    public static void main(String args[]){
       int a,b;
       Scanner man=new Scanner(System.in);
       System.out.println("Enter A,B values\n");
       a=man.nextInt();
       b=man.nextInt();
       if(a>b)
         System.out.println("BIGnumber="+a);
       else
         System.out.println("BIGnumber="+b);
      }
}