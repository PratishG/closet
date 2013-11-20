//skeleton file for class Binary

public class Binary implements Comparable {

    private int _decNum;
    private String _binNum;

    /*=====================================
      default constructor
      pre:  n/a
      post: initializes _decNum to 0, _binNum to "0"
      =====================================*/
    public Binary() { 
	// *** YOUR IMPLEMENTATION HERE ***
    }


    /*=====================================
      overloaded constructor
      pre:  n >= 0
      post: sets _decNum to n, _binNum to equiv string of bits
      =====================================*/
    public Binary( int n ) {
	// *** YOUR IMPLEMENTATION HERE ***
    }


    /*=====================================
      String toString() -- returns String representation of this Object
      pre:  n/a
      post: returns String of 1's and 0's representing value of this Object
      =====================================*/
    public String toString() { 
	// *** YOUR IMPLEMENTATION HERE ***
	return ""; //placeholder to get past compiler
    }


    /*=====================================
      String decToBin(int) -- converts base-10 input to binary
      pre:  n >= 0
      post: returns String of bits
      eg  decToBin(0) -> "0"
          decToBin(1) -> "1"
	  decToBin(2) -> "10"
	  decToBin(3) -> "11"
	  decToBin(14) -> "1110"
      =====================================*/
    public static String decToBin( int n ) {
	// *** YOUR IMPLEMENTATION HERE ***
	return ""; //placeholder to get past compiler
    }


    /*=====================================
      String decToBinR(int) -- converts base-10 input to binary, recursively
      pre:  n >= 0
      post: returns String of bits
      eg  decToBinR(0) -> "0"
          decToBinR(1) -> "1"
	  decToBinR(2) -> "10"
	  decToBinR(3) -> "11"
	  decToBinR(14) -> "1110"
      =====================================*/
    public static String decToBinR( int n ) { 
	// *** YOUR IMPLEMENTATION HERE ***
	return ""; //placeholder to get past compiler
    }


    /*=============================================
      boolean equals(Object) -- tells whether 2 Objs are equivalent
      pre:  other is an instance of class Binary
      post: Returns true if this and other are aliases (pointers to same 
      Object), or if this and other represent equal binary values
      =============================================*/
    public boolean equals( Object other ) { 
	// *** YOUR IMPLEMENTATION HERE ***
	return false; //placeholder to get past compiler
    }


    /*=============================================
      int compareTo(Object) -- tells which of two Binary objects is greater
      pre:  other is instance of class Binary
      post: Returns 0 if this Object is less than input Object,
            negative integer if this < input, positive integer otherwise
      =============================================*/
    public int compareTo( Object other ) {
	// *** YOUR IMPLEMENTATION HERE ***
	return -1; //placeholder to get past compiler
    }


    //main method for testing
    public static void main( String[] args ) {

	System.out.println();
	System.out.println( "Testing ..." );

	/*=========================================
	Binary b1 = new Binary(5);
	Binary b2 = new Binary(5);
	Binary b3 = b1;
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);       //false b/c b1, b2 not aliases
	System.out.println(b1 == b2); //true b/c b1, b3 are aliases
	System.out.println(b1 == b3); //false, but should be true
	System.out.println(b1.equals(b2));
	  =========================================*/
    }//end main()

} //end class