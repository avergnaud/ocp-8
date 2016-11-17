package quizz;

import static java.lang.System.out;
import java.sql.*;

/* assume at least:

stmt.executeUpdate("CREATE TABLE animal ("
	+ "id INTEGER PRIMARY KEY, "
	+"species_id integer REFERENCES species (id), "
	+ "name VARCHAR(255), "
	+ "date_born TIMESTAMP)");

stmt.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa', '2001-05-06 02:15:00')");
stmt.executeUpdate("INSERT INTO animal VALUES (2, 2, 'Zelda', '2002-08-15 09:12:00')");
stmt.executeUpdate("INSERT INTO animal VALUES (3, 1, 'Ester', '2002-09-09 10:36:00')");
stmt.executeUpdate("INSERT INTO animal VALUES (4, 1, 'Eddie', '2010-06-08 01:24:00')");
stmt.executeUpdate("INSERT INTO animal VALUES (5, 2, 'Zoe', '2005-11-12 03:44:00')");

 */
public class _0538 {
public static void main(String... args) throws SQLException {

try(Connection conn = DriverManager.getConnection("jdbc:derby:mabase");
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select * from animal");) {

rs.first();
out.println(rs.getInt("id"));

} catch(SQLException e) {out.println(e);}

}}
