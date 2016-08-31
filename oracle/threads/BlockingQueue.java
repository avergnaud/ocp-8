/*
The wait() and notify() methods are designed to provide a mechanism to allow 
a thread to block until a specific condition is met. For this I assume
 you're wanting to write a blocking queue implementation, where you 
have some fixed size backing-store of elements.

The first thing you have to do is to identify the conditions that you want 
the methods to wait for. In this case, you will want the put() method to 
block until there is free space in the store, and you will want the take() 
method to block until there is some element to return.

http://stackoverflow.com/questions/2536692/a-simple-scenario-using-wait-and-notify-in-java
*/
package oracle.threads;

import java.util.*;

class FixedSized<T> {
	private Queue<T> queue = new LinkedList<T>();
    	private int capacity;

	public FixedSized(int capacity) {
        	this.capacity = capacity;
    	}
	
	synchronized void /*to get the lock for this*/ put(T t) {
		while(queue.size() >= capacity) {
			try {			
				this.wait();
				/*then the thread releases the lock on this
				and suspends execution*/
			} catch(InterruptedException e) {return;}
		}
		queue.add(t);
		notifyAll();/*notify all threads waiting for take()*/	
	}

	synchronized T take() {
		while(queue.isEmpty()) {
			try {
				this.wait();
			} catch(InterruptedException e) {
				return null;
			}
		}
		T item = queue.remove();
        	notifyAll();/*notify all threads waiting for put()*/
        	return item;
	}
}

public class BlockingQueue {
public static void main(String... args) {
 
}}
