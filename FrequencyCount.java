import java.util.*;

public class FrequencyCount{

	public static void main(String [] args){
	int arr[]={10,5,10,15,10,5};
	
      int arr1[]={2,2,3,4,4,2};

      frequency(arr);
      System.out.println();
      frequency(arr1);
      

	}


	static void frequency(int [] arr){

	int n=arr.length;
	
	boolean [] visited=new boolean[n];
	
	for(int i=0;i<n;i++){




	if(visited[i]==true)
	continue;
      




      int count=1;
	for(int j=i+1;j<n;j++){
	
	if(arr[i]==arr[j]){
	visited[j]=true;
      count++;

	}
	

     }


     System.out.println(arr[i]+" "+count);
	}




}


}