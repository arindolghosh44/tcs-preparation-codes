import java.util.*;
import java.io.*;
public class Divisor
{


     static void calculate(int num)
      {

      List<Integer> arr=new ArrayList<>();
      for(int i=1;i<=Math.sqrt(num);i++)
      {
       if(num%i==0)
       {
       arr.add(i);
       if(i!=num/i)
       arr.add(num/i);
       }


      }

     Collections.sort(arr);

     System.out.println("The divisor are:"+" "+arr);

       }








     public static void main(String [] args) throws IOException
     {
      BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
      int num=Integer.parseInt(input.readLine());
      calculate(num);
     
     }




}