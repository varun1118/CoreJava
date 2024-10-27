## Iterator

Iterator is a design pattern via which you can traverse elements in collections such as lists, maps or sets


it.hasnext() --- returns boolean value
it.next()-- will give you next value
it.remove()-- will remove lememt from the collection


USed in modern Java development


## Enumerator

Enumerator is an interface which is used to traverse elements in a collection framework

## ArrayList

We use iterator to traverse arraylist. However if we need to use enums,
we can use that as well.

Enumerator<Integer> enum = Collections.enumeration(name of the arraylist)

## Thread Safe Environment

List al = Collections.synchronizedList(new ArrayList<>())