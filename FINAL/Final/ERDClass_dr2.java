package Final;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ERDClass_dr2 {
	private Connection con;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public ERDClass_dr2() throws ClassNotFoundException, SQLException {
	con = new DBConnClass().getConnection();
	}

	public boolean delete_score1 () {
		
		String sql=" delete from RESULT2 ";

			try {
				pstmt=con.prepareStatement(sql);
				
				pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("insertion error");
				return false;
			}	
		return true;
	}
}
