package ru.job4j;
/**
 * Calculate.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Calculate {
    /**
     * Main.
     * @param args - args.
     */
	public static void main(String[] args) {
		Calculate calc = new Calculate();
		System.out.println(calc.echo("one"));
	}
	 /**
     * Method echo.
     * @param name Your name.
     * @return Echo plus your name.
     */
		public String echo(String value) {
    return String.format("%s, %s, %s", value, value, value);
	}
	
}