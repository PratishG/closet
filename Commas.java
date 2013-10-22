//class Commas
//skeleton file

public class Commas {

    /*=====================================
      String commafyR(int) -- inserts commas in a number, every 3rd digit,
      recursively.
      precondition:  n is non-negative integer
      postcondition: returns String version of n with commas inserted
      =====================================*/
    public static String commafyR( int n ) {
	// your implementation here
	return ""; //placeholder to get past compiler
    }

    /*=====================================
      String commafyF(int) -- inserts commas in a number, every 3rd digit,
      using a FOR Loop.
      precondition:  n is non-negative integer
      postcondition: returns String version of n with commas inserted
      =====================================*/
    public static String commafyF( int n ) {
	// your implementation here
	return ""; //placeholder to get past compiler
    }


    //main method for testing
    public static void main( String[] args ) {

	System.out.println( "Testing recursive version:" );
	commafyR(1);  // 1
	commafyR(10); // 10
	commafyR(101); // 101
	commafyR(1000); // 1,000
	commafyR(12345); // 12,345

	System.out.println( "Testing iterative version:" );
	commafyF(1);  // 1
	commafyF(10); // 10
	commafyF(101); // 101
	commafyF(1000); // 1,000
	commafyF(12345); // 12,345
    }

} //end class