package cranslinkedstack2017;
/******************************************************
***  LinkedIntStack
***  Nick Crans
******************************************************
*** This is the class that represents the stack that
*** has integers pushed and popped 
******************************************************
*** 08/30/2017: Class created
*** 08/30/2017: Wrote structure to assign references 
*** to objects and assign pointers in pushStack.
*** 09/02/2017: Edited structure to correctly assign 
*** references to next node in linked list.
*** 09/02/2017: Created pop method and wrote structure
*** to remove node in stack.
*** 09/03/2017: Corrected structure to pop values off
*** 09/03/2017: Wrote method to test if stack is empty
*** toString method.
******************************************************/
public class LinkedIntStack 
{
    private int size;
    private Node link;
    
    /******************************************************
    ‘***  LinkedIntStack
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Constructor
    ‘*** Default constructor that creates an empty stack
    ‘******************************************************
    ‘*** 08/30/2017
    ‘******************************************************/
    public LinkedIntStack()
    {
        link = null;
        size = 0;
    }
    
    /******************************************************
    ‘***  empty
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** This method is used to test if the stack is empty.
    ‘*** Size is tested to check if it is zero, signifying 
    ‘*** the stack is empty. Either true or false is returned.
    ‘******************************************************
    ‘*** 09/03/2017
    ‘******************************************************/
    public boolean empty()
    {
        boolean isEmpty;
        if(size == 0)
            isEmpty = true;
        else
            isEmpty = false;
        
        return isEmpty;
    }
    
    /******************************************************
    ‘***  popStack
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** If the stack is empty, the first node in the linked
    ‘*** list in null, then an EmptyStackException is thrown.
    ‘*** If the stack is not empty then a reference to the
    ‘*** top of the stack, the topLink variable, is assigned
    ‘*** to a temporary Node variable. Then the reference to
    ‘*** the object that was at the top of the stack is 
    ‘*** overwritten with the reference to the next linked
    ‘*** object. This removes the top linked node, and the
    ‘*** value within the object is returned. Finally the
    ‘*** size variable is decremented to represent the size
    ‘*** of the list decreasing by one.
    ‘******************************************************
    ‘*** 09/02/2017
    ‘******************************************************/
    public int popStack() throws EmptyStackException
    {
        if(empty())
        {
            EmptyStackException emptyStack = new EmptyStackException("Cannot "
                    + "pop: Stack is empty.");
            throw emptyStack;
        }
        else
        {
            Node firstLink = link; // The first node of the list is referenced
                                   // by a temporary variable
            link = link.getLink(); // The previous reference to the object at the 
                                   // top of the stack is overwritten with the
                                   // pointer to the next node in the list. Thus 
                                   // removing the top value in the stack.
            size--;
            
            return firstLink.getValue();
        }
    }
    
    /******************************************************
    ‘***  pushStack
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Takes an integer as a parameter. If the first value
    ‘*** of the link is null, meaning the stack is empty,then 
    ‘*** the newly created node is pushed onto the stack. If 
    ‘*** there is a value on the stack  then the previously 
    ‘*** created object is pushed down,and the newly created 
    ‘*** object is pushed onto the stack with a pointer to the 
    ‘*** previously created object. Finally a size 
    ‘*** variable is incremented to indicate that the stack 
    ‘*** has values is not empty.
    ‘*******************************************************
    ‘*** 08/30/2017
    ‘******************************************************/
    public int pushStack(int number)
    {
        /* Create node object. Sets the pointer to the next node to null,
           however if the stack is not emprty then the null is overwritten by
           sending the previous node to the setLink method in the Node class.
        */
        Node newLink = new Node(number, null);
        
        if(link == null)
            link = newLink; // Assigns a reference to first node. Since no value 
                               // is passed to the link set method the pointer 
                               // points to a null value.
        else
        {
            newLink.setLink(link); // Creats a pointer to the node created
                                      // before the newly created node.
            link = newLink; // The newly created node object is assigned to the link
                            // variable, which contains the pointer to
                            // what link originally referenced.
        }    
        
        size++;
        
        return link.getValue();
    }
    
    /******************************************************
    ‘***  toString
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Assigns the values within all the stack to a string
    ‘*** so they can be displayed in a gui. The temporary 
    ‘*** Node variable is assigned a reference to the the
    ‘*** top of the stack: the first node in the linked list.
    ‘*** Then, in the while loop, the reference to the current 
    ‘*** node is overwritten with the reference to the next
    ‘*** link in the list. This continues until the pointer
    ‘*** in the currently referenced node points to an empty
    ‘*** place in memory, or the value of temp is null.
    ‘******************************************************
    ‘*** 09/03/2017
    ‘******************************************************/
    public String toString()
    {
        Node temp = link;
        String values = "["; 
        
        while(temp != null)
        {
            if(temp.getLink() == null)
            {
                values += temp.getValue() + "]";
                temp = temp.getLink();
            }
            else
            {
                values += temp.getValue() + ", ";
                temp = temp.getLink();
            } 
        }
        
        return values;
    }   
}