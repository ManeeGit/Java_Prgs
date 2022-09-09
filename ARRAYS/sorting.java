import java.util.Arrays;   
public class sorting  
{   
  public static void main(String[] args)   
  {   
    int a[]=new int [] {10,7,4,6,9,8,3,5,1,2};  
    Arrays.sort(a);   
    System.out.println("Elements of array sorted in ascending order: ");  
    for (int i = 0; i < a.length; i++)   
    {       
       System.out.println(a[i]);   
    }   
  }  
}  