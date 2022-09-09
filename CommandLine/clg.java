class clg
{
  int a;
  String b;
  static String c="kcdc";
  void set(int a, String b)
  {
    this.a=a;
    this.b=b;
  }
  void show()
  {
    System.out.println("rollnum="+a+" name:"+b+ " college:"+c);
  }
  public static void main(String args[])
  {
    clg man=new  clg();
    man.set(100,"MANEESH");
    man.show();
  }
}
