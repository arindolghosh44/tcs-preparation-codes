import java.util.*;

public class SumK{


		static int subarraySum(int [] arr,int k){


			Map<Integer,Integer>map=new HashMap<>();


			int CumSum=0;

			int count=0;
			map.put(0,1);

			for(int j:arr){

				CumSum+=j;

				if(map.containsKey(CumSum-k))
					count+=map.get(CumSum-k);

					map.put(CumSum,map.getOrDefault(CumSum,0)+1);

			}

			




			return count;






		}









		public static void main(String [] args){

		int [] arr1={1,1,1};
		int k1=2;
		System.out.println("Output:"+subarraySum(arr1,k1));



		int [] arr2={1,2,3};
		int k2=3;
		System.out.println("Output:"+subarraySum(arr2,k2));





		int [] arr3={10,2,-2,-20,10};
		int k3=-10;
		System.out.println("Output:"+subarraySum(arr3,k3));















		}

















}