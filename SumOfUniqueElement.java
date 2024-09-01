import java.util.*;

public class SumOfUniqueElement{

		static int SumOfUnique(int [] arr){

		int sum=0;
		Map<Integer,Integer>map=new HashMap<>();


		for(int num:arr){


		if(map.containsKey(num)){
			if(map.get(num)==1){
				sum-=num;

			}
			
			map.put(num,map.get(num)+1);
		}
		else{


			map.put(num,1);
			sum+=num;


		}









		}











			return sum;
		}













		public static void main(String [] args){

			int arr1[]={1,2,3,2};
			

			System.out.println(SumOfUnique(arr1));





			int arr2[]={1,1,1,1,1};
			

			System.out.println(SumOfUnique(arr2));














		}















}