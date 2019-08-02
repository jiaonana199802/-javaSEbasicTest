import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		char key = '��';
		String str = "ͳ��һ���ַ����ַ����е�����λ��";
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