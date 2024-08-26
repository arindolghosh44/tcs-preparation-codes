public class InsertionAtEnd{

	static void insert(int [] arr,int n,int value){

		arr[n]=value;











	}







	public static void main(String [] args){

	int n=8;
	int [] arr={10,9,14,8,20,48,16,9,0};
	int value=90;

	System.out.println("Before array:");


	for(int i:arr)

	System.out.print(i+" ");



	insert(arr,n,value);

	System.out.println("After adding array:");


	for(int i:arr)

	System.out.print(i+" ");















	}






















}