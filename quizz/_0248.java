package quizz;

import static java.lang.System.out;

public class _0248 {

public static void main(String... args) throws InterruptedException {

Thread.currentThread().interrupt();
out.println("interrupted " + Thread.interrupted());




/*
Every thread has a Boolean property associated with it that represents its interrupted status. The interrupted status is initially false; when a thread is interrupted by some other thread through a call to Thread.interrupt(), one of two things happens. If that thread is executing a low-level interruptible blocking method like Thread.sleep(), Thread.join(), or Object.wait(), it unblocks and throws InterruptedException. Otherwise, interrupt() merely sets the thread's interruption status. Code running in the interrupted thread can later poll the interrupted status to see if it has been requested to stop what it is doing; the interrupted status can be read with Thread.isInterrupted() and can be read and cleared in a single operation with the poorly named Thread.interrupted().
Interruption is a cooperative mechanism. When one thread interrupts another, the interrupted thread does not necessarily stop what it is doing immediately. Instead, interruption is a way of politely asking another thread to stop what it is doing if it wants to, at its convenience. Some methods, like Thread.sleep(), take this request seriously, but methods are not required to pay attention to interruption. Methods that do not block but that still may take a long time to execute can respect requests for interruption by polling the interrupted status and return early if interrupted. You are free to ignore an interruption request, but doing so may compromise responsiveness.
*/

}
}

