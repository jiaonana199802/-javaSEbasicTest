import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
	    int add1 = getValue1(40,2);
		int minus1 = getValue2(40,2);
		int multiplication1 = getValue3(40,2);
		int division1 = getValue4(40,2);
		System.out.print(add1+"\n"+minus1+"\n"+multiplication1+"\n"+division1+"\n");
		//键盘输入两个整数进行计算
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入两个整数:");
		int intNum1 = scanner.nextInt();
		int intNum2 = scanner.nextInt();
	    System.out.print("它们的和是"+getValue1(intNum1,intNum2)+"\n");
		System.out.print("它们的差是"+getValue2(intNum1,intNum2)+"\n");
		System.out.print("它们的积是"+getValue3(intNum1,intNum2)+"\n");
		System.out.print("它们的商是"+getValue4(intNum1,intNum2)+"\n");
		
		
	}
	public static int getValue1(int num1,int num2) {
	    int add = num1+num2;
		return add;
	}
	public static int getValue2(int num1,int num2) {
		int minus = num1-num2;
		return minus;
	}
	public static int getValue3(int num1,int num2) {
		int multiplication = num1*num2;
		return multiplication;
	}
	public static int getValue4(int num1,int num2) {
		int division = num1/num2;
		return division;
	}
}