package quizz;

import static java.lang.System.out;
import java.sql.*;

public class _0531 {
public static void main(String... args) {

try(Connection conn = DriverManager.getConnection("jdbc:derby:mabase");
	Statement stmt = conn.createStatement(
		ResultSet.TYPE_FORWARD_ONLY,
		ResultSet.CONCUR_READ_ONLY);
	boolean ret = stmt.execute("select name from animal");) {

if(ret) {
	ResultSet rs = stmt.getResultSet();
	while(rs.next())
		out.println(rs.getString(1));
}

} catch(SQLException e) {
out.println(e);
} 

}}
