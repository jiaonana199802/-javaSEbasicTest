import java.util.Scanner;
public class Branch {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.print("请输入你的分数：");
		double score = scanner.nextDouble();
		if(score>100 || score<0){
		    System.out.print("super man");  
		}else if(score>=90 && score<=100){
		    System.out.print("优秀");  
		}else if(score>=80 && score<90){
		    System.out.print("良好");  
		}else{
		    System.out.print("不及格");  
		}
		
	}
}