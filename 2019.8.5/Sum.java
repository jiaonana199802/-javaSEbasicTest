import java.util.Scanner;
public class Sum{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("������һ��0-1000������:");
		int num = scanner.nextInt();
		int first = num%10;
		int sec = num/10%10;
		int third = num/100%10;
		int forth = num/1000%10;
		System.out.print(first+sec+third+forth);
		
	}
}