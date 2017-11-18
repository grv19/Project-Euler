import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Solution {
	static boolean isPrime(long a){
		if(a==1){
			return false;
		}
		else if(a<4){
			return true;
			}
		else if(a%2 == 0){
			return false;
		}
		else if(a<9){
			return true;
		}
		else{
			int r = (int) Math.floor(Math.sqrt(a));
			int f=5;
			while(f<=r){
				if(a%f == 0){
					return false;
					}
			 if(a%(f + 2) == 0){
				 return false;
			 }
			 f = f + 6;
			
			}
			return true;
		}
		
	}
	public static  void calcPrime() {
		int sum = 2,length=0;
		int candidate = 1;
		do{
			candidate = candidate + 2;
			if(isPrime(candidate)){
			sum = sum +candidate;
			length = length + 1;
			}
			System.out.println(sum);
			if(isPrime(sum)){
				continue;
			}
			else{
				//System.out.println("============================");
				//System.out.println(sum);
				//System.out.println(length);
				sum = 0;
				length =0;
			}
		}while(candidate < 100);
		//return sum;
		
	}
	public static void main(String[] args) {
		System.out.println(isPrime(9));
		//calcPrime();
	}
}
