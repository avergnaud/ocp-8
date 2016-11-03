// class java.io.BufferedWriter extends java.io.Writer implements java.lang.AutoCloseable, java.io.Closeable

public BufferedWriter(Writer)

//inherited from Writer :
public Writer append(char c) throws IOException
public Writer append(CharSequence csq) throws IOException
public Writer append(CharSequence csq, int start, int end) throws IOException
public void write(char[] cbuf) throws IOException
public void write(String str) throws IOException

//methods
public void write(int b)
public void write(char[], int offset, int length)
public void write(String s, int off, int len) throws IOException

public void newLine() throws IOException

public void flush() throws IOException

public void close() throws IOException
