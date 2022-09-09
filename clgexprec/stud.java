class student 
{ 
 int rollNo; 
 void getNumber(int n) 
 { 
  rollNo=n; 
 } 
 void putNumber() 
 { 
  System.out.println("Roll No is: "+ rollNo); 
 } 
} 
 class test extends student 
{ 
 int part1, part2; 
 void getMarks(int m1, int m2) 
 { 
  part1=m1; 
  part2=m2; 
 } 
 void putMarks() 
 { 
  System.out.println("Marks obtained:"); 
  System.out.println("Part 1 marks = "+part1); 
  System.out.println("Part 2 marks = "+part2); 
 } 
} 
 interface sports 
{ 
 int sportsWt=5; 
 void putWt(); 
} 
 class results extends test implements sports 
{ 
 int total; 
 public void putWt() 
 { 
   System.out.println("Sports wieght = "+ sportsWt); 
 }  
 void display() 
{ 
  total=part1+part2+sportsWt; 
  putNumber(); 
  putMarks(); 
  putWt(); 
  System.out.println("Total score = "+ total); 
 } 
} 
 class interfaceExample2 
{ 
 public static void main(String args[]) 
 { 
  results r1=new results(); 
  r1.getNumber(10); 
  r1.getMarks(50,60); 
  r1.display(); 
 } 
} 
