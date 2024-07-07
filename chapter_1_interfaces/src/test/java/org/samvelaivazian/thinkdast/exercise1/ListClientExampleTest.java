package org.samvelaivazian.thinkdast.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Test class for {@link ListClientExample}.
 */
public class ListClientExampleTest {

    /**
     * Tests the {@link ListClientExample#getList()} method to ensure it returns an instance of {@link ArrayList}.
     */
    @Test
    public void testListClientExample() {
        final ListClientExample<Integer> listClientExample = new ListClientExample<>();
        final List<Integer> list = listClientExample.getList();

        Assertions.assertInstanceOf(ArrayList.class, list);
    }

}
