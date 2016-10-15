//constructors
ObjectInputStream(InputStream is)

//inherited from InputStream
void close() throws IOException
int read() throws IOException
int read(byte[] b) throws IOException
int read(byte[] b,int offset,int length) throws IOException
long skip(long l) throws IOException
boolean markSupported()
void mark(int readLimit)
void reset() throws IOException

//
public final Object readObject() throws IOException, ClassNotFoundException
