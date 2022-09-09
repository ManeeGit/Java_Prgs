class add
{
  float a,b;
  add(float a,float b)
  {
    this.a=a;
    this.b=b;
  }
  add(int a,int b)
  {
    this.a=a;
    this.b=b;
   }
   void show()
   {
     float c=a+b;
     System.out.println("Result= "+c);
   }
   public static void main(String args[])
   {
      add mb=new add(5.2f,5.2f);
      mb.show();
      add bm=new add(4,6);
      bm.show();
   }
}