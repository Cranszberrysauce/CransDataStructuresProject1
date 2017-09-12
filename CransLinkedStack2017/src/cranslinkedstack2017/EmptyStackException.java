
package cranslinkedstack2017;
/******************************************************
***  EmptyStackException
***  Nick Crans
******************************************************
*** Handles the exception if there is nothing in the stack 
******************************************************
*** 09/03/2017: Created Exception
******************************************************/
public class EmptyStackException extends Exception {

    /**
     * Creates a new instance of <code>EmptyStackException</code> without detail
     * message.
     */
    public EmptyStackException() {
    }

    /**
     * Constructs an instance of <code>EmptyStackException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmptyStackException(String msg) {
        super(msg);
    }
}
