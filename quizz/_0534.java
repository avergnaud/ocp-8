package quizz;

import static java.lang.System.out;
import java.sql.*;

public class _0534 {
public static void main(String... args) throws SQLException {

try(Connection conn = DriverManager.getConnection("jdbc:derby:mabase");
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select count(*) from animal");) {

int i = 0;
if(rs.next())
	i = rs.getInt("count");

out.println(i);
} catch(SQLException e) {out.println(e);}

}}
