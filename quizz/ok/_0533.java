package quizz;

import static java.lang.System.out;
import java.sql.*;

public class _0533 {
public static void main(String... args) throws SQLException {

Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
try {
	conn = DriverManager.getConnection("jdbc:derby:mabase");
	stmt = conn.createStatement(
			ResultSet.TYPE_FORWARD_ONLY,
			ResultSet.CONCUR_READ_ONLY);
	boolean ret = stmt.execute("select name from animal");

	if(ret) {
		rs = stmt.getResultSet();
		while(rs.next())
			out.println(rs.getString(1));
	}

} catch(SQLException e) {
out.println(e);
} finally {
	rs.close();
	stmt.close();
	conn.close();
}

}}
