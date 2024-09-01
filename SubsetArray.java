//This array is subset of another array
import java.util.*;
public class SubsetArray{


			static boolean Subset(int [] arr1,int n1,int [] arr2,int n2){
				Map<Integer,Boolean> map=new HashMap<>();
				
				if(n1>n2)
					return false;


				for(int i=0;i<n2;i++){

					map.put(arr2[i],true);


				}
				

				for(int i=0;i<n1;i++){
					if(map.containsKey(arr1[i])==false)
						return false;

				}

					return true;
				}









		public static void main(String [] args){

			int arr1[]={1,3,4,5,2};
			int arr2[]={2,4,3,1,7,5,15};
			int n1=5;
			int n2=7;


			boolean p=Subset(arr1,n1,arr2,n2);
			if(p==false)

				System.out.println("Not a Subset");

			else
				
				System.out.println("Subset");









		}


















}