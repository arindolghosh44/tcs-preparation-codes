import java.util.*;
import java.io.*;

    public class factors{

        

       public static void main(String [] args){
                Scanner sc=new Scanner(System.in);
                      int n=sc.nextInt();

                          int sum=2;

                        for(int i=2;i<=n/2;i++)
                            {
                            if(n%i==0)
                               {

                                        sum++;
                                         }

                                          }

                                   System.out.println(" No of Divisors are:"+" "+sum);
















                                    }



                                }