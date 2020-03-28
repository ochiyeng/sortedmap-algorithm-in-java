# coded-sortedmap-algorithm-in-java
SortedMap is an interface in collection framework. This interface extends Map interface and provides a total ordering of its elements.eg TreeMap
The SortedMap interface extends Map and creates a display in which all elements are sorted in ascending order of their keys.
SortedMap adds a number of methods:
K firstKey(): returns the key of the first display element

K lastKey(): returns the key of the last display item

SortedMap<K, V> headMap(K end): returns a SortedMap display that contains all the elements of the original SortedMap up to the element with the key end

SortedMap<K, V> tailMap(K start): returns a SortedMap display that contains all the elements of the original SortedMap, starting with the element with the start key

SortedMap<K, V> subMap(K start, K end): returns a SortedMap display that contains all the elements of the original SortedMap, 
from the element with the start key to the element with the end key
https://docs.oracle.com/javase/8/docs/api/java/util/SortedMap.html
