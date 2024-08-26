import java.util.*;
//unsorted element dupicate key Removed using hashmap
public class Duplicate{

	static void duplicate(int [] arr,int n)
	{
		Map<Integer,Integer> map=new HashMap<>();


		for(int i=0;i<n;i++){
		if(!map.containsKey(arr[i])){
			System.out.print(arr[i]+" ");
				map.put(arr[i],1);

		}

		}





		






	}








	public static void main(String [] args){
	
	
	int n=10;

	//int arr[]={4,3,9,2,4,1,10,89,34};
	int arr[]={4,3,3,5,6,7,1,7,90,23};
	duplicate(arr,n);











	}















}