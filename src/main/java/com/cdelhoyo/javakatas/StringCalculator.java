package com.cdelhoyo.javakatas;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    // "1" -> 1
    // "1,2" -> 3
    // "1,1,1" -> 3

    public int addNumbersFrom(String expression){
        if(expression.isEmpty())
            return 0;

        String value = expression.indexOf(",") < 0 ? expression : expression.substring(0, expression.indexOf(","));
        String nextString = expression.substring(value.length());

        if(nextString.startsWith(","))
            nextString = nextString.substring(1);

        if(!isNumeric(value))
            value = "0";

        return Integer.valueOf(value) + addNumbersFrom(nextString);
    }

    public boolean isNumeric(String strNum){
        return strNum.matches("-?\\d+(\\.\\d+)?");
    }
}
