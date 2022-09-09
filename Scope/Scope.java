class add
{
  int a,b;
  void set(int x,int y)
  {
     a=x;
     b=y;
   }
  void show()
  {
     int c=a+b;
     System.out.println("Result="+c);
   }
}
class Scope
{
  public static void main(String args[])
  {
    add obj=new add();
    obj.set(10,20);
    obj.show();
   }
}





