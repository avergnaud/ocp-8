// java.nio.file.Path methods

// no public constructor


Path toRealPath(LinkOption... options) throws IOException
Path toAbsolutePath()
/*https://coderanch.com/t/659373/certification/difference-toAbsolutePath-toRealPath*/
/*http://stackoverflow.com/questions/1099300/whats-the-difference-between-getpath-getabsolutepath-and-getcanonicalpath?noredirect=1&lq=1*/
File toFile()
URI toUri()

boolean isAbsolute()

Path subpath(int beginIndex, int endIndex)

Path relativize(Path other)
Path resolve(Path other)
Path normalize()

int getNameCount()
Path getName(int index)
Path getRoot()
Path getParent()
Path getFileName()
