package cafe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BoPhanDAO {
	private Connection connection;
	private ConnectDB connectDB;
	private ResultSet resultSet;
	private Statement statement;
	private PreparedStatement preparedStatement;

	public BoPhanDAO() {
		connectDB = new ConnectDB();
	}

	public ArrayList<BoPhanEntity> findAll() {
		ArrayList<BoPhanEntity> listbp = new ArrayList<>();
		BoPhanEntity bp;
		connection = connectDB.getConnect();
		String sql = "SELECT * FROM bophan";
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				bp = new BoPhanEntity();
				bp.setMabp(resultSet.getString("mabp"));
				bp.setMacha(resultSet.getString("macha"));
				bp.setTenbp(resultSet.getString("tenbp"));
				listbp.add(bp);
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
		return listbp;
	}

	public void insert(BoPhanEntity bp) {
		connection = connectDB.getConnect();
		String sql = "insert into bophan(mabp, macha, tenbp) value(?, ?, ?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, bp.getMabp());
			preparedStatement.setString(2, bp.getMacha());
			preparedStatement.setString(3, bp.getTenbp());
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

	public void update(String pk, BoPhanEntity bp) {
		connection = connectDB.getConnect();
		String sql = "update bophan set mabp = ?, macha = ?, tenbp = ? where mabp = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, bp.getMabp());
			preparedStatement.setString(2, bp.getMacha());
			preparedStatement.setString(3, bp.getTenbp());
			preparedStatement.setString(4, pk);
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

	public void delete(String mabp) {
		connection = connectDB.getConnect();
		String sql = "delete from bophan where mabp = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, mabp);
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
