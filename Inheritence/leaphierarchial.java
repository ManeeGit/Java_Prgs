class leap1
{
  int y1;
  leap1(int y1)
  {
    this.y1=y1;
  }
  void show()
  {
    if((y1%4==0) && ((y1%400==0) || (y1%100!=0)) )
     {
       System.out.println(y1+" is LEAP year");
     }
    else
      System.out.println(y1+" is NOT LEAP year");
   }
}
class leap2 extends leap1
{
  int y2;
  leap2(int y1)
  {
    super(y1);
    this.y2=y1;
  }
  void show()
  {
   if((y2%4==0) && ((y2%400==0) || (y2%100!=0)) )
     {
       System.out.println(y2+" is LEAP year");
     }
    else
      System.out.println(y2+" is NOT LEAP year");
   }
}
class leap3 extends leap1
{
  int y3;
  leap3(int y1)
  {
    super(y1);
    this.y3=y1;
  }
  void show()
  {
    if((y3%4==0) && ((y3%400==0) || (y3%100!=0)))  
     {
       System.out.println(y3+" is LEAP year");
     }
    else
      System.out.println(y3+" is NOT LEAP year"); 
   }
}
class leaphierarchial
{
  public static void main(String args[])
  {
    leap3 mb=new leap3(2004);
    leap2 bm=new leap2(2002);
    leap1 m=new leap1(2000);
    mb.show();
    bm.show();
    m.show();
  }
}