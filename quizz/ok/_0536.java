package quizz;

import static java.lang.System.out;
import java.sql.*;

public class _0536 {
public static void main(String... args) throws SQLException {

try(Connection conn = DriverManager.getConnection("jdbc:derby:mabase");
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select count(*) as count from animal");) {

int i = rs.getInt("count");

out.println(i);

} catch(SQLException e) {out.println(e);}

}}
