package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1, 1);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected)); }
     @Test
     public void whenSubstracFirstValueMinusSecondValue () {
         Calculator calc1 = new Calculator();
         calc1.subtract(1, 1);
         double result01 = calc1.getResult();
         double expected01 = 0;
         assertThat(result01, is(expected01)); }
      @Test
      public void whenDivFirstValueANDSecondValue() {
          Calculator calc2 = new Calculator();
          calc2.div(1, 1);
          double result = calc2.getResult();
          double expected = 1;
          assertThat(result, is(expected)); }
       @Test
       public void whenMultiFirstValueANDSecondValue() {
           Calculator calc3 = new Calculator();
           calc3.multiple(1, 1);
           double result = calc3.getResult();
           double expected = 1;
           assertThat(result, is(expected)); }
}
