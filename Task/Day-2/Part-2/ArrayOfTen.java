public class ArrayOfTen{

public static void sumOfOdd(){
	int[] arr = {10,3,13,44,57,20,48,21,30,32};
	
	int sum =0;
	
	for(int i=0; i<arr.length; i++){
		
		if(arr[i]%2 != 0){
			sum +=arr[i];
		}
	}
	System.out.println("sum of odd numbers in given array is : " + sum);
	
}
public static void main(String[] args){
	
	sumOfOdd();


}


}