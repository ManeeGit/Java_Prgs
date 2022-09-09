interface experiment
{
  public float compute(float x,float y);
}
class rectangle implements experiment
{
  public float compute(float x,float y)
  {
    return(x*y);
  }
  public static void main(String args[])
  {
    rectangle mb=new rectangle();
    System.out.println("Area of Rectangle = "+ mb.compute(5.2f,2.3f));
  }
}