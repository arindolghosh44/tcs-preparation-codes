
import java.util.*;

public class Unique{

static int uniquesum(int [] nums){
int sum=0;

Set<Integer> set=new TreeSet<>();

for(int num:nums){
if(!set.contains(num))
{
set.add(num);
sum+=num;


}
else
{

sum-=num;
}



}

if(sum<0){

return 0;
}


return sum;




}




public static void main(String [] args){

int num[]={1,2,3,2};

System.out.println("Output:"+uniquesum(num));


int num1[]={1,1,1,1,1};

System.out.println("Output:"+uniquesum(num1));







}




}