class except
{
   public void display()
   {
    try
    { 
      int a[]=new int[10];
      a[11]=20; 
      System.out.println("Reslut:"+a[3]);
    }
    catch(ArrayIndexOutOfBoundsException mb)
     {
       System.out.println("Reslut:"+mb);
      }
    }
    public static void main(String args[])
    {
      except m=new except();
      m.display();
     }
}