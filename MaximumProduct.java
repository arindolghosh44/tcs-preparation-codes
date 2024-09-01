//maximum product subarray
public class MaximumProduct{



		public static void main(String [] args){


			int arr[]={1,2,-3,0,-4,-5};
				int k=maxProduct(arr);
				System.out.println(k);










		
		}





		static int maxProduct(int [] arr){

			int ans=1;
			int pre=1;
			int suff=1;
			int n=arr.length;
		for(int i=0;i<arr.length;i++){

			if(pre==0)pre=1;

			if(suff==0)suff=1;

			pre*=arr[i];

			suff*=arr[n-i-1];
		

		ans=Math.max(ans,Math.max(pre,suff));




		}






			return ans;



			



		}














}