//abstract class java.io.Writer implements java.io.Closeable, java.lang.AutoCloseable

//no public constructor

//
Writer append(char c) throws IOException
Writer append(CharSequence csq) throws IOException
Writer append(CharSequence csq, int START, int END) throws IOException

void write(int c) throws IOException
void write(char[] cbuf) throws IOException
abstract void write(char[] cbuf, int OFFSET, int LENGTH) throws IOException
void write(String str) throws IOException
void write(String str, int OFFSET, int LENGTH) throws IOException

abstract void flush() throws IOException
abstract void close() throws IOException
