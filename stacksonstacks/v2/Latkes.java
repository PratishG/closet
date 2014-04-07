/*****************************************************
 * class Latkes
 * Implements a stack of Strings using an array as underlying container.
 * New in Version 2: 
 * a) Adherence to specification; now implements Stack interface.
 * b) Fun new methods allMatched and flip! 
 *****************************************************/

public class Latkes {

    private String [] _stack;
    private int _stackSize;

    //constructor
    public Latkes( int size ) { 
	/*** YOUR IMPLEMENTATION HERE ***/
    }


    //means of insertion
    //a user of this class should be able to make unlimited pushes
    public void push( String s ) { 
	/*** YOUR IMPLEMENTATION HERE ***/
    }


    //means of removal
    public String pop( ) { 
	/*** YOUR IMPLEMENTATION HERE ***/
    }


    //chk for emptiness
    public boolean isEmpty() { 
	/*** YOUR IMPLEMENTATION HERE ***/
    }


    //chk for fullness
    public boolean isFull() { 
	/*** YOUR IMPLEMENTATION HERE ***/
    }


    //return top element without popping it
    public String peek() {
	/*** YOUR IMPLEMENTATION HERE ***/
    }


    /**********************************************************
     * precondition:  input string has length > 0
     * postcondition: returns reversed string s
     *                flip("desserts") -> "stressed"
     **********************************************************/
    public static String flip( String s ) { }


    /**********************************************************
     * precondition:  s contains only the characters {,},(,),[,]
     * postcondition: allMatched( "( {} [()] )" ) -> true
     *                allMatched( "([)]" )        -> false
     *                allMatched( "" )            -> true
     **********************************************************/
    public static boolean allMatched( String s ) { }



}//end class Latkes
