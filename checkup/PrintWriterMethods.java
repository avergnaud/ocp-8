// java.io.PrintWriter extends Writer implements java.io.Closeable, java.lang.AutoCloseable

#constructors
PrintWriter(Writer writer)
PrintWriter(File file) throws FileNotFoundException
PrintWriter(String fileName) throws FileNotFoundException
PrintWriter(OutputStream outputStream) /*Creates a new PrintWriter, without automatic line flushing, from an existing OutputStream.
This convenience constructor creates the necessary intermediate OutputStreamWriter, which will convert characters into bytes using
the default character encoding.*/

#methods (override methods in Writer:)
public PrintWriter append(char c)
public PrintWriter append(CharSequence csq)
public PrintWriter append(CharSequence csq, int start, int end)
public void write(int c)
public void write(char[] buf)
public void write(char[] buf, int off, int len)
public void write(String s)
public void write(String s, int off, int len)

PrintWriter format(String format, Object... args)
PrintWriter printf(String format, Object... args)
void print(<<>>)
void println(<<>>)

void flush()
void close() /* no IOE */
