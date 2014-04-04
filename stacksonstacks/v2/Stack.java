
public interface Stack {

    //Returns true if this stack is empty, otherwise returns false.
    public boolean isEmpty();

    //Returns the top element of the stack without popping it.
    public Object peekTop();

    //Pops and returns the top element of the stack.
    public Object pop();

    //Push an element onto the top of this stack.
    public void	push( Object x );

}//end interface
