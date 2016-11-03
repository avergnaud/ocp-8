

NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
/*
Returns a view of the portion of this set whose elements range from fromElement to toElement.
The returned subset is backed by the original set. So if you insert or remove an element from the subset, the same will be reflected on the original set.
Further, since the subset is created using a range (fromElement to toElement), the element that you are inserting must fall within that range. Otherwise an IllegalArgumentException is thrown with a message "key out of range.". This is what is happening in this question. The range of subs is 326 to 328 and 329 is out of that range. Therefore, an IllegalArgumentException is thrown at runtime.
*/
