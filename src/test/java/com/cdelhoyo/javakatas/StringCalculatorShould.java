package com.cdelhoyo.javakatas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class StringCalculatorShould {

    private StringCalculator sut = new StringCalculator();

    @Test
    public void return_1_with_string_1() {
        int result = sut.addNumbersFrom("1");

        assertThat(result, equalTo(1));
    }

    @Test
    public void return_3_with_string_1_2() {
        int result = sut.addNumbersFrom("1,2");

        assertThat(result, equalTo(3));
    }

    @Test
    public void return_1_with_string_1_1_1() {
        int result = sut.addNumbersFrom("1,1,1");

        assertThat(result, equalTo(3));
    }

    @Test
    public void return_1_with_defined_delimiter() {
        int result = sut.addNumbersFrom("//#;1");

        assertThat(result, equalTo(1));
    }

    @Test
    public void return_3_with_defined_delimiter() {
        int result = sut.addNumbersFrom("//#;1#2");

        assertThat(result, equalTo(3));
    }

    @Test
    public void return_6_with_defined_delimiter() {
        int result = sut.addNumbersFrom("//&;1&5");

        assertThat(result, equalTo(6));
    }

    @Test
    public void return_7_with_defined_delimiter() {
        int result = sut.addNumbersFrom("//SEP;3SEP4");

        assertThat(result, equalTo(7));
    }

    @Test
    public void return_3_with_non_numbers() {
        int result = sut.addNumbersFrom("3,a");

        assertThat(result, equalTo(3));
    }
}