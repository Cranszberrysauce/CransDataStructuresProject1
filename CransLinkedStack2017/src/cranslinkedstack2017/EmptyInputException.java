
package cranslinkedstack2017;
/******************************************************
***  EmptyInputException
***  Nick Crans
******************************************************
*** Handles the exception if there is nothing in the textfield 
******************************************************
*** 09/03/2017: Created Exception
******************************************************/
public class EmptyInputException extends Exception {

    /**
     * Creates a new instance of <code>EmptyInputException</code> without detail
     * message.
     */
    public EmptyInputException() {
    }

    /**
     * Constructs an instance of <code>EmptyInputException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmptyInputException(String msg) {
        super(msg);
    }
}
