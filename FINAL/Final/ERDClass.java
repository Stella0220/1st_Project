package Final;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ERDClass {
	private Connection con;
	PreparedStatement pstmt=null;
	ResultSet rs=null;

	public ERDClass() throws ClassNotFoundException, SQLException {
	con = new DBConnClass().getConnection();
	}

	public boolean send_score (String name) {
		try {
			pstmt = con.prepareStatement("update USERINFO set GSCORE_W=GSCORE_W+FW where name=?");
			pstmt.setString(1, name);
			pstmt.executeUpdate();

			pstmt = con.prepareStatement("update USERINFO set GSCORE_L=GSCORE_L+FL where name=?");
			pstmt.setString(1, name);
			pstmt.executeUpdate();

			pstmt = con.prepareStatement("delete from RESULT1");
			pstmt.executeUpdate();

			pstmt = con.prepareStatement("delete from RESULT2");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insertion error");
			return false;
		}
		return true;
	}
}
