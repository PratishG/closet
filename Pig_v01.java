//class Pig
//a Pig Latin translator
// v01 -- material discussed 2013-10-24 R
// change filename to Pig.java to compile

public class Pig {

    private static final String VOWELS = "aeiou";


    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA(“cat”, “a”) → true  
            hasA(“cat”, “p”) → false
      =====================================*/
    public static boolean hasA( String w, String letter ) {

	// *** your implementation here ***
	return false; //placeholder to get past compiler
    }


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ) {

	// *** your implementation here ***
	return false; //placeholder to get past compiler
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels(“meatball”) → 3
      =====================================*/
    public static int countVowels( String w ) {

	// *** your implementation here ***
	return 42; //placeholder to get past compiler
    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      =====================================*/
    public static boolean hasAVowel( String w ) {

	// *** your implementation here ***
	return false; //placeholder to get past compiler
    }


    /*=====================================
      String allVowels(String) -- returns the vowels in a String
      pre:  w != null
      post: allVowels(“meatball”) → “eaa”
      =====================================*/
    public static String allVowels( String w ) {

	// *** your implementation here ***
	return ""; //placeholder to get past compiler
    }


    public static void main( String[] args ) {

	String letter = "a";

	for( String w : args ) {
	    System.out.println( w + " has " + letter + "? " 
				+ hasA( w, letter ) );
	}   


    }

}//end class Pig

