
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

static FileTime getLastModifiedTime(Path path) throws IOException

static Path setLastModifiedTime(Path path, FileTime time) throws IOException

static Stream<Path> list(Path dir) throws IOException

static void delete(Path path) throws IOException

boolean deleteIfExists(Path path) throws IOException

static void move(Path source, Path dest) throws IOException

static Path createDirectory(Path dir,
                                   FileAttribute<?>... attrs)
                            throws IOException

static Path createDirectories(Path dir,
                                     FileAttribute<?>... attrs)
                              throws IOException

static Path copy(Path source, Path dest) throws IOException

static long copy(InputStream in,
                        Path target,
                        CopyOption... options)
                 throws IOException

// !
static List<String> readAllLines(Path) throws IOException


public static UserPrincipal getOwner(Path path,
                                     LinkOption... options)
                              throws IOException

public static Path setOwner(Path path,
                            UserPrincipal owner)
                     throws IOException

static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> type, LinkOption... options)

static <V extends FileAttributeView> V getFileAttributeView()

/* io streams AND Stream ! */
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
