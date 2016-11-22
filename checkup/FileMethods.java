//java.io.File

//constructor
public File(String pathname)
public File(String parent, String child)
public File(File parent, String child)
public File(URI uri)

Path toPath()
URI toURI() /* new File( f.toURI()).equals( f.getAbsoluteFile()) */

boolean exists()
boolean isDirectory()
boolean isFile()

//methods
public boolean createNewFile() throws IOException
boolean mkdir()
boolean mkdirs()

boolean renameTo(File dest)
boolean delete()

String getAbsolutePath()
public String getCanonicalPath() throws IOException
/*http://stackoverflow.com/questions/1099300/whats-the-difference-between-getpath-getabsolutepath-and-getcanonicalpath?noredirect=1&lq=1*/

String getName()
String getParent()
long length()

boolean isHidden()
long lastModified()
boolean setLastModified(long time)

File[] listFiles()

String[] list()
