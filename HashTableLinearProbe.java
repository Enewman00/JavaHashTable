/*
 * Ethan Newman
 * EEN170000
 * CS 3345.005
 * The task of this project is to implement in Java a hash table with linear probing.
 */



 public class HashTableLinearProbe<K,V>
 {
    //create an array of hash entries to represent the hashTable
    HashEntry<K,V> hashtable[];

    //TreeNode class for the linked list nodes
    private static class HashEntry<K,V>
    {
        //variables
        boolean deleted;
        K key;      //key type is generic
        V value;    //value type is generic
        
        //Constructor to create new TreeNodes
        HashEntry()
        {
            deleted = false;
            K key = null;
            V value = null;
        }
    }

    //-------------Constructors-----------------------------------------------
    public HashTableLinearProbe()
    {
        hashtable = new HashEntry<K,V>[10];
    }






    //--------------functions-------------------------------------------------
    
    /*  This function inserts entry, rehashes if the table is full, throw error
        message if the key is invalid or null and return true upon successful 
        insertion or false if duplicate entry  */
    public boolean insert(K key, V value)
    {
        //hash the value
    }

    /* This function check if the key exists in the table. If yes, true 
    value of the key, or null if not found */
    public V find (K key)
    {

    }


    /* Performs lazy deleting by marking the entry as deleted. Return 
    true if deleted , false if it not found in the hashtable */
    public boolean delete (K key)
    {

    }


    /* Returns the hash balue for the given key or return -1 if not found */
    public int getHashValue (K key)
    {

    }
    


    /*  If the table is full, then doubles the hash table size, rehash
        everything to the new table, ignore items marked deleted. */
    private void rehash()
    {

    }



    /*
        Methods calls to demonstrate functionality of methods above.
        Make sure to check with both Integer and String objects
    */
    public static void main(String args[])
    {



    }


 }
