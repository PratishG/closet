/*****************************************************
 * class ALHeap  ---  skeleton
 * Implements a min heap using an ArrayList as underlying container
 * 
 * TASK:
 * Implement all methods
 * Add helpers as necessary
 * Classify runtime of each method
 *****************************************************/

import java.util.ArrayList;


public class ALHeap {

    //instance vars
    private ArrayList<Integer> _heap; //underlying container
    

    /*****************************************************
     * default constructor  ---  inits empty heap
     *****************************************************/
    public ALHeap() 
    // {
    // 	/*** YOUR IMPLEMENTATION HERE ***/
    // }//O(?)



    /*****************************************************
     * boolean isEmpty()
     * Returns true if no meaningful elements in heap, false otherwise
     *****************************************************/
    public boolean isEmpty() 
    // {
    // 	/*** YOUR IMPLEMENTATION HERE ***/
    // }//O(?)



    /*****************************************************
     * add(Integer) 
     * Inserts an element in the heap
     * Postcondition: Tree maintains heap property.
     *****************************************************/
    public void add( Integer addVal ) 
    // {
    // 	/*** YOUR IMPLEMENTATION HERE ***/
    // }//O(?)



    /*****************************************************
      * Integer peekMin()
      * Returns min value in heap
      * Postcondition: Heap remains unchanged.
      *****************************************************/
    public Integer peekMin() 
    // {
    // 	/*** YOUR IMPLEMENTATION HERE ***/
    // }//O(?)



    /*****************************************************
     * removeMin()  ---  means of removing an element from heap
     * Removes and returns least element in heap.
     * Postcondition: Tree maintains heap property.
     *****************************************************/
    public Integer removeMin() 
    // {
    // 	/*** YOUR IMPLEMENTATION HERE ***/
    // }//O(?)



    /*****************************************************
     * minChildPos(int)  ---  helper fxn for removeMin()
     * Returns index of least child, or 
     * -1 if no children, or if input pos is not in ArrayList
     * Postcondition: Tree unchanged
     *****************************************************/
    private int minChildPos( int pos ) 
    // {
    // 	/*** YOUR IMPLEMENTATION HERE ***/
    // }//O(?)



    //~~~~~~~~~~~~~~~v~  MISC HELPERS ~v~~~~~~~~~~~~~~~

    // perhaps a SWAPPER... ?

    // perhaps a minOf(Integer,Integer)... ?

    //~~~~~~~~~~~~~~~^~  MISC HELPERS ~^~~~~~~~~~~~~~~~



    /*****************************************************
     * toString()  ---  overrides inherited method
     * Returns either 
     * a) a level-order traversal of the tree (simple version)
     * b) ASCII representation of the tree (bit more complicated, much more fun)
     *****************************************************/
    public String toString() 
    // {
    // 	/*** YOUR IMPLEMENTATION HERE ***/
    // }//O(?)






    //main method for testing
    public static void main( String[] args ) {

	ALHeap pile = new ALHeap();

	pile.add(2);
	System.out.println(pile);
	pile.add(4);
	System.out.println(pile);
	pile.add(6);
	System.out.println(pile);
	pile.add(8);
	System.out.println(pile);
	pile.add(10);
	System.out.println(pile);
	pile.add(1);
	System.out.println(pile);
	pile.add(3);
	System.out.println(pile);
	pile.add(5);
	System.out.println(pile);
	pile.add(7);
	System.out.println(pile);
	pile.add(9);
	System.out.println(pile);

	System.out.println("removing " + pile.removeMin() + "...");
	System.out.println(pile);
	System.out.println("removing " + pile.removeMin() + "...");
	System.out.println(pile);
	System.out.println("removing " + pile.removeMin() + "...");
	System.out.println(pile);
	System.out.println("removing " + pile.removeMin() + "...");
	System.out.println(pile);
	System.out.println("removing " + pile.removeMin() + "...");
	System.out.println(pile);
	System.out.println("removing " + pile.removeMin() + "...");
	System.out.println(pile);
	System.out.println("removing " + pile.removeMin() + "...");
	System.out.println(pile);
	System.out.println("removing " + pile.removeMin() + "...");
	System.out.println(pile);
	System.out.println("removing " + pile.removeMin() + "...");
	System.out.println(pile);
	System.out.println("removing " + pile.removeMin() + "...");
	System.out.println(pile);
	System.out.println("removing " + pile.removeMin() + "...");
	System.out.println(pile);
    }//end main()

}//end class ALHeap
