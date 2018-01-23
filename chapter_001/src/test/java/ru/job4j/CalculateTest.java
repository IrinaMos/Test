package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
* Test.
*
* @author Irina
* @version $Id$
* @since 0.1
*/
public class CalculateTest {
	@Test
	public void whenSetStopInEchoThenReturnThreeStops() {
    Calculate calc = new Calculate();
    String result = calc.echo("stop");
    assertThat(result, is("stop, stop, stop"));
}
 
}
 