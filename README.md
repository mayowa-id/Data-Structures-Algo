This is an implementation of Hash Tables in Java, it has a
HashTable class that contains methods that can be called 
in the demo "Main" class.

The put() method adds items to the hash table in the format of a Key(int)-Value(String)pair

The get() method takes in an int parameter (The key) and it returns the latest corrresponding 
string value.


The idea of this implementation is using an array of Linked Lists, for this case
when creating ghe array, you have to indicate/Hard-quote the array size, one can
write as-such that the array will resize but that's not the focus here.

When a new key-value pair is ato be added, the code checks the corresponding position
in the array to see if there's a linked list there, if there's none, a new list is created in
that array index and the value is added.

Just like the generic Hash tables, multiple values here can share a key, implementing that 
is linking the values to the linked list in that key (index in the array).
