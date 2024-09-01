//Left Rotation
public class RotateKElement{



		static void Rotate(int [] arr,int n,int k){

			
		if(n==0)
			return;

		k=k%n;
		if(k>n)
			return;
		int [] temp=new int[k];


		for(int i=0;i<k;i++)
			temp[i]=arr[i];

		for(int i=0;i<n-k;i++)
			arr[i]=arr[i+k];

		for(int i=n-k;i<n;i++)
			arr[i]=temp[i-n+k];

		







		}








		public static void main(String [] args){


			int [] arr={3,7,8,9,10,11};
			int n=6;
			int k=3;


			Rotate(arr,n,k);


			for(int i:arr)
				System.out.print(i+" ");











		}























}