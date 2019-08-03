public class Test4 {
	public static void main(String[] args) {
		System.out.print(flip(56123));
	}
	public static int flip(int num){
		int value = 0;
		while(true){
			int last = num%10;
			value = value*10+last;
			num = num/10;
			if(num==0){
			break;
		}
	}
		return value;
   }
		
}