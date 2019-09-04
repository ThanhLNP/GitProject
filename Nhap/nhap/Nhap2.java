package nhap;

import java.util.Random;
import java.util.regex.Pattern;

public class Nhap2 {
	public static void main(String[] args) {
		Random random = new Random();

		String[] array = new String[100];

		for (int i = 0; i < array.length; i++) {
			array[i] = String.valueOf(random.nextInt(101));
			System.out.print(array[i] + "\t");
		}

		System.out.println("");

		System.out.println("Các số bé hơn 50:");
		
		for (String i : array) {
			if (Pattern.matches(".|1.|2.|3.|4.", i)) {
				System.out.print(i + "\t");
			}
		}
		
		System.out.println("");
		
		System.out.println("Các số có chữ số bắt đầu là 2:");
		
		for (String i : array) {
			if (Pattern.matches("2.*", i)) {
				System.out.print(i + "\t");
			}
		}
		
		System.out.println("");
		
		System.out.println("Các số có chứa chữ số 2:");
		
		
		for (String i : array) {
		//	if (Pattern.matches("2{1,2}|2.", i)) {
			if (Pattern.matches(".*2.*", i)) {
				System.out.print(i + "\t");
			}
		}
	}
}
