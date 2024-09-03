import java.util.*;
import java.io.*;
public class OctalToBinary{




			public static void main(String [] args) throws IOException
			{


			InputStreamReader io=new InputStreamReader(System.in);
			
			BufferedReader bf=new BufferedReader(io);
			
			//convert Octal to decimal
			int decimal=Integer.parseInt(bf.readLine(),8);


			
			

			String Octal =Integer.toBinaryString(decimal);
			


			System.out.println(Octal);

			
			
			
				



			} 










}