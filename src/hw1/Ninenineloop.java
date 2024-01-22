package hw1;

public class Ninenineloop {

	public static void main(String[] args) {
//		• 一:使用for迴圈 + while迴圈
		int j = 1;
		int sum = 0;
		while (j <= 9) {
			for (int i = 1; i <= 9; i++) {
				sum = i * j;
				System.out.print(j + "*" + i + "=" + sum + "\t");
			}
			j++;
			System.out.println();
		}
		System.out.println("=====================================================================");
//
//		• 二:使用for迴圈 + do while迴圈
		int q = 1;
		int w = 0; // 總值 w
		int i;
		do {
			for (i = 1; i <= 9; i++) {
				w = i * q;
				System.out.print(i + "*" + q + "=" + w + "\t");
			}
			q++;
			System.out.println();
		} while (q <= 9);
		System.out.println("=====================================================================");
//
//		• 三:使用while迴圈 + do while迴圈
		int e = 1;
		int r = 0; // 總值r
		do {
			int s = 1;
			while (s <= 9) {
				r = s * e;
				System.out.print(e + "*" + s + "=" + r + "\t");
				s++;
			}
			e++;
			System.out.println();
		} while (e <= 9);
	}

}