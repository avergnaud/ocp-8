
void copy(Path source, Path dest) throws IOException

void delete(Path path) throws IOException

boolean deleteIfExists(Path path) throws IOException

void move(Path source, Path dest) throws IOException

isRegularFile

isSymbolicLink

isDirectory

isHidden

isReadable

isExecutable

size

FileTime getLastModifiedTime(Path path)

Path setLastModifiedTime(Path path, FileTime time)

getOwner

setOwner

getAttributes

static <V extends FileAttributeView> V getFileAttributeView()

/* io streams AND Stream ! */
Stream<Path> walk(Path path)

walk(Path, int)
