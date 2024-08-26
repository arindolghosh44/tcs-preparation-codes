public class Average{


	public static void main(String [] args){

	int a[]={1,2,3,4,5};
	double sum=0;
	int n=a.length;
	for(int i=0;i<a.length;i++)
	{
		sum+=(double)a[i];
	}

	
	double avg=sum/n;
	System.out.println(avg);






	}











}