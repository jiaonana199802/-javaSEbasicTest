public class House{
	public static void main(String[] args){
		int n = 5;
		drawHouse(n);
	}
	public static void drawHouse(int n) {
		// �����ϰ벿
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
		// �����°벿������
		// ǽ�� (int) Math.ceil(n * 3 / 5); ����ȡ�����ɱ�������ǽ�ڵĸ߶�
		int m = (int) Math.ceil(n * 3 / 5); 
		// m��ǽ�ڸ߶�
		for (int i = 1; i <= m + 2; i++) { 
		//����m + 2,��Ϊ�����°벿���ε��ܸ߶�
		for (int j = 1; j <= n * 2 + 3; j++) {
		if (i == 1 || i == m + 2) { 
		// �����ϲ����²�
		System.out.print("*");
		} else if (j == 1 || j == n * 2 + 3) { 
		// ǽ��
		System.out.print("*");
		} else {
		System.out.print(" ");
		}
	}
		System.out.println();
		}
	}
}