import java.util.*;
import java.io.*;

public class reverse{

          static void reve(int [] arr,int n)
            {
            int ans[]=new int[n];
              for(int i=n-1;i>=0;i--){
                  ans[n-i-1]=arr[i];
                       }

for(int i:ans)
System.out.print(i+" ");

}




public static void main(String [] args){
int arr[]={5,4,3,2,1};
for(int i:arr)
System.out.print(i+" ");
System.out.println();
reve(arr,arr.length);



}



}