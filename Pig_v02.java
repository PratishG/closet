//class Pig
//a Pig Latin translator

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
      String allVowels(String) -- tells whether a Strings is all vowels
      pre:  w != null
      post: allVowels(“meatball”) → “eaa”
      =====================================*/
    public static String allVowels( String w ) {

	// *** your implementation here ***
	return ""; //placeholder to get past compiler
    }


    /*=====================================
      String firstVowel(String) -- returns first vowel in a String
      pre:  w != null
      post: firstVowel("") --> ""
            firstVowel("zzz") --> ""
            firstVowel("meatball") --> "e"
      =====================================*/
    public static String firstVowel( String w ) {

	// *** your implementation here ***
	return ""; //placeholder to get past compiler
    }


    /*=====================================
      boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
      pre:  w != null and w.length() > 0
      post: beginsWithVowel("apple")  --> true
            beginsWithVowel("strong") --> false
      =====================================*/
    public static boolean beginsWithVowel( String w ) {

	// *** your implementation here ***
	return false; //placeholder to get past compiler
    }


    /*=====================================
      String engToPig(String) -- converts an English word to Pig Latin
      pre:  w.length() > 0
      post: engToPig("apple")  --> "appleway"
            engToPig("strong") --> "ongstray"
            engToPig("java")   --> "avajay"
      =====================================*/
    public static String engToPig( String w ) {

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

