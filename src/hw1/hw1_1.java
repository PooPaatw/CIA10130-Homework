package hw1;

public class hw1_1 {

	// 請設計一隻Java程式,計算12,6這兩個數值的和與積
	public static void main(String[] args) {
		int z = 12, o = 6, t = 256559;
		double a = 3.1415;
		// 請設計一隻Java程式,計算12,6這兩個數值的和與積
		System.out.println("ANS 12+6 = " +(z+o) );
		System.out.println("ANS 12*6 = " + z*o  );
		//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		System.out.println("ANS = " + (200%12) +"打" );
		//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		System.out.println("ANS = " + (t/60/60/24) + "天" );
		System.out.println("ANS = " + (t/60/60) + "小時" );
		System.out.println("ANS = " + (t/60) + "分" );
		System.out.println("ANS = " + t + "秒" );
		//• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		System.out.printf("ANS = %.3f%n" , ( 5 * 5 * a)  );
		System.out.printf("ANS = %.3f%n" , ( 10 * a ) );
		//• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
		//金加利息共有多少錢 (用複利計算,公式請自行google)
		
		double s = 1500000; //本金
		double i = 0.02;    //利息
		int ys = 10;	    //10年
		for (int y = 1; y <= ys; y++) {
		   double ii = s * i;//ii設定為本金乘上利息的值
		     s += ii;
		   }
		     System.out.printf("本金加利息為：%.2f%n", s  );
		   
		
        //sum = 150x(1+2%)10
		//• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		//5 + 5
		//5 + ‘5’
		//5 + “5”
		System.out.println("5+5 = " +  ( 5+5   ) );    //這兩個5是數學的5+5=10
		System.out.println("5+'5' = " + ( 5+'5' ) );   //這兩個5是一個數字5加上unicode的5
		System.out.println("5+\"5\" = " + ( 5+"5" ) ); //這兩個5是一個數字5加上字串的5
	}
}

