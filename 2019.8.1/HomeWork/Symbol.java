public class Symbol {
    public static void main(String[] args) {
	    System.out.print(function1(6)+"\n"+function2(6));
	}
	public static double function1(double num){
	    double result = num%3;
		return result;
	}
	public static double function2(double num1){
	    double result1 = num1++;
		return result1;
	}
}