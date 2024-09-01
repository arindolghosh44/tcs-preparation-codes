import java.util.*;

public class EvenAdd{

		
		static void Evenarray(int [] arr){

			int n=arr.length;
			int p=n;
			List<Integer> list=new ArrayList<>();

			if(p%2!=0){
				


			for(int num:arr)
				System.out.print(num+" ");



			}
			

			else{


				

				int mid1=(p/2)-1;

				int mid2=p/2;

				int sum=arr[mid1]+arr[mid2];

				

				for(int i=0;i<n;i++){

					if(i==mid1){
						list.add(sum);


						}

					else if(i!=mid2)
						list.add(arr[i]);


				}


				

			}



				for(int i:list){

					System.out.print(i+" ");

				}


				



		}











	public static void main(String [] args){


		int arr1[]={10,9,5,2,5};


			

		int arr2[]={10,5,6,8,2,5,1};

		
		Evenarray(arr1);



				System.out.println();
			


		Evenarray(arr2);


		










	}
	

















}