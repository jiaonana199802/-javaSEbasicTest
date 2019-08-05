import java.util.*;
public class ArrayReview {
	public static void main(String[] args){
		/*
		int[] sourceArray = {1,5,4,2,3};
		int[] newArray = new int[sourceArray.length];
		System.arraycopy(sourceArray,0,newArray,0,5);
		System.out.print(Arrays.toString(newArray));
		*/
		//数组复制第一种方法
		/*int[] sourceArray = {1,5,4,2,3};
		int[] newArray = Arrays.copyOf(sourceArray,5);
		System.out.print(Arrays.toString(newArray));
		*/
		//数组复制第二种方法
		/*
		int[] sourceArray = {4,5,6,8,7};
		int[] newArray = Arrays.copyOf(sourceArray,sourceArray.length+1);
		newArray[newArray.length-1] = 100;
		System.out.print(Arrays.toString(newArray));
		*/
		//数组扩容
		
		
	}
}