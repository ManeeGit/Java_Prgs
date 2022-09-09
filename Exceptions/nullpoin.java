class except
{
   public void display()
   {
     try
     { 
       String s=null;
       System.out.println("Result= "+s.length());
     }
     catch(NullPointerException mb)
     {
       System.out.println("Result: "+mb);
     }
    }
    public static void main(String args[])
    {
      except m=new except();
      m.display();
     }
}