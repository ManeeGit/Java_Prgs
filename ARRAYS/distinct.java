class distinct
{  
  public static int unique(int arr[], int n)
  {  
        if (n==0 || n==1)
        {  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++)
        {  
            if (arr[i] != arr[i+1])
            {  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];      
        for (int i=0; i<j; i++)
        {  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args)
    {  
        int i,sum=0;
        int arr[] = {4,4,4,5,5,6,6,6,10,10};  
        int length = arr.length;  
        length = unique(arr, length);    
        for (i=0; i<length; i++)
        {  
           System.out.print(arr[i]+" ");
        }
        while(arr[i]++==10000000)
        {
           sum=sum+arr[i];
	   arr[i]++;
        }
        System.out.println(sum);
    }  
}  








