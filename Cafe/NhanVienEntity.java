package cafe;

public class NhanVienEntity {
	private String manv;
	private String mabp;
	private String hoten;
	private String diachi;
	private String dienthoai;
	private String masothue;

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getMabp() {
		return mabp;
	}

	public void setMabp(String mabp) {
		this.mabp = mabp;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getDienthoai() {
		return dienthoai;
	}

	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}

	public String getMasothue() {
		return masothue;
	}

	public void setMasothue(String masothue) {
		this.masothue = masothue;
	}

	public String toString() {
		return "\nMã nhân viên: " + manv + "\nMã bộ phận: " + mabp + "\nHọ tên: " + hoten + "\nĐịa chỉ: " + diachi + "\nSố điện thoại: "
				+ dienthoai + "\nMã số thuế: " + masothue + "\n";
	}
}
