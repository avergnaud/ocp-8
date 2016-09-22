package quizz;

import static java.lang.System.out;
import java.sql.*;

public class _0528 {
public static void main(String... args) {

try(Connection conn = DriverManager.getConnection("jdbc:derby:mabase");
	Statement stmt = conn.createStatement(
		ResultSet.TYPE_FORWARD_ONLY,
		ResultSet.CONCUR_READ_ONLY);
	ResultSet rs = stmt.executeQuery("select name from animal");) {

while(rs.next())
	out.println(rs.getString(0));

} catch(SQLException e) {
out.println(e);
}

}}
