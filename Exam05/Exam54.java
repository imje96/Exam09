package Exam5;

public class Exam54 {
	public static void main(String[] args) {
		double TriangleArea = calcTriangleArea(50, 60);
		double CircleArea = calcCircleArea(20);
		System.out.println(TriangleArea);
		System.out.println(CircleArea);
	}

	public static double calcTriangleArea(double bottom, double height) {
		// double area = 0.5 * (bottom * height);
		// return area;
		return (bottom * height) / 2;

	}

	public static double calcCircleArea(double radius) {
		// double area = 3.141592 * Math.pow(radius, 2);
		// return area;
		return 3.141592 * Math.pow(radius, 2); // -> 바뀔 일이 없다면 이렇게 쓰기
	}

}
