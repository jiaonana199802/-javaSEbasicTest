import java.util.Scanner;
public class Practice2 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入第一个整数：");
		int num = scanner.nextInt();
		System.out.print("请输入第二个整数：");
		int num1 = scanner.nextInt();
		if(num>num1){
			System.out.print(num);
		}else{
			System.out.print(num1);
		}
	}
}