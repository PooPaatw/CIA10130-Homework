package hw1;

import java.util.Scanner;

public class hw4 {
	public static void main(String[] args) {
//	有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)
//		int[] numberArray1 = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
//		int[] numberArray2 = numberArray1;
//		int sum = 0;
//		for (int i = 0; i < numberArray2.length; i++) {
//			sum += numberArray2[i];
//		}
//		int avg = sum / numberArray1.length;
//		System.out.println("平均值 = " + avg);
//		for (int i = 0; i < avg; i++) {
//			if (numberArray1[i] > avg) {
//				System.out.println("大於平均值:" + numberArray1[i]);
//			}
//		}
//		System.out.println("===============================");
//	• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	(提示:String方法,陣列)
//		String s = "Hello World";
//		char[] sArray = s.toCharArray();
//		int i = sArray.length;
//		for (i = sArray.length - 1; i >= 0; i--) {
//			System.out.print(sArray[i]);
//		}
//		System.out.println("===============================");
//	• 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
//		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//		int a = 0, e = 0, i = 0, o = 0, u = 0;
//		for (int x = 0; x < planet.length; x++) {
//			for (int y = 0; y < planet[x].length(); y++) {
//				if (planet[x].charAt(y) == 'a') {
//					a++;
//				} else if (planet[x].charAt(y) == 'e') {
//					e++;
//				} else if (planet[x].charAt(y) == 'i') {
//					i++;
//				} else if (planet[x].charAt(y) == 'o') {
//					o++;
//				} else if (planet[x].charAt(y) == 'u') {
//					u++;
//				}
//			}
//		}
//		System.out.println("a = " + a);
//		System.out.println("e = " + e);
//		System.out.println("i = " + i);
//		System.out.println("o = " + o);
//		System.out.println("u = " + u);
//		System.out.println("===============================");
//	• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	表如下:
//
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」
//	(提示:Scanner,二維陣列)
//		int[][] c1 = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
//		int count = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("輸入小文欲借的金額=");
//		int m1 = sc.nextInt();
//		System.out.println("有錢可借的員工編號:");
//		for (int i = 0; i < c1[1].length; i++) {
//			if (m1 <= c1[1][i]) {
//				count += 1;
//				System.out.print(c1[0][i] + "  ");
//			}
//		}
//		System.out.print("共" + count + "人！");
//		System.out.println();
//		System.out.println("===============================");
//	• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
		Scanner sc = new Scanner(System.in);
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("請輸入年月日");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();

		System.out.printf("你輸入的是%d%d%d\n", year, month, day);
		if (month < 1 || month > 12) {
			System.err.println("輸入的月份不合法！\n");
			return;
		}
		if ( day < 1 || day > maxdays(year,month)){
			System.err.println("輸入的月份不合法！\n");
			return;
		}

		if (isLeapYear(year)) {
			days[1] = 29;
		}

		int calday = day;
		for (int i = 0; i < month - 1; i++) {
			calday += days[i];
		}

		System.out.printf("西元%d年  第%d天\n", year, calday);

	}
	// 判斷日期不大於最大值
	private static int maxdays(int year, int month) {
        int[] maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            maxdays[1] = 29;
        }

        return maxdays[month - 1];
    }


	// 判斷是否為閏年
	private static boolean isLeapYear(int year) {
		return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
	}

//	• 班上有8位同學,他們進行了6次考試結果如下:
//	請算出每位同學考最高分的次數
//	(提示:二維陣列)
//		int score[][] = {
//                {10, 37, 100, 77, 98, 90},
//                {35, 75, 70, 95, 70, 80},
//                {40, 77, 79, 70, 89, 100},
//                {100, 89, 90, 89, 90, 75},
//                {90, 64, 75, 60, 75, 50},
//                {85, 75, 70, 75, 90, 20},
//                {75, 70, 79, 85, 89, 99},
//                {70, 95, 90, 89, 90, 75}};
//		
//        int student[] = new int[8];
//        int t = 0; //搜尋最高分的人
//        int i = 0; //考試次數
//        int j = 0; //學生人數
//        for ( i = 0; i < 6; i++) {
//             
//            for ( j = 0; j < 8; j++) {
//                if (score[t][i] <= score[j][i]) { 
//                    t = j;
//                }
//            }
//            student[t]++;
//        }
//
//        for (int x = 0; x < student.length; x++) {
//            System.out.printf("第%d號同學有%d次考最高分\n", x + 1, student[x]);
//        }
//    }
}
