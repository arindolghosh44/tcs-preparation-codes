import java.util.*;

public class RecursiveReverse{

         public static void main(String [] args){
              
          int arr[]={5,4,3,2,1};
          int n=5;	
	    int arr1[]={10,20,30,40};
          int n1=4;
          

         //reverse using recursion
         print(arr,n);
         reverse(arr,0,n-1);
         print(arr,n);
         

         System.out.println();
         print(arr1,n1);
         reverse(arr1,0,n1-1);
         print(arr1,n1);
         


       }

      static void reverse(int [] arr,int start,int end){
       
      if(start<end){
      int temp=arr[start];
	 arr[start]=arr[end];
	arr[end]=temp;
      reverse(arr,start+1,end-1);
      }



      }

        
       static void print(int [] arr,int n){
	for(int i=0;i<n;i++)
      System.out.print(arr[i]+" ");
     
     System.out.println();

	
	}


}