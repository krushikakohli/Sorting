import java.util.Scanner;  
public class InsertionSort {
    
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
        for (i = 1; i < n; ++i) { 
            int key = arr[i]; 
            j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
        System.out.print("Array after Sorting is :\n");  
       for(i=0; i<size; i++)  
       {  
           System.out.print(arr[i]+ "  ");  
       }  
   }  
}
