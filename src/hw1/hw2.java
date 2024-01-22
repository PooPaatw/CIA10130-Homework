package hw1;

public class hw2 {

	public static void main(String[] args) {

		
		
		
		
		
		
//		• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for(int i = 2; i <= 1000 ; i++)
			
			if( i%2 == 0 ) {
				sum += i;
			}
		System.out.println( sum );
		System.out.println( "=====================" );
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int s = 1;
		for(int i = 1; i <= 10 ; i++) {
			s *= i ;
		}
		System.out.println("for連乘積 = " + s);
		System.out.println( "=====================" );

//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		
		int d = 1 ;
		int i = 1;
		while(i <= 10 ) {
			d *= i;
			i++;
		}
		System.out.print("while連乘積 = " + d);
		System.out.println( " " );
		System.out.println( "=====================" );
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
		int q;
		int z = 0;
		for( q = 1; q <= 10 ; q++) {
			z = q * q;
			System.out.print(z + " ");
		}
		System.out.println( " " );
		System.out.println( "=====================" );
//		• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int c;
		for(c = 1 ; c <= 49; c++ )
			if( c % 10 != 4 && c / 10 != 4)
			System.out.print( c +" ");
		System.out.println( " " );
		System.out.println( "=====================" );
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		int h,l;
		for( h = 10 ; h >= 1 ; h-- ) {
			for( l = 1; l <= h ; l++) {
			    System.out.print(l +" ");
			}
			System.out.println();
		}
		System.out.println( "=====================" );
//		• 請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		int m , n;
		for( m = 0 ; m <= 6 ; m++) {
			char mm = (char) ('A' + m);
			for( n = 0 ; n <= m ; n++ ) {
				System.out.print(mm);
			}
			System.out.println();
		}
	}

}
