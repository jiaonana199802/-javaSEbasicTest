public class AnnualSalary {
	public static void main(String[] args){
	    double annualSalary = 30000;
		int sum = 0;
		for(int i=1;i<=10;i++){
			annualSalary=annualSalary*(1+0.06);
			sum += annualSalary;
		}
		System.out.print("��нΪ"+annualSalary+"\n"+"10����ܹ���Ϊ"+sum);
	}
}