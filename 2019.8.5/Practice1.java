import java.util.Scanner;
public class Practice1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = scanner.nextInt();
		if(num%2==0){
			System.out.print("输入的数值是偶数"+num);
		}else{
			System.out.print(num);
		}
		
	}
}