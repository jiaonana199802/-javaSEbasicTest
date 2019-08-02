import java.util.Scanner;
public class ThreeYuan {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		int size = 5;
		int page = total%size==0 ? total/size : total/size+1;
		System.out.print(page);
	}
}