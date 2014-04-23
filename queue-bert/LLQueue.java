/*****************************************************
 * class LLQueue
 * uses a linked list to implement a QUEUE
 * (a collection with FIFO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 ******************************************************/

public class LLQueue<T> implements Queue<T> {

    private LLNode<T> _front, _end;

    // default constructor creates an empty queue
    public LLQueue() { 
	/***YOUR IMPLEMENTATION HERE***/
    }

    // means of adding a thing to the collection
    public void enqueue( T enQVal ) {
	/***YOUR IMPLEMENTATION HERE***/
    }//O(?)


    // means of removing a thing from the collection
    // Remove and return thing at front of queue.
    // Assume _queue ! empty.
    public T dequeue() { 
	/***YOUR IMPLEMENTATION HERE***/
    }//O(?)


    // means of peeking at thing next in line for removal
    public T peekFront() {
	/***YOUR IMPLEMENTATION HERE***/
    }//O(?)


    public boolean isEmpty() {
	/***YOUR IMPLEMENTATION HERE***/
    }//O(?)


    // print each node, separated by spaces
    public String toString() { 
	String foo = "";
	LLNode<T> tmp = _front;
	while ( tmp != null ) {
	    foo += tmp.getValue() + " ";
	    tmp = tmp.getNext();
	}
	return foo;
    }//O(?)



    public static void main( String[] args ) {

	Queue<String> LLQueuelJ = new LLQueue<String>();

	System.out.println("\nnow enqueuing thrice..."); 
	LLQueuelJ.enqueue("James");
	LLQueuelJ.enqueue("Todd");
	LLQueuelJ.enqueue("Smith");

	System.out.println("\nnow testing toString()..."); 
	System.out.println( LLQueuelJ ); //for testing toString()...

	System.out.println("\nnow dequeuing thrice..."); 
	System.out.println( LLQueuelJ.dequeue() );
	System.out.println( LLQueuelJ.dequeue() );
	System.out.println( LLQueuelJ.dequeue() );

	System.out.println("\nDequeuing from empty queue should yield error..."); 
	System.out.println( LLQueuelJ.dequeue() );

    }//end main

}//end class LLQueue
