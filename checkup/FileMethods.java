//java.io.File

//constructor
public File(String pathname)
public File(String parent, String child)
public File(File parent, String child)
public File(URI uri)

//methods
public boolean createNewFile() throws IOException
boolean mkdir()
boolean mkdirs()

boolean renameTo(File dest)
boolean delete()

boolean exists()
boolean isDirectory()
boolean isFile()


String getAbsolutePath()
public String getCanonicalPath() throws IOException
/*http://stackoverflow.com/questions/1099300/whats-the-difference-between-getpath-getabsolutepath-and-getcanonicalpath?noredirect=1&lq=1*/

String getName()
long length()

long lastModified()
boolean setLastModified(long time)

String getParent()
File[] listFiles()

Path toPath()

boolean isHidden()
