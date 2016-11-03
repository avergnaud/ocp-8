//interface java.nio.file.Path extends Comparable<Path>

boolean equals(Object other)
int compareTo(Path other)

File toFile()
URI toUri() /* Paths.get(p.toUri()).equals(p .toAbsolutePath()) */
String toString()

int getNameCount()
Path getName(int index)

Path getRoot()
Path getParent()
Path getFileName()

Path subpath(int beginIndex, int endIndex)

boolean isAbsolute()
Path	toAbsolutePath()
/*https://coderanch.com/t/659373/certification/difference-toAbsolutePath-toRealPath*/
/*http://stackoverflow.com/questions/1099300/whats-the-difference-between-getpath-getabsolutepath-and-getcanonicalpath?noredirect=1&lq=1*/
Path toRealPath(LinkOption... options) throws IOException /*By default, symbolic links are resolved to their final target. If the option NOFOLLOW_LINKS is present then this method does not resolve symbolic link*/

Path relativize(Path other)
Path resolve(Path other)
Path normalize()

Path resolveSibling(Path other)
Path resolveSibling(String other)
