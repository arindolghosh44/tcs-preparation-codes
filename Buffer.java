import java.io.*;
//base Change usin BufferedReader

public class Buffer
{

      static String Convert(String num,int n,int m)
      {
      //decimal change
      int original=Integer.parseInt(num,n);

      return Integer.toString(original,m).toUpperCase();
      }        







    public static void main(String [] args) throws IOException
    {
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));


    System.out.println("Enter the number:");
    String num=sc.readLine();


    System.out.println("Enter the First Base:");
    int n=Integer.parseInt(sc.readLine());


    System.out.println("Enter the Second Base:");
    int m=Integer.parseInt(sc.readLine());
    

    String output=Convert(num,n,m);
    System.out.println("Base:"+" "+output);
  

     }








}