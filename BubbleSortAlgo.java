import java.util.*;
import java.io.*;
public class BubbleSortAlgo{

	static void	BubbleSort(int [] arr,int n){

			for(int i=n-1;i>=0;i--){

					int swap=0;

				for(int j=0;j<i;j++){
					if(arr[j]>arr[j+1]){
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						swap=1;
					
					}



				}

				if(swap==0){

				break;

				}





			}



				for(int i:arr){

				System.out.print(i+" ");

			}




		}
		







		public static void main(String [] args)throws IOException{
			InputStreamReader io=new InputStreamReader(System.in);
			BufferedReader bf=new BufferedReader(io);



			System.out.println("Enter the Length:");
			int length=Integer.parseInt(bf.readLine());
			int arr[]=new int[length];
			System.out.println("Enter the Values:");
			for(int i=0;i<length;i++){
				
				arr[i]=Integer.parseInt(bf.readLine());
			}


			for(int i:arr){

				System.out.print(i+" ");

			}


			System.out.println();

			BubbleSort(arr,length);




		}
















}