package nhap;

import java.util.Scanner;

public class nhap {
	int a;
	int b;
	
	public int add() {
		int add = a + b;
		return add;
	}
	
	public int sub() {
		int sub = a - b;
		return sub;
	}

	public int mul() {
		int mul = a * b;
		return mul;
	}
	
	public float div() {
		float div = (float) a / b;
		return div;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		nhap numbers = new nhap();
		
		System.out.print("Nhập giá trị a: ");
		numbers.a = scanner.nextInt();
		
		System.out.print("Nhập giá trị b: ");
		numbers.b = scanner.nextInt();
		
		System.out.println("Nhập phép toán (+ , - , * , /): ");
		String pheptoan = scanner.next();
		
		float ketqua = 0;
		switch (pheptoan) {
		case "+":
			ketqua = numbers.add();
			break;
		case "-":
			ketqua = numbers.sub();
			break;
		case "*":
			ketqua = numbers.mul();
			break;
		case "/":
			ketqua = numbers.div();
			break;
		default:
			System.out.println("Vui lòng nhập đúng phép toán!");
		}
			System.out.println("Kết quả: "+ketqua);
	}
}
