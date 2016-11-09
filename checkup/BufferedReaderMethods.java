

BufferedReader(Reader reader)

int read() throws IOException

int read(char[] cbuf) throws IOException

int read(char[] cbuf, int offset, int length) throws IOException

String readLine() throws IOException

public Stream<String> lines()

void close() throws IOException

boolean markSupported()

void mark(int readLimit) throws IOException

public void reset() throws IOException

public long skip(long n) throws IOException
