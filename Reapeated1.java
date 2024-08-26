import java.util.*;
import java.util.Map.Entry;
import java.io.*;
//using HashMap
public class Reapeated1{




		static void findreapeate(int [] arr,int n){

			Map<Integer,Integer> count=new HashMap<>();


			for(int i:arr){

				//value found using get(i)
				if(count.get(i)==null) count.put(i,1);
					else
						count.put(i,count.get(i)+1);


			}



			//Iteration Using EntrySet
			for(Entry <Integer,Integer> entry:count.entrySet()){

				if(entry.getValue() > 1){

							System.out.println(entry.getKey()+" "+entry.getValue());

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