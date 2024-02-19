package hw1;

import java.util.*;

public class hw5 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("請輸入想要的寬: ");
//		int i = sc.nextInt();
//		System.out.print("請輸入想要的高: ");
//		int j = sc.nextInt();
//		starSquare(i, j);
		randAvg();
		genAuthCode();
		

	}

//		請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//		圖:

//	static void starSquare(int width, int height) {
//		String[][] arr = new String[width][height];
//		for (String[] row : arr) {
//			for (String elems : row) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

//		• 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
	public static void randAvg() {
		System.out.println("本次亂數結果");
		int[] number = new int[10];
		int sum = 0;
		int l = 0;
		for (int k = 0; k < number.length; k++) {
			number[l] = (int) (Math.random() * 101); // 生成 0~100 之間的亂數
			System.out.print(number[l] + " ");
			sum += number[l];
			l++;
		}
		System.out.println();
		System.out.println(sum / number.length);
	}

//		• 身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//		genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//		與數字的亂數組合,如圖:

	public static void genAuthCode() {
		String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		String answer = "";

		for (int s = 0; s < 8; s++) {
			int c = (int) (Math.random() * code.length());
			char a = code.charAt(c);
			answer += a;
		}
		System.out.println(answer);
	}

}
