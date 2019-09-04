package nhap;

import java.util.Scanner;

public class Nhap3 {
	static String a;
	static String b;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		tinhtoan tinhtoan = new tinhtoan();

		System.out.println("Nhập số a= ");
		a = scanner.next();

		System.out.println("Nhập số b= ");
		b = scanner.next();

		try {
			System.out.println("Kết quả phép chia a cho b: " + tinhtoan.chia());
		} catch (ArithmeticException b) {
			System.out.println("Nhập sai rồi!");
		}
	}
}

class tinhtoan {
	public int chia() throws NumberFormatException {
		try {
			int a = Integer.parseInt(Nhap3.a);
			int b = Integer.parseInt(Nhap3.b);
			return a / b;
		} catch (NumberFormatException a) {
			System.out.println("Vui lòng nhập chữ số!");
			throw a;
		} catch (ArithmeticException b) {
			System.out.println("b không được bằng 0");
			throw b;
		}
	}
}
