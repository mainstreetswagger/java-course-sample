package Iterables;

import java.util.Iterator;

public class MyIterable<E> implements Iterable<E>{
    public MyIterable() { }
    private E[] elements;
    private int size;
    @Override
    public Iterator<E> iterator() {
        return new MyIterator<E>(elements, size);
    }
}
