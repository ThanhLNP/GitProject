package cafe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class NhanVienDAO {
	private Connection connection;
	private ConnectDB connectDB;
	private ResultSet resultSet;
	private Statement statement;
	private PreparedStatement preparedStatement;

	public NhanVienDAO() {
		connectDB = new ConnectDB();
	}

	public ArrayList<NhanVienEntity> findAll() {
		ArrayList<NhanVienEntity> listnv = new ArrayList<>();
		NhanVienEntity nv;
		connection = connectDB.getConnect();
		String sql = "SELECT * FROM nhanvien";
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				nv = new NhanVienEntity();
				nv.setManv(resultSet.getString("manv"));
				nv.setMabp(resultSet.getString("mabp"));
				nv.setHoten(resultSet.getString("hoten"));
				nv.setDiachi(resultSet.getString("diachi"));
				nv.setDienthoai(resultSet.getString("dienthoai"));
				nv.setMasothue(resultSet.getString("masothue"));
				listnv.add(nv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listnv;
	}

	public void insert(NhanVienEntity nv) {
		connection = connectDB.getConnect();
		String sql = "insert into nhanvien(manv, mabp, hoten, diachi, dienthoai, masothue) value(?, ?, ?, ?, ?, ?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, nv.getManv());
			preparedStatement.setString(2, nv.getMabp());
			preparedStatement.setString(3, nv.getHoten());
			preparedStatement.setString(4, nv.getDiachi());
			preparedStatement.setString(5, nv.getDienthoai());
			preparedStatement.setString(6, nv.getMasothue());
			preparedStatement.executeUpdate();
			System.out.println("Thêm thành công!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void update(String pk, NhanVienEntity nv) {
		connection = connectDB.getConnect();
		String sql = "update nhanvien set manv = ?, mabp = ?, hoten = ?, diachi = ?, dienthoai = ?, masothue = ? where manv = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, nv.getManv());
			preparedStatement.setString(2, nv.getMabp());
			preparedStatement.setString(3, nv.getHoten());
			preparedStatement.setString(4, nv.getDiachi());
			preparedStatement.setString(5, nv.getDienthoai());
			preparedStatement.setString(6, nv.getMasothue());
			preparedStatement.setString(7, pk);
			preparedStatement.executeUpdate();
			System.out.println("Cập nhập thành công!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void delete(String manv) {
		connection = connectDB.getConnect();
		String sql = "delete from nhanvien where manv = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, manv);
			preparedStatement.executeUpdate();
			System.out.println("Xóa thành công!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}