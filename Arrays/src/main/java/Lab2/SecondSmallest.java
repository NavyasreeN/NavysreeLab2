package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getSecondSmallest(arr));
		
	}
		public static int getSecondSmallest(int[] arr) {
			Arrays.sort(arr);
			return arr[1];
		}

	

}
//
//import java.util.Scanner;
//
//public class SecondSmallest {
//	public  int getSecondSmallest(int[] a, int total){  
//		int temp;  
//		for (int i = 0; i < total; i++)   
//		        {  
//		            for (int j = i + 1; j < total; j++)   
//		            {  
//		                if (a[i] > a[j])   
//		                {  
//		                    temp = a[i];  
//		                    a[i] = a[j];  
//		                    a[j] = temp;  
//		                }  
//		            }  
//		        }  
//		       return a[1];
//		       
//		//2nd element because index starts from 0  
//		}  
//
//	public static void main(String[] args) 
//	{
//		int a[] = null;
//		 Scanner sc=new Scanner(System.in);
//	    	
//	    	System.out.print("Enter the number of elements you want to store: ");  
//			  
//			int total=sc.nextInt(); 
//			
//			 
//	        int [] arr = new int [total];
//	        
//	        for (int i = 0; i < total; i++)
//	        {
//	            arr[i]=sc.nextInt();
//	            
//	        }
//	        SecondSmallest s=new SecondSmallest();
//	        s.getSecondSmallest(arr, total);
//	        
//	        
//  
//
//}}