import java.util.*;

public class Median{


	static void getmedian(int [] arr){
	
	int n=arr.length;

      Arrays.sort(arr);
  	

	if(n%2==0){
		int k=n/2;
		int j=n/2-1;
		

	System.out.println((double)(arr[k]+arr[j])/2);


	}



	else
	{



	System.out.println(arr[n/2]);



	







	}

	










	}








	public static void main(String [] args){
	
	int [] arr={2,4,1,3,5};
      
	int [] arr1={2,5,1,7};
 	
	int [] arr2={4,7,1,2,5,6};
      
      getmedian(arr);
	System.out.println();

      getmedian(arr1);
	System.out.println();
      getmedian(arr2);

	}











}