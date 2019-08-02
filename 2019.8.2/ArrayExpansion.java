import java.util.*;
public class ArrayExpansion {
	public static void main(String[] args) {
		
		/*byte[] sourceArray = {4,5,2,3,6};
		byte[] newArray = new byte[sourceArray.length+1];
		for(int i=0;i<sourceArray.length;i++){
			newArray[i] = sourceArray[i];
		}
		newArray[newArray.length-1] = 100;
		System.out.print(Arrays.toString(newArray));
		*/
		byte[] sourceArray = {5,4,2,3,7};
		//byte[] newArray = Arrays.copyOf(sourceArray,sourceArray.length+1);
		//newArray[newArray.length-1] = 100;
		
		
		byte[] newArray = Arrays.copyOf(sourceArray,sourceArray.length+2);
		newArray[newArray.length-1] = 100;
		newArray[newArray.length-2] = 100;
		System.out.print(Arrays.toString(newArray));
		
		
	}
}