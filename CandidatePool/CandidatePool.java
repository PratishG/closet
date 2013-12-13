/*=====================================
  class CandidatePool -- 

  Each CandidatePool object contains the following
  instance variables that you may need to use:
       
  _pool
      An ArrayList of only Candidate objects


  You will need to write the following methods:
   
  getCandidatesForPosition( String pos )
      Returns a candidate-only ArrayList containing all
      the Candidates in _pool that have position pos.

  getBestCandidate( String pos )
      Returns the Candidte in _pool that matches position
      pos with the highest score.
      If there are no candidates for the given position, 
      returns null.

  removeCandidatesForPosition( String pos )
      Removes all the Candidates in the _pool that match
      position pos.
      Returns number of candidates removed.
  =====================================*/

//We usually leave this out because Java does this automatically:
import java.io.*; 
//...but this is not automatically performed (util pkg contains ArrayList):
import java.util.*;


public class CandidatePool {

    //=================================
    //DO NOT MODIFY THIS CODE BLOCK
    ArrayList<Candidate> _pool;
    
    public CandidatePool() {
	_pool = new ArrayList<Candidate>();
    }

    public void addCandidate( Candidate c ) {
	_pool.add(c);
    }

    public String toString() {
	return _pool.toString();
    }    
    //=================================



    //YOUR WORK BELOW:
    public ArrayList<Candidate> getCandidatesForPosition( String pos ) {
	//*** YOUR IMPLEMENTATION HERE ***
    }


    public Candidate getBestCandidate( String pos ) { 
	//*** YOUR IMPLEMENTATION HERE ***
    }


    public int removeCandidatesForPosition( String pos ) {
	//*** YOUR IMPLEMENTATION HERE ***
    }


}//end class CandidatePool

    
