class rectangle
{
  float len,bred;
  rectangle (float x,float y)
  {
    len=x;
    bred=y;
  }
  rectangle ()
  {
    len=3.2f;
    bred=1.2f;
  }
  void show()
  {
    float area=len*bred;
    System.out.println("Area of rectangle= "+area);
  }
  public static void main(String args[])
  {
    rectangle m=new rectangle(5.2f,3.2f);
    m.show();
    rectangle b=new rectangle();
    b.show();
  }
}