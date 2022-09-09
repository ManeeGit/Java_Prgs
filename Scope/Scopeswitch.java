class swi
{
  char v;
  void val(char x)
  {
    v=x;
  }
  void val2()
  {
    switch (v)
    {
      case 'a': System.out.println("VOWEL!!!");
                break;
      case 'e': System.out.println("VOWEL!!!");
                break;
      case 'i': System.out.println("VOWEL!!!");
                break;
      case 'o': System.out.println("VOWEL!!!");
                break;
      case 'u': System.out.println("VOWEL!!!");
                break;
      default : System.out.println("Learn vowels and then start programming");
                 break;    
      }
   }
  public static void main(String args[])
  {
    swi man=new swi();
    man.val('i');
    man.val2();
  }
}

  