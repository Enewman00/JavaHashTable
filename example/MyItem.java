/*
 * Ethan Newman
 * EEN170000
 * CS 3345.005
 * The task of this project is to implement in Java a singly linked list of a specific generic type.
 */

 import java.util.*;

 public class MyItem implements IDedObject
 {
    //-----------class variables----------------------------------------------
    private int itemID;
    private int itemPrice;
    private List<Integer> itemDescription;




    //-------------Constructors-----------------------------------------------
    public MyItem()     //default
    {
        itemID = 0;
        itemPrice = 0;
        itemDescription = null;
    }

    public MyItem(int id, int price, List<Integer> name)     //default
    {
        itemID = id;
        itemPrice = price;
        //Collections.copy(itemDescription, name);
        itemDescription = new LinkedList<Integer>(name);
    }




    //--------------functions-------------------------------------------------

    //returns the itemID
    public int getID()
    {
        return itemID;
    }

    //prints the details of the item
    //print id, price, all items of desc list
    public String printID()
    {
        String output = "";
        output = itemID + " " + itemPrice;
        //loop through description and add items to output
        for (int temp : itemDescription)
        {
            output = output + " " + temp;
        }

        System.out.println(output);
        return output;
    }



 }