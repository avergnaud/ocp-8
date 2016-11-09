#abstract class InputStream implements AutoCloseable
void close() throws IOException
abstract int read() throws IOException
int read(byte[] b) throws IOException
int read(byte[] b,int off,int len) throws IOException
boolean markSupported()
void mark(int readlimit)
void reset() throws IOException
long skip(long n) throws IOException
