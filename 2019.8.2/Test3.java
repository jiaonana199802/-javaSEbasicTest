public class Test3 {
	public static void main(String[] args) {
		String str = "123456789012";
		int oldNum = 0;
		int evenNum = 0;
		for(int i=0;i<str.length();i++){
			if(i % 2 == 0){
				evenNum += str.charAt(i)-'0';		
			}else{
				oldNum += str.charAt(i)-'0';	
			}	
		}
		System.out.print(evenNum+"\n");
		System.out.print(oldNum);
	}
}