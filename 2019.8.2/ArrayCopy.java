import java.util.*;
public class ArrayCopy {
	public static void main(String[] args) {
		//byte[] sourceArray = {4,5,2,3,6};
		//byte[] newArray = new byte[sourceArray.length];
		//for(int i=0;i<sourceArray.length;i++){
		//	newArray[i] = sourceArray[i];
		//}
		//System.out.print(Arrays.toString(newArray));
		
		
		/*byte[] sourceArray = {4,5,2,3,6};
		byte[] newArray = new byte[sourceArray.length];
		System.arraycopy(sourceArray,0,newArray,0,5);
		System.out.print(Arrays.toString(newArray));
		*/
		
		
		byte[] sourceArray = {4,5,2,3,6};
		byte[] newArray = Arrays.copyOf(sourceArray,5);
		System.out.print(Arrays.toString(newArray));
		
		
		
		
	}
}