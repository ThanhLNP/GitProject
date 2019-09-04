package cafe;

public class BoPhanEntity {
	private String mabp;
	private String macha;
	private String tenbp;

	public String getMabp() {
		return mabp;
	}

	public void setMabp(String mabp) {
		this.mabp = mabp;
	}

	public String getMacha() {
		return macha;
	}

	public void setMacha(String macha) {
		this.macha = macha;
	}

	public String getTenbp() {
		return tenbp;
	}

	public void setTenbp(String tenbp) {
		this.tenbp = tenbp;
	}

	public String toString() {
		return "\nMã bộ phận: " + mabp + "\nMã cha: " + macha + "\nTên bộ phận: " + tenbp + "\n";
	}
}
