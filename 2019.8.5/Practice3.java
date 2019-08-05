import java.util.Scanner;
public class Practice3 {
	public static void main(String[] args){
		int i = 1;
		int sum = 0;
	    while(i<=100){
			sum += i;
			i++;
		}
		System.out.println("1-100的和是"+sum);
		
		
		int j = 1;
		int sum1 = 0;
	    while(j<=100){
			sum1 += j;
			j += 2;
		}
		System.out.println("1-100的奇数和是"+sum1);
		
		
		int a = 1;
		int sum2 = 0;
		do{
			sum2 += a;
			a++;
		}while(i<=100);
		{
		System.out.println("1-100的和是"+sum);
		}
		
		
		
		
	}
}