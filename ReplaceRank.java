import java.util.*;
//Replace element by its Rank
public class ReplaceRank{


	public static void main(String [] args){

		int arr[]={20,15,26,2,98,6};


		
		Map<Integer,Integer> map=new HashMap<>();

		int n=arr.length;
		int temp=1;

		int [] br=new int[n];
		for(int i=0;i<n;i++)
			br[i]=arr[i];
		Arrays.sort(br);

		for(int i=0;i<n;i++){

			if(map.get(br[i])==null)
				map.put(br[i],temp);

		temp++;

		}
		

		for(int i=0;i<n;i++)
			System.out.print(map.get(arr[i])+" ");













	}
















}