import java.util.Scanner;
public class Practice2 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������һ��������");
		int num = scanner.nextInt();
		System.out.print("������ڶ���������");
		int num1 = scanner.nextInt();
		if(num>num1){
			System.out.print(num);
		}else{
			System.out.print(num1);
		}
	}
}