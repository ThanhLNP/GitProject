package tieuhoc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	static ArrayList<TieuHoc> danhsach = new ArrayList<TieuHoc>();

	static String ten = "";

	public static void nhapDiemK1() {
		while (!(Pattern.matches("=", ten))) {
			Khoi1 khoi1 = new Khoi1();
			System.out.print("Nhập tên học sinh: ");
			ten = scanner.next();
			khoi1.tenhs = ten;
			for (int i = 0; i < khoi1.monhoc.length; i++) {
				System.out.print("Nhập điểm môn " + khoi1.monhoc[i] + ": ");
				khoi1.diem[i] = scanner.nextFloat();
				danhsach.add(khoi1);
			}
		}
		for (TieuHoc i : danhsach) {
			System.out.println("Học sinh: " + i.tenhs);
			Khoi1 khoi1 = new Khoi1();
			for (int j = 0; j < khoi1.monhoc.length; j++) {
				System.out.print(khoi1.monhoc[j] + " " + i.diem[j] + "\t");
			}
			System.out.println();
			System.out.println("*****");
		}
	}

	public static void main(String[] args) {

		String khoi = "";

		while (!(Pattern.matches("1|2|3|4|5", khoi))) {
			System.out.print("Vui lòng nhập khối: ");
			khoi = scanner.next();
		}

		switch (khoi) {
		case "1":
			nhapDiemK1();
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			break;
		}
	}
}
