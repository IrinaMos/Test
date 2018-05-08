package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * @author Irina Moskovich
 * @version $Id$
 * @since 0.1
 */

public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(2, 6);
        System.out.println (result);
        assertThat(result, is(6));
    }
}
