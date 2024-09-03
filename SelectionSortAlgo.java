import java.util.*;
import java.io.*;
public class SelectionSortAlgo{

		static void SelectionSort(int [] arr,int n){

		for(int i=0;i<n-1;i++){

			int mini=i;


			for(int j=i+1;j<n;j++){


				if(arr[j]<arr[mini])


					mini=j;




			}



			int temp=arr[i];
			arr[i]=arr[mini];
			arr[mini]=temp;





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




		SelectionSort(arr,len);



		System.out.println();


		for(int i:arr){


			System.out.print(i+" ");



		}


		


		}










}