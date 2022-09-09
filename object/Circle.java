import java.util.Scanner;
class circle{
     public static void main(String args[]){
        float pi=22/7,area,rad,peri;
        Scanner man=new Scanner(System.in);
        System.out.println("Enter radius of the circle\n");
        rad=man.nextFloat();
        area=pi*rad*rad;
        peri=2*pi*rad;
        System.out.println("Area="+area);
        System.out.println("Perimeter="+peri);
       }
  }