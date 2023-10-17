package com.benmorant;

public class StringCalculator {

    public static int add(String input) {
        int result = 0;
//        String inputWithoutCustomerDelimiterStart = input.replaceFirst("//", "");
//        String customDelimiter = inputWithoutCustomerDelimiterStart.split("\n")[0];
//        String inputToAdd = inputWithoutCustomerDelimiterStart.split("\n")[1];
        String delimiter = "(" + ";" + "|,|\n)";
        if (input.matches("(^\\d+" + delimiter + "(\\d+" + delimiter + ")*)*\\d+$")) {
            String[] terms = input.split(delimiter);
            for (String term : terms) {
                result += Integer.parseInt(term);
            }

        }
        return result;
    }
}
