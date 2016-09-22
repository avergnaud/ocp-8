package quizz;

import static java.lang.System.out;
import java.sql.*;
import java.time.*;

/* date_born TIMESTAMP */
public class _0537 {
public static void main(String... args) throws SQLException {

try(Connection conn = DriverManager.getConnection("jdbc:derby:mabase");
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select date_born from animal"
		+ " where name = 'Elsa'");) {

if(!rs.next()) {
out.println("no Elsa");//assume Elsa is present
return;
}

java.sql.Timestamp ts = rs.getTimestamp("date_born");
LocalDateTime ldt = ts.toLocalDateTime();
out.println(ldt);

java.sql.Date d = rs.getDate("date_born");
LocalDate ld = d.toLocalDate();
out.println(ld);

java.sql.Time t = rs.getTime("date_born");
LocalTime lt = t.toLocalTime();
out.println(lt);

} catch(SQLException e) {out.println(e);}

}}
