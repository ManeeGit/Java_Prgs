abstract class Semister2  
{  
    abstract void porep();  
    void negrep()  
    {  
       System.out.println("The classes not started");  
    }  
}  
   
public class Students extends Semister2  
{  
   void porep()  
   {  
      System.out.println("The classes alredy started");  
   }  
   public static void main(String[] args)  
   {  
     Students mb= new Students();  
     mb.porep(); 
     mb.negrep();  
   }  
}  