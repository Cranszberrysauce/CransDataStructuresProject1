package cranslinkedstack2017;
/******************************************************
***  Node
***  Nick Crans
******************************************************
*** This is the class that sets the value in a node
*** in the list, and assigned a pointer to the next 
***   node in the list.
******************************************************
*** 08/30/2017: Class created.
*** 08/30/2017: Created variables to store values, and
*** reference to the next node.
*** 08/30/2017: Set and get methods written
******************************************************/
public class Node 
{
    private int value;
    private Node nextLink; // Pointer to the next node of the list. Defaults to null 
                           // when only one node is in the list.
    /******************************************************
    ‘***  Node
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Constructor
    ‘*** This is the default constructor. Sets the value to
    ‘*** 0 and the pointer to the next node to null. Meaning
    ‘*** The default node is the head and tail of the list.
    ‘******************************************************
    ‘*** 08/30/2017
    ‘******************************************************/
    public Node()
    {
        value = 0;
        nextLink = null;
    }
    
    /******************************************************
    ‘***  Node
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Constructor
    ‘*** When a new node object is created, it takes the value
    ‘*** to be stored and the reference to the next node.
    ‘******************************************************
    ‘*** 08/30/2017
    ‘******************************************************/
    public Node(int newValue, Node newLink)
    {
        value = newValue;
        nextLink = newLink;
    }
    
    /******************************************************
    ‘***  getLink
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Returns the address of the next node in the link.
    ‘******************************************************
    ‘*** 08/30/2017
    ‘******************************************************/
    public Node getLink()
    {
        return nextLink;
    }
    
    /******************************************************
    ‘***  getValue
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Returns the value in the Node object
    ‘******************************************************
    ‘*** 08/30/2017
    ‘******************************************************/
    public int getValue()
    {
        return value;
    }
    
    /******************************************************
    ‘***  setLink
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Assigns a reference of the object passed to the 
    ‘*** pointer in the node class.
    ‘******************************************************
    ‘*** 08/30/2017
    ‘******************************************************/
    public void setLink(Node newLink)
    {
        nextLink = newLink;
    }
    
    /******************************************************
    ‘***  setValue
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Sets the value in the node.
    ‘******************************************************
    ‘*** 08/30/2017
    ‘******************************************************/
    public void setValue(int newValue)
    {
        value = newValue;
    }
}
