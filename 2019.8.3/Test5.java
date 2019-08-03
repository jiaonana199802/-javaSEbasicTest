public class Test5 {
	public static void main(String[] args) {
		String str = "692116851128";
		int oldNum = 0;
		int evenNum = 0;
		
		for(int i=0;i<str.length();i++){
			if(i %2 == 0){
				oldNum += str.charAt(i)-'0';
			}else{
				evenNum += str.charAt(i)-'0';
			}
		}
		System.out.print(oldNum+"\n");
		System.out.print(evenNum+"\n");
		int sum = oldNum+evenNum*3;
		System.out.print(sum+"\n");
		double sum1 = sum%10;
		double sum2 = 10-sum1;
		double sum3 = sum2%10;
		System.out.print(sum3);
		
		
	}
}