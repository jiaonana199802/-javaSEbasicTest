import java.util.Scanner;
public class Cycle {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int num = 0;
		while(num != -1){
			System.out.print("请输入一个数：");
			 num = scanner.nextInt();
			System.out.print("您输入的数是："+num);
			
			
		}
	}
}