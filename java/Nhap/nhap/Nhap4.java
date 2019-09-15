package nhap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Nhap4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rd = new Random();

//tao mang
		for (int i = 0; i < 30; i++) {
			list.add(rd.nextInt(11));
			System.out.print(list.get(i) + "\t");
		}
		System.out.println("");

//xoa phan tu chia het cho 2
		int a;
		Iterator ite = list.iterator();
		while (ite.hasNext()) {
			a = (int) ite.next();
			if (a % 2 == 0) {
				ite.remove();
			}
		}
		for (int i : list) {
			System.out.print(i + "\t");
		}
		System.out.println("");

// sap xep tang dan
		Collections.sort(list);
		for (int i : list) {
			System.out.print(i + "\t");
		}
		System.out.println("");

// sap xep giam dan
		Collections.reverse(list);
		for (int i : list) {
			System.out.print(i + "\t");
		}
		System.out.println("");

// remove theo for sẽ bị sai
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 != 0) {
				list.remove(i);
			}
		}
		for (int i : list) {
			System.out.print(i + "\t");
		}
	}
}