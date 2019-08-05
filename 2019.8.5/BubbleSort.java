import java.util.*;
public class BubbleSort {
	//ц╟ещеепР
	public static void main(String[] args) {
		/*int[] a = new int[]{1,52,14,5,8,6,9,78};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++){
				int temp;
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
		*/
	    int[] arr = new int[8];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*6+1);
		}
		for(int j=0;j<arr.length-1;j++){
			for(int k=0;k<arr.length-1-j;k++){
				if(arr[k]>arr[k+1]){
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
	System.out.println(Arrays.toString(arr));
	}
	
}