import java.util.*;

import java.io.*;

//Second largest and Second Smallest
public class Second{

static void Get(int [] arr,int n){

//If any element is not found
if(n==0 || n==1)
{
System.out.println("Second largest is:"+" "+"-1");
System.out.println("Second smallest is:"+" "+"-1");

return;
}

int small=Integer.MAX_VALUE;
int Ssmall=Integer.MAX_VALUE;
int large=Integer.MIN_VALUE;
int Slarge=Integer.MIN_VALUE;

//First Largest and smallest
for(int k:arr){
small=Math.min(k,small);
large=Math.max(k,large);

}


for(int i:arr){
if(i<Ssmall && i!=small){

Ssmall=i;
}

if(i>Slarge && i!=large){

Slarge=i;
}






}




System.out.println("Second largest is:"+" "+Slarge);
System.out.println("Second smallest is:"+" "+Ssmall);




}













public static void main(String [] args){

int [] arr={7,8,9,-34,0,45,-89};
int n=arr.length;

Get(arr,n);




}




}