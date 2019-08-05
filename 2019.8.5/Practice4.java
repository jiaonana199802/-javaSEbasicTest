import java.util.Scanner;
public class Practice4 {
	public static void main(String[] args){
		int sum = 0;
		for(int i=1;i<=100;i++){		
			sum += i;	
		}
		System.out.println(sum);
		
	
		int sum1 = 0;
		for(int j=1;j<=100;j++){
			if(j%2!=0){
				sum1 += j;	
			}
			
		}
		System.out.print(sum1);
	}
}