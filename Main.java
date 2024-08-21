import java.util.*;


public class Main{
public static void main(String [] args){

int [] arr={3,4,1,0,4,789};

for(int p:arr)
System.out.print(p+" ");

int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;

for(int k:arr){
if(k<min)
{
min=k;
}
if(k>max){

max=k;
}

}

System.out.println("Maximum value:"+" "+max);
System.out.println("Miniimum value:"+" "+min);



}



}