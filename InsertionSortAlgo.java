import java.util.*;
import java.io.*;
public class InsertionSortAlgo{

		static void InserttionSort(int [] arr,int n){

		for(int i=0;i<=n-1;i++){

			int j=i;

			while(j>0 && arr[j-1]>arr[j]){
			



			int temp=arr[j];
			arr[j]=arr[j-1];
			arr[j-1]=temp;
				j--;

			}



		}





		}









		public static void main(String [] args) throws IOException{


		InputStreamReader io=new InputStreamReader(System.in);


		BufferedReader bf=new BufferedReader(io);


		int len=Integer.parseInt(bf.readLine());

		int arr[]=new int[len];

		for(int i=0;i<len;i++){

		
		arr[i]=Integer.parseInt(bf.readLine());





		}

		

		for(int i:arr){


			System.out.print(i+" ");



		}




		InserttionSort(arr,len);



		System.out.println();


		for(int i:arr){


			System.out.print(i+" ");



		}


		


		}










}