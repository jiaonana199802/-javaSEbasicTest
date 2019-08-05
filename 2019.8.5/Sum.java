import java.util.Scanner;
public class Sum{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个0-1000的整数:");
		int num = scanner.nextInt();
		int first = num%10;
		int sec = num/10%10;
		int third = num/100%10;
		int forth = num/1000%10;
		System.out.print(first+sec+third+forth);
		
	}
}