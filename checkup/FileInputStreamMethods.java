#FileInputStream extends InputStream

#constructors
FileInputStream(File file) throws FileNotFoundException
FileInputStream(String name) throws FileNotFoundException

#inherited from InputStream
void close() throws IOException
int read() throws IOException
int read(byte[] b) throws IOException
int read(byte[] b,int offset,int length) throws IOException
long skip(long l) throws IOException
boolean markSupported()
void mark(int readLimit)
void reset() throws IOException

