class arrayintoMethod
{
  static void manee(int a[])
  {
    int manee=a[0];
    for(int i=1;i<a.length;i++)
    {
       if(manee>a[i])
       {
         manee=a[i];
       }

     System.out.println(manee);
    }
  }
 public static void main(String args[])
 {
   int a[]={10,11,12,13,14,15,16,17,18,19};
   manee(a);
 }
}