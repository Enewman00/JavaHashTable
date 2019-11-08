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
    int tableSize;
    int numElements;

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
            key = null;
            value = null;
        }

        HashEntry(K k, V v)
        {
            deleted = false;
            key = k;
            value = v;
        }
    }

    //-------------Constructors-----------------------------------------------
    public HashTableLinearProbe()
    {
        numElements = 0;
        tableSize   = 10;
        hashtable   = new HashEntry[tableSize];
    }

    public HashTableLinearProbe(int ts)
    {
        numElements = 0;
        tableSize   = ts;
        hashtable   = new HashEntry[tableSize];
    }






    //--------------functions-------------------------------------------------
    
    /*  TODO This function inserts entry, rehashes if the table is full, throw error
        message if the key is invalid or null and return true upon successful 
        insertion or false if duplicate entry  */
    public boolean insert(K key, V value)
    {
        //hash the key
        int hashVal;

        //hash for int
        hashVal = getHashValue(key);
        hashVal = linearProbe(hashVal); //get the next available spot

        //insert in table
        hashtable[hashVal] = new HashEntry<K, V>(key, value);

        numElements++;  //increase number of elements in table by 1

        //rehash if full table
        if (numElements == tableSize)
        {
            rehash();
        }

        //getHashValue returns -1 if duplicate
        // if (hashVal == -1)
        // {
        //     return false;
        // }

        return true;
    }

    /* This function check if the key exists in the table. If yes, true 
    value of the key, or null if not found */
    public V find (K key)
    {
        //get index value from hash function
        int hash = getHashValue(key);

        //loop while still in bounds of table
        while (hash < tableSize)
        {
            //if found, return the value
            if (hashtable[hash].key == key)
            {
                return hashtable[hash].value;
            }
            hash++;
        }
        
        //not found
        return null;
    }

    /*
     * Looks for an open spot in the hash table, else return -1
     */
    private int linearProbe(int hash)
    {
        for (int i = hash; i < tableSize; i++)
        {
            // if empty spot found, return the hash index
            if (hashtable[hash] == null)
            {
                return hash;
            }
            hash++;
            
            //if it got to the end of the table, skip back to the beggining
            if (hash == tableSize)
            {
                hash = 0;
            }
        }
        return -1;
    }

    /* Performs lazy deleting by marking the entry as deleted. Return 
    true if deleted , false if it not found in the hashtable */
    public boolean delete (K key)
    {

    }


    /* Returns the hash balue for the given key or return -1 if not found */
    public int getHashValue (K key)
    {
        if (K instanceof Integer)
        {
            insertAt = key.intValue() % tableSize;
        }
        //hash for string
        else
        {
            //loop through characters, add up ascii values
            int total = 0;
            for (int i = 0; i < value.length; i++)
            {

            }
        }


        //if entry already exists
        //return -1;

        //if spot is full
        //linear probing

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
