class manee
{
  int roll;
  String name,college;
  manee(int roll,String name,String college)
  {
    this.roll=roll;
    this.name=name;
    this.college=college;
  }
  void show()
  {
     System.out.print(roll+" "+name+" "+college);
  }
  public static void main(String args[])
  {
    manee mb=new manee(116,"MANEESH");
    mb.show();
  }
}