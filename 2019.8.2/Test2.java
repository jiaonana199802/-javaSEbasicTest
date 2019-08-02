import java.util.*;
public class Test2 {
	public static void main(String[] args) {
		char[] chs = {'统','计','一','个','字','符','在','字','符','串','中','的','位','置'};
		char key = '字';
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