/*select name from animal*/
package ch10;

import static java.lang.System.out;
import java.sql.*;

public class P513 {
public static void main(String... args) {

try(Connection conn = DriverManager.getConnection("jdbc:derby:mabase");
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select name from animal");) {

while(rs.next())
	out.println(rs.getString(1));

} catch(SQLException e) {
out.println(e);
}

}}
