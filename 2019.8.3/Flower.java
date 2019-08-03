public class Flower {
	public static void main(String[] args){
		for(int i=100;i<=9999;i++){
			int last = i%10;
			int middle = i/10%10;
			int left = i/10/10%10;
			if(Math.pow(last,3)+Math.pow(middle,3)+Math.pow(left,3)==i){
				System.out.println(i);
			}	
		}
	}
}