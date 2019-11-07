/*
 * Ethan Newman
 * EEN170000
 * CS 3345.005
 * The task of this project is to implement in Java a singly linked list of a specific generic type.
 */



 public class IDedLinkedList<AnyType extends IDedObject>
 {

    Node head;

    //Node class for the linked list nodes
    public class Node
    {
        AnyType data;
        Node next;
        
        
        //Constructor to create new Nodes
        Node(AnyType d)
        {
            data = d;
            next = null;
        }
    }

    //-------------Constructors-----------------------------------------------
    public IDedLinkedList()
    {
        head = null;
    }






    //--------------functions-------------------------------------------------
    //empties the linked list by setting the head to null
    public void makeEmpty()
    {
        head = null;
    }
    
    
    /*Get the generic type to get the particular id and
    * returns AnyType. Don’t remove the object from the list.
    * returns null if the list is empty or ID not found. 
    */
    public AnyType findID(int ID)
    {
        Node curr = head;

        //loop through nodes and look for ID
        while (curr != null)
        {
            if (curr.data.getID() == ID)
            {
                return curr.data;
            }
            //move to next node
            curr = curr.next;
        }

        return null;
    }


    //insert at front of list or return false if that ID already exists
    public boolean insertAtFront(AnyType x)
    {
        //if id already exists, return false
        if (findID(x.getID()) != null)
        {
            return false;
        }

        Node newFront = new Node(x);    //create new node to be at front

        newFront.next = head;           //set the next to be the head
        head = newFront;                //change the head to be newFront
        return true;
    }


    //delete and return the record at the front of the list or return null if the list is empty
    public AnyType deleteFromFront()
    {
        Node temp = head;       //create temporary Node
        head = temp.next;       //change head to be the next item
        return temp.data;       //return the AnyType in the data of the node
    }


    //find and delete the record with teh given ID or returns null if it isn't found
    public AnyType delete(int ID)
    {
        Node prev = null;
        Node curr = head;

        //loop through nodes and look for ID
        while (curr != null)
        {
            //if found, change pointers
            if (curr.data.getID() == ID)
            {
                if (prev != null)
                {
                    prev.next = curr.next;
                }
                else
                {
                    head = curr.next;
                }
                return curr.data;
            }
            //move to next node
            else
            {
                prev = curr;
            }
            curr = curr.next;
            
        }
        return null;    //return null if not found
    }


    //return the sum of ids of all elements currently in the list. If the list is empty, return -1
    public int printTotal()
    {
        //if list is empty, return -1
        if (head == null)
        {
            return -1;
        }
        
        int sum = 0;
        Node curr = head;

        //loop through list, add items to sum
        while (curr != null)
        {
            sum += curr.data.getID();   //add the id to the sum
            curr = curr.next;           //add the id to the sum
        }

        return sum;
    }
 }
