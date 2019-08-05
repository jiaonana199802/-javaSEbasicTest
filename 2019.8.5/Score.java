import java.util.Scanner;
public class Score {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("«Î ‰»Î≥…º®£∫");
		int a = scanner.nextInt();
		int level = a/10;
		switch(level){
			case 10:
			case 9:System.out.print("A");break;
			case 8:System.out.print("B");break;
			case 7:System.out.print("C");break;
			case 6:System.out.print("D");break;
			default:System.out.print("E");
		}
		
	}
}