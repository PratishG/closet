/*****************************************************
 * class RQueue
 * A linked-list-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linked list points opposite direction. Q: Why?
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 ******************************************************/


public class RQueue<T> implements Queue<T> {

    private LLNode<T> _front, _end;
    private int _size;

    // default constructor
    // creates an empty queue
    public RQueue() { 
	/***YOUR IMPLEMENTATION HNYAH***/
    }//O(?)

    public void enqueue( T enQVal ) {
	/***YOUR IMPLEMENTATION HNYAH***/
    }//O(?)

    // remove and return thing at front of queue
    // then reorder elements
    // assume _queue ! empty
    public T dequeue() { 
	/***YOUR IMPLEMENTATION HNYAH***/
    }//O(?)

    public T peekFront() {
	/***YOUR IMPLEMENTATION HNYAH***/
    }//O(?)

    private void sample () {
	/***YOUR IMPLEMENTATION HNYAH***/
    }//O(?)

    public boolean isEmpty() { 
	/***YOUR IMPLEMENTATION HNYAH***/
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
    }


    public static void main( String[] args ) {

	Queue<String> PirateQueue = new RQueue<String>();

	System.out.println("\nnow enqueuing..."); 
	PirateQueue.enqueue("Dread");
	PirateQueue.enqueue("Pirate");
	PirateQueue.enqueue("Robert");
	PirateQueue.enqueue("Blackbeard");
	PirateQueue.enqueue("Peter");
	PirateQueue.enqueue("Stuyvesant");

	System.out.println("\nnow testing toString()..."); 
	System.out.println( PirateQueue ); //for testing toString()...

	System.out.println("\nnow dequeuing..."); 
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );

	System.out.println("\nnow dequeuing from empty queue..."); 
	System.out.println( PirateQueue.dequeue() );

    }//end main

}//end class RQueue
