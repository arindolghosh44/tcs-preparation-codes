import java.util.*;
//we change the bases in one form to another form 
//like binary to decimal
public class BaseChange
{

      static String Convert(String num,int n,int m)
      {
      //decimal change
      int original=Integer.parseInt(num,n);

      return Integer.toString(original,m).toUpperCase();






     }        





      public static void main(String [] args){
      
       String num=args[0];
       int n=Integer.parseInt(args[1]);
       int m=Integer.parseInt(args[2]);
       System.out.println(Convert(num,n,m));





       }





}