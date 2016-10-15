#abstract class InputStream implements AutoCloseable
void close() throws IOException
int read() throws IOException
int read(byte[] b) throws IOException
public int read(byte[] b,int off,int len) throws IOException
boolean markSupported()
public void mark(int readlimit)
public void reset() throws IOException
public long skip(long n) throws IOException
