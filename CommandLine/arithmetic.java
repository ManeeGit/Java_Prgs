class arithmetic
{
  int a,b;
  void add(int x,int y)
  {
    a=x;
    b=y;
    int c=a+b;
    System.out.println("ADDITION="+c);
  }
  void sub(int x,int y)
  {
    a=x;
    b=y;
    int c=a-b;
    System.out.println("Substraction="+c);
  }
  void mul(int x,int y)
  {
    a=x;
    b=y;
    int c=a*b;
    System.out.println("Multiplication="+c);
  }
  void rem(int x,int y)
  {
    a=x;
    b=y;
    int c=a%b;
    System.out.println("Reminder="+c);
  } 
  void div(int x,int y)
  {
    a=x;
    b=y;
    int c=a/b;
    System.out.println("Division="+c);
  }
  public static void main(String args[])
  {
    arithmetic man=new arithmetic();
    man.add(10,20);
    man.sub(20,10);
    man.mul(5,2);
    man.rem(4,2);
    man.div(50,10);
  }
}