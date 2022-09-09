import java.util.Scanner;
class cla
{
  int num1,num2,res;
  void set()
  {
    Scanner man=new Scanner(System.in);
    num1=man.nextInt();
    num2=man.nextInt();
    res=num1+num2;
  }
  void add()
  {
    System.out.println("Result= "+res);
  }
  public static void main(String args[])
  {
    cla manu=new cla();
    manu.set();
    manu.add();
  }
}