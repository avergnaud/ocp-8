Statement createStatement()
Statement createStatement(int resultSetType, int resultSetConcurrency)

void setAutoCommit(boolean autoCommit) throws SQLException

Savepoint setSavepoint()  throws SQLException

Savepoint setSavepoint(String name) throws SQLException

void commit() throws SQLException

void rollback() throws SQLException

void rollback(Savepoint savepoint) throws SQLException
