class condi
{
  int a,b;
  void set(int x,int y)
  {
    a=x;
    b=y;
  }
  void big()
  {
    if(a>b)
      System.out.println("a is Bigger value i.e ="+a);
    else
      System.out.println("b is Bigger value i.e"+b);
   }
  public static void main(String args[])
  {
    condi man=new condi();
    man.set(20,10);
    man.big();
   }
}