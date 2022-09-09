class num
{
   static void manee(int a[])
   {
     for(int i=0;i<a.length;++i)
     {
       System.out.println(i);
     }
    }
   public static void main(String args[])
   {
     manee(new int[]{1,2,3,4,5,6,7,8,9});
   }
} 