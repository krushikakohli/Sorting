import java.util.Scanner;  
public class BubbleSort { 
    public static void main(String args[])  
  
    { 
        int size, i, j, temp;  
       int arr[] = new int[50];  
       Scanner scan = new Scanner(System.in);  
       System.out.print("Enter size of array: ");  
       size = scan.nextInt();  
       System.out.print("Enter elements of array: ");  
       for(i=0; i<size; i++)  
       {  
           arr[i] = scan.nextInt();  
       }  
       System.out.print("Sorting....\n");  
  
        int n = arr.length; 
        for (i = 0; i < n-1; i++) 
            for (j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                   
                    temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
  
        System.out.print("Array after Sorting is :\n");  
       for(i=0; i<size; i++)  
       {  
           System.out.print(arr[i]+ "  ");  
       }  
  
    } 
  
}
