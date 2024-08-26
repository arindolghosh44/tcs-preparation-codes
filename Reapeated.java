import java.util.*;
import java.io.*;

public class Reapeated{




		static void findreapeate(int [] arr,int n){

			Arrays.sort(arr);



			System.out.println("Number of Reapeting element name is:");

			for(int i=0;i<n-1;i++){

				if(arr[i]==arr[i+1]){

					System.out.print(arr[i]+" ");


				}



			}










		}






	public static void main(String [] args) throws IOException{

		InputStreamReader io=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(io);
		System.out.println("Enter the Size:");
		int n=Integer.parseInt(bf.readLine());
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(bf.readLine());
		
		}

		findreapeate(arr,n);


		













	}




















}