import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		char key = '字';
		String str = "统计一个字符在字符串中的所有位置";
	    int[] arr = count(str,key);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] count(String str,char key){
		int[] count = {};
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(c==key){
				count = Arrays.copyOf(count,count.length+1);
				count[count.length-1] = i;	
			}
		}
		return count;
	}
}