public class EquilibriumIndex{






		static int equi(int [] arr,int n){


			int sum=0;
			int leftsum=0;
			int rightsum=0;
			for(int i=0;i<n;i++)
				sum+=arr[i];
			
			rightsum=sum;


			for(int i=0;i<n;i++){

				rightsum-=arr[i];


				if(leftsum==rightsum)
					return i;


				leftsum+=arr[i];




			}

			return -1;



		}






		public static void main(String [] args){

			int n=5;
			int num[]={2,3,-1,8,4};
			System.out.println(equi(num,n));






			int n1=3;
			int num1[]={1,-1,4};
			System.out.println(equi(num1,n1));


		}














}