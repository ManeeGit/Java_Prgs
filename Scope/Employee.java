class employee
{
   int empno;
   String empname;
   float bsal,hra,pf;
   void set(int x,String y,float sa,float hr,float p)
   {
     empno=x;
     empname=y;
     bsal=sa;
     hra=hr;
     pf=p;
     
   }
   void company()
   {
     float netsal=bsal+hra+pf;
     System.out.println("Employee name: "+empname);
     System.out.println("Employee ID number :"+empno);
     System.out.println("Employee net salary ="+netsal);
   }
   public static void main(String args[])
   {
     employee manee=new employee();
     manee.set(116,"MANEESH",5000f,700.0f,800.0f);
     manee.company();
    }
}