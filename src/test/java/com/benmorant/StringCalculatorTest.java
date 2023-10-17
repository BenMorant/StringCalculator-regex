package com.benmorant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void should_return_0_when_input_is_empty() {
        String input = "";
        int expected = 0;
        int actual = StringCalculator.add(input);
        assertEquals(expected, actual);
    }


    @Test
    void should_return_same_number_when_input_is_only_one_number() {
        String input = "144";
        int expected = 144;
        int actual = StringCalculator.add(input);
        assertEquals(expected, actual);
    }

    @Test
    void should_add_when_input_is_one_number_comma_number() {
        String input = "1,3";
        int expected = 4;
        int actual = StringCalculator.add(input);
        assertEquals(expected, actual);
    }

    @Test
    void should_add_when_input_is_numbers_between_comma() {
        String input = "1,3,4";
        int expected = 8;
        int actual = StringCalculator.add(input);
        assertEquals(expected, actual);
    }

    @Test
    void should_add_when_input_is_numbers_between_line_break() {
        String input = "1\n2,3";
        int expected = 6;
        int actual = StringCalculator.add(input);
        assertEquals(expected, actual);
    }

    @Test
    void should_add_when_input_is_numbers_between_custom_delimiter() {
        String input = "//;\n1,2;3";
        int expected = 6;
        int actual = StringCalculator.add(input);
        assertEquals(expected, actual);
    }



}