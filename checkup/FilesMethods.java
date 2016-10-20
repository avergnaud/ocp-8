
/*Files methods that do not throw IOE !*/
static boolean exists(Path path, LinkOption... options)
static boolean	isDirectory(Path path, LinkOption... options)
static boolean	isRegularFile(Path path, LinkOption... options)
static boolean isSymbolicLink(Path path)
static boolean isReadable(Path path)
static boolean isExecutable(Path path)

/*methods that do throw IOE*/
static boolean isHidden(Path path) throws IOException
/*Depending on the implementation this method may require to access the file system to determine if the file is considered hidden.*/

static long size(Path path) throws IOException

//modifiedTime
static FileTime getLastModifiedTime(Path path, LinkOption... options) throws IOException
static Path setLastModifiedTime(Path path, FileTime time) throws IOException
//owner
static UserPrincipal getOwner(Path path, LinkOption... options) throws IOException
static Path setOwner(Path path, UserPrincipal owner) throws IOException

static void delete(Path path) throws IOException
static boolean deleteIfExists(Path path) throws IOException

static void move(Path source, Path dest,CopyOption... options) throws IOException

static Path copy(Path source, Path target, CopyOption... options) throws IOException
static long copy(InputStream in, Path target, CopyOption... options) throws IOException

static Path createDirectory(Path dir, FileAttribute<?>... attrs)  throws IOException
static Path createDirectories(Path dir, FileAttribute<?>... attrs) throws IOException

static BufferedReader newBufferedReader(Path path) throws IOException
static BufferedReader newBufferedReader(Path path, Charset cs) throws IOException
static BufferedWriter newBufferedWriter(Path path, OpenOption... options) throws IOException
static BufferedWriter newBufferedWriter(Path path, Charset cs, OpenOption... options) throws IOException

/*
Attributes
*/
static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> type, LinkOption... options) throws IOException

static <V extends FileAttributeView> V getFileAttributeView(Path path, Class<A> type, LinkOption... options) throws IOException



// !
static List<String> readAllLines(Path) throws IOException

/*
io streams AND Stream !
*/
Stream<Path> walk(Path path) throws IOException

Stream<Path> walk(Path, int) throws IOException

static Stream<Path> find(Path start,
                                int maxDepth,
                                BiPredicate<Path,BasicFileAttributes> matcher,
                                FileVisitOption... options)
                         throws IOException

Stream<Path> list(Path) throws IOException

// !
static Stream<String> lines(Path path)
                            throws IOException
