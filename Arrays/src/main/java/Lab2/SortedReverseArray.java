package Lab2;


import java.util.Arrays;

import java.util.Scanner;

public class SortedReverseArray {
	
	public void getSorted(int arr[],int n)
	
	{

        
        System.out.println("Array in reverse order: ");  
        for (int i = n-1; i >= 0; i--) 
        {  
            System.out.print(arr[i] + " ");  
        }
        System.out.println();        
        for (int i = 0; i < n; i++) {  
       	
//           System.out.print(arr[i] + " ");         
         
        for (int j = i + 1; j < n; j++)   
        {         int tmp = 0;  
        if (arr[i] > arr[j])   
        {  
        tmp = arr[i];  
        arr[i] = arr[j];  
       arr[j] = tmp;  
        }  
        }
        
               }
        for (int k = 0; k < n; k++) {  
           	
            System.out.print(arr[k] + " ");
          }
         
        }
	 public static void main(String[] args)
	 { 
	    	int a[];
		 Scanner sc=new Scanner(System.in);
	    	
	    	System.out.print("Enter the number of elements you want to store: ");  
			  
			int n=sc.nextInt(); 
			
			 
	        int [] arr = new int [n];
	        
	        for (int i = 0; i < n; i++)
	        {
	            arr[i]=sc.nextInt();
	            
	        }
	            
	        SortedReverseArray s=new SortedReverseArray();
	        s.getSorted(arr, n);
	}  
	 }

	         
	        
	        
	        
		

	


