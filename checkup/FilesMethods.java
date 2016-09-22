
void copy(Path source, Path dest) throws IOException

void delete(Path path) throws IOException

boolean deleteIfExists(Path path) throws IOException

void move(Path source, Path dest) throws IOException

// !
List<String> readAllLines(Path)

isRegularFile

isSymbolicLink

isDirectory

isHidden throws IOException

isReadable

isExecutable

size throws IOException

FileTime getLastModifiedTime(Path path) throws IOException

Path setLastModifiedTime(Path path, FileTime time) throws IOException

getOwner

setOwner

getAttributes

static <V extends FileAttributeView> V getFileAttributeView()

/* io streams AND Stream ! */
Stream<Path> walk(Path path)

Stream<Path> walk(Path, int)

Stream<Path> find(Path, int, BiPredicate<Path,BasicFileAttributes>)

Stream<Path> list(Path) throws IOException

// !
Stream<String> lines(Path)
