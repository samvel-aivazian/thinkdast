package org.samvelaivazian.thinkdast.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * A generic class that provides an example of a client that uses a list.
 *
 * @param <T> the type of elements in this list
 */
public final class ListClientExample<T> {

    /**
     * The list to hold elements of type T.
     */
    private final List<T> list;

    /**
     * Constructs a new ListClientExample with an empty ArrayList.
     */
    public ListClientExample() {
        list = new ArrayList<>();
    }

    /**
     * Returns the list contained in this ListClientExample.
     *
     * @return the list of elements of type T
     */
    public List<T> getList() {
        return list;
    }

}
