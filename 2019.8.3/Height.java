public class Height {
	public static void main(String[] args){
		double height = 100;
		double half = height/2;
		for(int i=2;i<=10;i++){
			height = height+half*2;
			half=half/2;
		}
		System.out.println(height);
		System.out.print(half);
		
	}
}