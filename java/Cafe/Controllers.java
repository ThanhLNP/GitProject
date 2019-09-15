package cafe;

import java.util.Scanner;

public class Controllers {

	static Scanner scanner = new Scanner(System.in);
	static int a;

	public static void nhanvien() {
		NhanVienDAO nhanvienDAO = new NhanVienDAO();
		NhanVienEntity nv = new NhanVienEntity();
		switch (a) {
		case 1:
			System.out.println(nhanvienDAO.findAll());
			break;
		case 2:
			System.out.print("Nhập mã nhân viên: ");
			nv.setManv(scanner.next());
			System.out.print("Nhập mã bộ phận: ");
			nv.setMabp(scanner.next());
			System.out.print("Nhập họ và tên nhân viên: ");
			nv.setHoten(scanner.next());
			System.out.print("Nhập địa chỉ: ");
			nv.setDiachi(scanner.next());
			System.out.print("Nhập số điện thoại: ");
			nv.setDienthoai(scanner.next());
			System.out.print("Nhập mã số thuế: ");
			nv.setMasothue(scanner.next());
			nhanvienDAO.insert(nv);
			break;
		case 3:
			System.out.print("Nhập mã nhân viên muốn chỉnh sửa: ");
			String pk = scanner.next();
			System.out.print("Nhập mã nhân viên: ");
			nv.setManv(scanner.next());
			System.out.print("Nhập mã bộ phận: ");
			nv.setMabp(scanner.next());
			System.out.print("Nhập họ và tên nhân viên: ");
			nv.setHoten(scanner.next());
			System.out.print("Nhập địa chỉ: ");
			nv.setDiachi(scanner.next());
			System.out.print("Nhập số điện thoại: ");
			nv.setDienthoai(scanner.next());
			System.out.print("Nhập mã số thuế: ");
			nv.setMasothue(scanner.next());
			nhanvienDAO.update(pk, nv);
			break;
		case 4:
			System.out.print("Vui lòng nhập mã nhân viên muốn xóa: ");
			nv.setManv(scanner.next());
			nhanvienDAO.delete(nv.getManv());
			break;
		default:
			System.out.println("Vui lòng nhập đúng yêu cầu!");
		}
	}
	
	public static void bophan() {
		BoPhanDAO bophanDAO = new BoPhanDAO();
		BoPhanEntity bp = new BoPhanEntity();
		switch (a) {
		case 1:
			System.out.println(bophanDAO.findAll());
			break;
		case 2:
			System.out.print("Nhập mã bô phận: ");
			bp.setMabp(scanner.next());
			System.out.print("Nhập mã cha: ");
			bp.setMacha(scanner.next());
			System.out.print("Nhập tên bộ phận: ");
			bp.setTenbp(scanner.next());
			bophanDAO.insert(bp);
			break;
		case 3:
			System.out.print("Nhập mã bộ phận muốn chỉnh sửa: ");
			String pk = scanner.next();
			System.out.print("Nhập mã bộ phận: ");
			bp.setMabp(scanner.next());
			System.out.print("Nhập mã cha: ");
			bp.setMacha(scanner.next());
			System.out.print("Nhập tên bộ phận: ");
			bp.setTenbp(scanner.next());
			bophanDAO.update(pk, bp);
			break;
		case 4:
			System.out.print("Vui lòng nhập mã bộ phận muốn xóa: ");
			bp.setMabp(scanner.next());
			bophanDAO.delete(bp.getMabp());
			break;
		default:
			System.out.println("Vui lòng nhập đúng yêu cầu!");
		}
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập 1 để truy cập bảng nhân viên.");
		System.out.println("Vui lòng nhập 2 để truy cập bảng bộ phận.");
		System.out.print("Vui lòng nhập: ");
		int b = scanner.nextInt();
		
		System.out.println("**********");
		
		System.out.println("Nhập 1 nếu bạn muốn hiển thị danh sách.");
		System.out.println("Nhập 2 nếu bạn muốn thêm mới.");
		System.out.println("Nhập 3 nếu bạn muốn chỉnh sửa.");
		System.out.println("Nhập 4 nếu bạn muốn xóa.");
		System.out.print("Vui lòng nhập: ");
		a = scanner.nextInt();
		
		switch (b) {
		case 1:
			nhanvien();
			break;
		case 2:
			bophan();
			break;
		}
	}
}
