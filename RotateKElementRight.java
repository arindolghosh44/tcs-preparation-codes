//Right Rotation
public class RotateKElementRight{



		static void Rotate(int [] arr,int n,int k){

			
		if(n==0)
			return;

		k=k%n;
		if(k>n)
			return;
		int [] temp=new int[k];


		for(int i=n-k;i<n;i++)
			temp[i-n+k]=arr[i];

		for(int i=n-k-1;i>=0;i--)
			arr[i+k]=arr[i];

		for(int i=0;i<k;i++)
			arr[i]=temp[i];

		







		}








		public static void main(String [] args){


			int [] arr={1,2,3,4,5,6,7};
			int n=7;
			int k=2;


			Rotate(arr,n,k);


			for(int i:arr)
				System.out.print(i+" ");











		}























}