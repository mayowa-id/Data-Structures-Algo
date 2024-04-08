package HashTables;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashTable {
private class Entry {
    public Entry(int key, String value) {
        this.key = key;
        this.value = value;
    }

    private int key;
    private String value;
}


private LinkedList<Entry>[] entries = new LinkedList[5];

//put() method implementation
        //Checks if the key's corresponding  index in the array is empty and free  to fit
    //a Linked list into, if the corressponding  index
    //of the key inputed is occupied, the value is ovewritten with the newly inputed  value.
public void put(int key, String value) {
    var index = hash(key);
    if (entries[index] == null) {
        entries[index] = new LinkedList<>();
    } else {
        var bucket = entries[index];
        for(var entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }

        }
       bucket.addLast( new Entry(key, value));
    }
}
public String get(int key){
    var index = hash(key);
    var bucket = entries[index];
    if(bucket != null) {
        for (var entry : bucket)
            if (entry.key == key)
                return entry.value;
    }
    return null;
}
//hash method here returns a value that's a remainder of
    //the length of the array, so the array behaves as a circular array when adding
    //new LinkedLists
private int hash(int key){
    return key % entries.length;
}


}
