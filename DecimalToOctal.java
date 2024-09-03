import java.util.*;
import java.io.*;
public class DecimalToOctal{




		public static void main(String [] args) throws IOException{


		InputStreamReader io=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(io);

		int decimal=Integer.parseInt(bf.readLine());
		
		String Octal=Integer.toOctalString(decimal);

		System.out.println(Octal);










		}
















}