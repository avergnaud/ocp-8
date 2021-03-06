// interface java.sql.ResultSet implements AutoCloseable

/* constants */
int TYPE_FORWARD_ONLY
int TYPE_SCROLL_INSENSITIVE
int TYPE_SCROLL_SENSITIVE

int CONCUR_READ_ONLY
int CONCUR_UPDATABLE

/* methods */
void close() throws SQLException
ResultSetMetaData getMetaData() throws SQLException

/* METHOD available at runtime for all statements */
boolean next() throws SQLException

/* METHODS available at runtime for statements ResultSet.TYPE_SCROLL_SENSITIVE
and ResultSet.TYPE_SCROLL_INSENSITIVE */
boolean previous() throws SQLException
void beforeFirst() throws SQLException
boolean first() throws SQLException
boolean last() throws SQLException
void afterLast() thorws SQLException
boolean absolute(int row) throws SQLException
boolean relative(int rows) throws SQLException

/* available at runtime for all statements */
int getInt(int index)
int getInt(String colName)

String getString(int index)
String getString(String colName)

boolean getBoolean(int index)
boolean getBoolean(String colName)

long getLong(int index)
long getLong(String colName)

double getDouble(int index)
double getDouble(String colName)

Object getObject(int index)
Object getObject(String colName)

java.sql.Date getDate(int index)
java.sql.Date getDate(String colName)

java.sql.Time getTime(int index)
java.sql.Time getTime(String colName)

java.sql.TimeStamp getTimestamp(int index)
java.sql.TimeStamp getTimetamp(String colName)
