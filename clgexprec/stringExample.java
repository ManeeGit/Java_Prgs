class stringExample 
{ 
  public static void main(String args[]) 
  { 
    StringBuffer str=new StringBuffer("Object Oriented Language"); 
  System.out.println("Original String: "+str); 
   
  //obtaining string length 
  System.out.println("The length of string is "+ str.length());   
//Modifying Charecters 
  str.setCharAt(6,'-'); 
  System.out.println("updated string is: "+str); 
   
  //Appending a string at the end. 
  str.append(" improves security."); 
  System.out.println("string after append is: "+str); 
   
  //accessing charecters in a string 
  for(int i=0;i<str.length();i++) 
  { 
   System.out.println("Charecter at position "+(i+1)+" is "+str.charAt(i)); 
  } 
  } 
} 
