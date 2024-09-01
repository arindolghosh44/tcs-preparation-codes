import java.util.*;

class Pair{

int first;
int second;

Pair(int first,int second){

this.first=first;
this.second=second;

}



Pair(){



}







}












public class SortElementFrequency{


		static void FrequencySort(int [] arr,int n){
			
			Map<Integer,Integer> map=new HashMap<>();


			List<Pair> list=new ArrayList<>();


			for(int i=0;i<n;i++){

			map.put(arr[i],map.getOrDefault(arr[i],0)+1);


			}

			
			for(int x:map.keySet()){

			list.add(new Pair(x,map.get(x)));


			}
			
			Collections.sort(list,(a,b)->{
			if(a.second==b.second)
				return a.first-b.first;

			else
				return b.second-a.second;



			});

			for(int i=0;i<list.size();i++){

				while(list.get(i).second>0){
				System.out.print(list.get(i).first+" ");
				list.get(i).second--;

				}


			}
			















		}















		public static void main(String [] args){



		int arr[]={1,2,3,2,4,3,1,2};
		int n=8;

		FrequencySort(arr,n);

		System.out.println();

		int arr1[]={3,3,5,2,1,1,2};
		int n1=7;

		FrequencySort(arr1,n1);


		System.out.println();

		int arr2[]={-199,6,7,-199,3,5};
		int n2=6;

		FrequencySort(arr2,n2);






		}



















}