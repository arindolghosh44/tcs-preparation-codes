import java.util.*;

public class Large{
public static void main(String [] args){

int arr1[]={2,5,1,3,0};
int arr2[]={8,10,5,7,9};

System.out.println("Maximum value of arr1:"+" "+larg(arr1));
System.out.println("Maximum value of arr2:"+" "+larg(arr2));


}


static int larg(int [] n){
int max=Integer.MIN_VALUE;

for(int i:n){

if(max<i){

max=i;

}



}


return max;
}



}