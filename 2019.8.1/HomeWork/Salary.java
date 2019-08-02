import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		System.out.println("请输入你的总工资：");
		Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
		double minStand = 5000;
		double finalSalary = salary - minStand;
		double oneMoney = 1000;
		double subSidy = 500;
		double realSalary = 0;
		
		if(salary <= 1500) {
			realSalary = finalSalary*0.97 + minStand - oneMoney + subSidy;
		}else if(finalSalary >1500 && finalSalary<=4500){
			realSalary = finalSalary*0.90 + minStand - oneMoney + subSidy;
		}else if(finalSalary >4500 && finalSalary<=9000){
			realSalary = finalSalary*0.80 + minStand - oneMoney + subSidy;
		}else if(finalSalary >9000 && finalSalary<=35000){
			realSalary = finalSalary*0.75 + minStand - oneMoney + subSidy;
		}else if(finalSalary >35000 && finalSalary<=55000){
			realSalary = finalSalary*0.70 + minStand - oneMoney + subSidy;
		}else{
			realSalary = minStand - oneMoney + subSidy;
		}
		System.out.print(realSalary);

	}
	
}