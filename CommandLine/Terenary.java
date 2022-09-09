class Terenary
{
  public static void main(String args[])
  {
    int a=Integer.parseInt(args[0]);
    String output=(a%2==0)?a+" is Even":a+" is Odd";
    System.out.print(output);
   }
}