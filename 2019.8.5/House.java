public class House{
	public static void main(String[] args){
		int n = 5;
		drawHouse(n);
	}
	public static void drawHouse(int n) {
		// 房子上半部
		for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= 2*n; j++) {
		if (j == n - i + 1) {
		System.out.print("*****");
		} else if (j == n + i - 1) {
		System.out.print("*");
		} else {
		System.out.print(" ");
		}
	}
		System.out.println();
}
		// 房屋下半部，矩形
		// 墙壁 (int) Math.ceil(n * 3 / 5); 向上取整，成比例增高墙壁的高度
		int m = (int) Math.ceil(n * 3 / 5); 
		// m：墙壁高度
		for (int i = 1; i <= m + 2; i++) { 
		//矩形m + 2,，为房屋下半部矩形的总高度
		for (int j = 1; j <= n * 2 + 3; j++) {
		if (i == 1 || i == m + 2) { 
		// 矩形上部，下部
		System.out.print("*");
		} else if (j == 1 || j == n * 2 + 3) { 
		// 墙壁
		System.out.print("*");
		} else {
		System.out.print(" ");
		}
	}
		System.out.println();
		}
	}
}