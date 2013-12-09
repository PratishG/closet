/*==================================================
  class SuperArray version 5.0
  Wrapper class for array. Facilitates 
  *  resizing 
  *  expansion 
  *  read/write capability on elements
  *  adding an element to end of array
  *  adding an element at specified index
  *  removing an element at specified index
  ...and now SuperArray complies with the specifications of the 
  List interface. (List.java must be in same dir as this file)
  ==================================================*/

public class SuperArray<T> implements List<T> {

    private /*?*/[] _data;  //underlying container structure
    private int _lastPos; //marker for last meaningful value
    private int _size;    //number of meaingful values


    //default constructor
    //initializes 10-item array
    public SuperArray() { 
	_data = (T[])new Object[10]; //typecast into array of T's
	_lastPos = 0;
	_size = 0;	
    }


    // *** COPY YOUR EXISTING METHODS HERE ***
    // ... with modifications as necessary ...


    public static void main( String[] args ) {

	/*----------------
	   Because the underlying data structure was declared as follows:
	   T[] _data = (T[]) new Object[10];

	   ...the length call below (from v4) becomes problematic:
	   for( int i = 0; i < curtis._data.length; i++ ) {
          	   curtis.set( i, i * 2 );
	   }
	----------------*/

	SuperArray<Integer> mayfield = new SuperArray<Integer>();
	System.out.println("Printing empty SuperArray mayfield...");
	System.out.println(mayfield);

	mayfield.add(5);
	mayfield.add(4);
	mayfield.add(3);
	mayfield.add(2);
	mayfield.add(1);

	System.out.println("Printing populated SuperArray mayfield...");
	System.out.println(mayfield);

	mayfield.remove(3);
	System.out.println("Printing SuperArray mayfield post-remove...");
	System.out.println(mayfield);
	mayfield.remove(3);
	System.out.println("Printing SuperArray mayfield post-remove...");
	System.out.println(mayfield);

	mayfield.add(3,99);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	mayfield.add(2,88);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	mayfield.add(1,77);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield);
	/*===========================================
	===========================================*/
    }//end main()

}//end class SuperArray
