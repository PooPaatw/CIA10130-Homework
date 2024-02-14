package hw1;

import java.util.Scanner;
import java.util.ArrayList;

public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形,如圖示結果:
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("請輸入3個整數 :");
//		int data = sc.nextInt();
//		int data2 = sc.nextInt();
//		int data3 = sc.nextInt(); // 迴圈搭配陣列可優化
//
//		if (data + data2 > data3 ||data2 + data3 > data || data3 + data > data2 ||data == 0 || data2 == 0 || data3 == 0)
//			System.out.print("不是三角形");
//		else if (data == data2 && data2 == data3)
//			System.out.print("正三角形");
//		else if (data == data2 || data2 == data3 || data3 == data)
//			System.out.print("等腰三角形");
//		else if (data * data + data2 * data2 == data3 * data3 || data3 * data3 + data2 * data2 == data * data
//				|| data * data + data3 * data3 == data2 * data2)
//			System.out.print("直角三角形");
//		else
//			System.out.print("其他三角形");
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
//		Scanner sc1 = new Scanner(System.in);
//
//		System.out.println("開始猜數字囉 ! :");
//
//		int i = (int) (Math.random() * 9) + 1;
//
//		for (;;) {
//			int data4 = sc1.nextInt();
//			if (i != data4)
//				System.out.println("答錯囉 ! ");
//			else if (i == data4) {
//				System.out.println("答對囉 ! 答案就是 :" + i);
//
//				break;
//			}
//		}
//		Scanner sc2 = new Scanner(System.in);
//
//		System.out.println("開始猜數字囉 :");
//
//		int s = (int) (Math.random() * 100) + 1;
//
//		for (;;) {
//			int data4 = sc2.nextInt();
//			if (s != data4) {
//				System.out.println("答錯囉 ! ");
//				if (s < data4)
//					System.out.println("比正確答案還大" );
//				else if (s > data4)
//					System.out.println("比正確答案還小" );
//				else
//					System.out.println("請輸入數字");
//				continue;
//			} else if (s == data4) {
//				System.out.println("答對囉答案就是 :" + s);
//
//				break;
//			}
//		}

//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
//		Scanner sc5 = new Scanner(System.in);
//		System.out.println("阿文...請輸入你討厭的數字 :");
//		int number = sc5.nextInt();
//		int count = 0;
//		for (int i = 1; i <= 49; i++) {
//			if (i % 10 == number || i / 10 == number) {
//				continue;
//			}
//			count++;
//			if (count % 6 == 0) {
//
//				System.out.print(i + "\n");
//			} else
//				System.out.print(i + "   ");
//		}			System.out.println("總共有" + count + "個數字");
//

//		進階提搭配陣列
//		Scanner sc6 = new Scanner(System.in);
//		System.out.println("阿文...請輸入你討厭的數字 :");
//		int hatenumber = sc6.nextInt();
//		ArrayList<Integer> Arr = new ArrayList<>();
//		int number2;
//		while (Arr.size() <= 6) {
//			number2 = (int) (Math.random() * 49) +1;
//			if (number2 % 10 == hatenumber || number2 / 10 == hatenumber) {
//				
//				
//				continue;
//
//			} else if ( number2 == ) {
//
//			} else {
//				System.out.println(Arr);
//				Arr.add(number2);
//			}
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭的數字 :");
		int hatedNumber = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();

		while (arr.size() < 6) {
			int number = (int) (Math.random() * 49) + 1;

			if (number % 10 == hatedNumber || number / 10 == hatedNumber || arr.contains(number)) {
				// Skip if the number contains the hated number or is already in the list
				continue;
			} else {
				arr.add(number);
			}
		}

		System.out.println("阿文的大樂透號碼:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
