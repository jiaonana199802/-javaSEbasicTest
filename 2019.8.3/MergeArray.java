import java .util.*;
public class MergeArray {
	public static void main(String[] args){
		int[] A = {1,7,9,11,13,15,17,19};
		int[] B = {2,4,6,8,10};
		int[] C = new int[A.length+B.length];
		System.arraycopy(A,0,C,0,A.length);
		System.arraycopy(B,0,C,A.length,B.length);
        Arrays.sort(C);
		System.out.print(Arrays.toString(C));
		}
}