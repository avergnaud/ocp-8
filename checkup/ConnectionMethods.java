// interface java.sql.Connection implements java.lang.AutoCloseable

// no public constructor

Statement createStatement() throws SQLException

Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException
/*
resultSetType - a result set type; one of ResultSet.TYPE_FORWARD_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE, or ResultSet.TYPE_SCROLL_SENSITIVE
resultSetConcurrency - a concurrency type; one of ResultSet.CONCUR_READ_ONLY or ResultSet.CONCUR_UPDATABLE
*/

void setAutoCommit(boolean autoCommit) throws SQLException

Savepoint setSavepoint()  throws SQLException

Savepoint setSavepoint(String name) throws SQLException

void commit() throws SQLException

void rollback() throws SQLException

void rollback(Savepoint savepoint) throws SQLException
