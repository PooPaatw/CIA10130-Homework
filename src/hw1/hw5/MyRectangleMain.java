package hw1;
//請另外建立一個MyRectangleMain類別,此類別只有main方法
//(1) 使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
//(2) 使用public MyRectangle(double width, double depth)建構子建立物件
//    設定width, depth為10, 20,透過getArea()印出結果
public class MyRectangleMain extends MyRectangle{
	public static void main(String[] args) {
		MyRectangleMain myRectangle = new MyRectangleMain();

		myRectangle.setDepth(10);
		myRectangle.setWidth(20);

		myRectangle.getArea();
	}
}
