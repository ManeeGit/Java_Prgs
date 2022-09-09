import java.util.Scanner;
class SwitchVowelExample 
{
     char v; 
     void val()
     {
       Scanner m=new Scanner(System.in);
       System.out.println("Enter any charecter: ");
       v= m.next().charAt(0);
     }
     void val2()
     {
       switch(v)  
       {  
         case 'a':
         case 'A':   
                  System.out.println(v+" is a Vowel");  
                  break;  
         case 'e':
         case 'E':   
                  System.out.println(v+" is a Vowel");  
                  break;  
         case 'i':
         case 'I':   
                  System.out.println(v+" is a Vowel");  
                  break;  
         case 'o':
         case 'O':   
                  System.out.println(v+" is a Vowel");  
                  break;  
         case 'u':
         case 'U':   
                  System.out.println(v+" is a Vowel");  
                  break;  
       
         default : System.out.println(v+" is a Consonant");
                  break;
         }  
      }    
      public static void main(String args[])
      {
        SwitchVowelExample mb=new SwitchVowelExample();
        mb.val();        
        mb.val2();
      }
}