/*==================================================
  class BinSearch
  ==================================================*/

public class BinSearch {


    /*==================================================
      int binSearch(int[],int) -- searches an array of ints for target int
      pre:  input array is sorted in ascending order
      post: returns index of target, or returns -1 if target not found
      ==================================================*/
    public static int binSearch ( int[] a, int target ) {
	//uncomment exactly 1 of the 2 stmts below:

	return binSearchIter( a, target, 0, a.length-1 );
	//return binSearchRec( a, target, 0, a.length-1 );
    }


    public static int binSearchRec( int[] a, int target, int lo, int hi ) {
	int tPos = -1; //init return var to flag value -1
	int m = (lo + hi) / 2; //init mid pos var

	if (lo > hi) //exit case. If lo & hi have crossed, target not present


	if ( a[m] == target ) // target found

	else if ( a[m] > target ) // value at middle index higher than target

	else if ( a[m] < target ) // value at middle index lower than target

	
	return tPos;
    }//end binSearchRec


    public static int binSearchIter( int[] a, int target, int lo, int hi ) {
	int tPos = -1; //init return var to flag value -1
	int m = (lo + hi) / 2; //init mid pos var

	while( lo <= hi ) { // run until lo & hi cross
	    m = ; //update mid pos var
	    if ( a[m] == target ) // target found

	    else if ( a[m] > target ) // value at mid index higher than target
		
	    else if ( a[m] < target ) // value at mid index lower than target
		
	}
	return tPos;
    }//end binSearchIter



    //tell whether an array is sorted in ascending order
    private static boolean isSorted( int[] arr ) {

	boolean retBoo = true; //init to true, assume array is sorted

	//Q: Why would a FOREACH loop not suffice here?
	for( int i=0; i < arr.length-1; i++ ) {
	    if ( !( arr[i] < arr[i+1] ) ) {
		return false;
	    }
	}
	return retBoo; //if entire array was traversed, it must be sorted
    }


    // utility/helper fxn to display contents of an array of Objects
    private static void printArray( int[] arr ) {
	String output = "[ "; 

	for( int i : arr )
	    output += i + ", ";

	output = output.substring( 0, output.length()-2 ) + " ]";

	System.out.println( output );
    }



    //main method for testing
    public static void main ( String[] args ) {

	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	System.out.println("\nNow testing binSearch on int array...");

	//Declare and initialize array of ints
	int[] iArr = { 2, 4, 6, 8, 6, 42 };
	printArray( iArr );
	System.out.println( "iArr1 sorted? -- " + isSorted(iArr) );

	int[] iArr2 = { 2, 4, 6, 8, 13, 42 };
	printArray( iArr2 );
	System.out.println( "iArr2 sorted? -- " + isSorted(iArr2) );

	//search for 6 in array 
	System.out.println( binSearch(iArr2,2) );
	System.out.println( binSearch(iArr2,4) );
	System.out.println( binSearch(iArr2,6) );
	System.out.println( binSearch(iArr2,8) );
	System.out.println( binSearch(iArr2,13) );
	System.out.println( binSearch(iArr2,42) );

	//search for 43 in array 
	System.out.println( binSearch(iArr2,43) );


	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	/*==================================================
	==================================================*/

	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }//end main()

}//end class BinSearch
