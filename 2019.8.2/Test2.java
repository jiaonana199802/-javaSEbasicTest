import java.util.*;
public class Test2 {
	public static void main(String[] args) {
		char[] chs = {'ͳ','��','һ','��','��','��','��','��','��','��','��','��','λ','��'};
		char key = '��';
		int[] arr = count(chs,key);
		System.out.print(Arrays.toString(arr));
	}
	public static int[] count(char[] chs,char key) {
		int[] count = {};
		for(int i=0;i<chs.length;i++){
			if(key==chs[i]){
				count = Arrays.copyOf(count,count.length+1);
			    count[count.length-1] = i;
			}
		}
		return count;
	}
}