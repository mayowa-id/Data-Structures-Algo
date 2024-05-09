A Hash Table can be defined as an unordered collection of key-value pairs, with a unique key for each value. 

This is an implementation of Hash Tables in Java. The idea of this implementation is using an array of Linked Lists, for this case
when creating ghe array, you have to indicate/Hard-quote the array size, one can
write as-such that the array will resize but that's not the focus here.

This code base has a HashTable class that contains methods that can be called 
in the demo "Main" class.

The put() method adds items to the hash table in the format of a Key(int)-Value(String)pair

The get() method takes in an int parameter (The key) and it returns the latest corrresponding 
string value.

When a new key-value pair is ato be added, the code checks the corresponding position
in the array to see if there's a linked list there, if there's none, a new list is created in
that array index and the value is added.

Just like the generic Hash tables, multiple values here can share a key, implementing that 
is linking the values to the linked list in that key (index in the array).

Real Life Applications of Hash Tables: 
1. Username-password databases
2. Integrity checks
3. Blockchain verification etc.
4. Above all else, the most important thing to consider when using hash tables is the hashing (computation) and collision resolution.
