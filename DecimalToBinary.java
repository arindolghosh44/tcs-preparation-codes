import java.util.*;
import java.io.*;
public class DecimalToBinary{




			public static void main(String [] args) throws IOException
			{


			InputStreamReader io=new InputStreamReader(System.in);
			
			BufferedReader bf=new BufferedReader(io);
			
			
			int number=Integer.parseInt(bf.readLine());
			


			String binary=Integer.toBinaryString(number);


			System.out.println(binary);
			
			
			
				



			} 










}