
CyclicBarrier(int parties)
CyclicBarrier(int parties, Runnable action)

int await() throws InterruptedException, BrokenBarrierException

 int await(long timeout,
                 TimeUnit unit)
          throws InterruptedException,
                 BrokenBarrierException,
                 TimeoutException
