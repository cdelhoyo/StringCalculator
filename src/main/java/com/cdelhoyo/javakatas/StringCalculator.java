package com.cdelhoyo.javakatas;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    // "1" -> 1
    // "1,2" -> 3
    // "1,1,1" -> 3

    public int addNumbersFrom(String expression){
        boolean hasDefineDelimiter = expression.startsWith("//");
        String delimiter = ",";
        if (hasDefineDelimiter){
            delimiter = expression.split(";")[0].substring(2);
            expression = expression.split(";")[1];
        }
        List<String> arrayList = Arrays.asList(expression.split(delimiter));
        return arrayList.stream()
                .filter(StringCalculator::isNumeric)
                .mapToInt(Integer::valueOf)
                .sum();
    }

    public static boolean isNumeric(String strNum) {
        return strNum.matches("-?\\d+(\\.\\d+)?");
    }
}
