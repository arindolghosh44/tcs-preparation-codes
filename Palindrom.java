public class Palindrom{

		static boolean palindrome(int num){

			int revsum=0;

			int dup=num;
			
			int rem=0;

			while(num>0){

				 rem=num%10;
				

				revsum=(revsum*10)+rem;



			num=num/10;

				











			}
			


				if(dup==revsum)
					return true;




			return false;







		}








	public static void main(String [] args){

		
		int num=1234;


		if(palindrome(num))
			System.out.println("This is a Palindrome Number");

		else 
			System.out.println("This is not a  Palindrome Number");

			









	}













}