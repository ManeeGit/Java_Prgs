abstract class manee
{
  abstract void name(String n);
  abstract void rollnum(int rol);
  abstract void edu(String ed);
}
class detail extends manee
{
  void name(String n)
  {
    System.out.println("Name: "+n);
  }
  void rollnum(int rol)
  {
    System.out.println("Roll : "+rol);
  }
  void edu(String ed)
  {
    System.out.println("Edu.Qualif: "+ed);
  }
}
class student
{
  public static void main(String args[])
  {
   detail mb=new detail("MANEESH");
    detail bm=new detail(116);
    detali m=new detail("MCA_DUALdeg");
  
    mb.name();
    bm.rollnum();
    m.edu();
  }
}