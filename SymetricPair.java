import java.util.*;
import java.io.*;

public class SymetricPair{



		
		static void SymetricPair(int [] [] arr,int n){



		Map<Integer,Integer> map=new HashMap<>();

		int first=0;
		int second=0;

		for(int i=0;i<n;i++){
			first=arr[i][0];
			second=arr[i][1];


			if(map.get(second)!=null && map.get(second)==first){

					System.out.println("("+" "+first+","+second+" "+")");
				}
			
			else{

				map.put(first,second);
				}


		}





		}




		public static void main(String [] args) throws IOException{

			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));


			System.out.println("Enter the sizes of the array:");


			int n=Integer.parseInt(bf.readLine());
			
			int n1=Integer.parseInt(bf.readLine());
			

			System.out.println("Enter the Elements of the array:");

				int [] []arr=new int [n][n1];


			for(int i=0;i<n;i++){



				for(int j=0;j<n1;j++)

				arr[i][j]=Integer.parseInt(bf.readLine());


			}


				SymetricPair(arr,n);












		}














}