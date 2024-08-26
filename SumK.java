import java.util.*;
import java.io.*;
public class SumK{
static int findsubarray(int [] arr,int start,int k){
if(start>=arr.length)
return 0;

int c=0;
int sum=0;

for(int i=start;i<arr.length;i++){

sum+=arr[i];
if(sum==k){

c++;
}

}


c+=findsubarray(arr,start+1,k);



return c;

}


static int subarraySum(int [] arr,int k)
{

return findsubarray(arr,0,k);

}



public static void main(String [] a){

int arr[]={10,2,-2,-20,10};
int k=-10;

System.out.println(subarraySum(arr,k));


}








}

