package hw1;
//• 請設計一個類別MyRectangle:
//(1) 有兩個double型態的屬性為width, depth
//(2) 有三個方法:
//(3) 有兩個建構子:
//public MyRectangle(): 不帶參數也無內容的建構子
//public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性
public class MyRectangle {

	private double width;
	private double depth;

	MyRectangle() {
		super();
	}

	public MyRectangle(double width, double depth) {
		super();
		this.width = width;
		this.depth = depth;
	}

//		void setWidth(double width): 將收到的引數指定給width屬性
//		void setDepth(double depth): 將收到的引數指定給depth屬性
//		double getArea(): 能計算該長方形的面積
	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {

		return width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getDepth() {
		return depth;
	}

	public void getArea() {
		System.out.println("計算出的面積" + width * depth);
	}
}
