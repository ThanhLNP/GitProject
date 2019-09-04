package nhap;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class KhoiA {
	private float diemtoan, diemly, diemhoa;

	public float getDiemtoan() {
		return diemtoan;
	}

	public void setDiemtoan(float diemtoan) {
		this.diemtoan = diemtoan;
	}

	public float getDiemly() {
		return diemly;
	}

	public void setDiemly(float diemly) {
		this.diemly = diemly;
	}

	public float getDiemhoa() {
		return diemhoa;
	}

	public void setDiemhoa(float diemhoa) {
		this.diemhoa = diemhoa;
	}
}

class ToanComparator implements Comparator<KhoiA> {
	@Override
	public int compare(KhoiA a1, KhoiA a2) {
		if (a1.getDiemtoan() == a2.getDiemtoan())
			return 0;
		else if (a1.getDiemtoan() > a2.getDiemtoan())
			return 1;
		else
			return -1;
	}
}

class LyComparator implements Comparator<KhoiA> {
	@Override
	public int compare(KhoiA a1, KhoiA a2) {
		if (a1.getDiemly() == a2.getDiemly())
			return 0;
		else if (a1.getDiemly() > a2.getDiemly())
			return 1;
		else
			return -1;
	}
}

class HoaComparator implements Comparator<KhoiA> {
	@Override
	public int compare(KhoiA a1, KhoiA a2) {
		if (a1.getDiemhoa() == a2.getDiemhoa())
			return 0;
		else if (a1.getDiemhoa() > a2.getDiemhoa())
			return 1;
		else
			return -1;
	}
}

public class Nhap5 {
	public static void main(String args[]) {
		ArrayList<KhoiA> list = new ArrayList<KhoiA>();
		Random rd = new Random();
		KhoiA khoia;
		DecimalFormat df = new DecimalFormat("0.0");

		for (int i = 0; i < 30; i++) {
			khoia = new KhoiA();
			khoia.setDiemtoan(rd.nextFloat() * 10);
			khoia.setDiemly(rd.nextFloat() * 10);
			khoia.setDiemhoa(rd.nextFloat() * 10);
			list.add(khoia);
		}

		Collections.sort(list, new ToanComparator());
		for (KhoiA i : list) {
			System.out.println(
					df.format(i.getDiemtoan()) + " " + df.format(i.getDiemly()) + " " + df.format(i.getDiemhoa()));
		}
		System.out.println("************************");

		Collections.sort(list, new LyComparator());
		for (KhoiA i : list) {
			System.out.println(
					df.format(i.getDiemtoan()) + " " + df.format(i.getDiemly()) + " " + df.format(i.getDiemhoa()));
		}
		System.out.println("************************");

		Collections.sort(list, new HoaComparator());
		for (KhoiA i : list) {
			System.out.println(
					df.format(i.getDiemtoan()) + " " + df.format(i.getDiemly()) + " " + df.format(i.getDiemhoa()));
		}
		System.out.println("************************");
	}
}
