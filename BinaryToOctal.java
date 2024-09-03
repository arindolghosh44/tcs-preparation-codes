import java.util.*;
import java.io.*;
public class BinaryToOctal{




			public static void main(String [] args) throws IOException
			{


			InputStreamReader io=new InputStreamReader(System.in);
			
			BufferedReader bf=new BufferedReader(io);
			
			//binary String to decimal (parseInt)
			int decimal=Integer.parseInt(bf.readLine(),2);
			

			//Convert Decimal to OctalString

			String octal=Integer.toOctalString(decimal);

			


			System.out.println(octal);

			
			
			
				



			} 










}