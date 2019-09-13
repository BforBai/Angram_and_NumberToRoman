package com.demo.project;

public class NumberToRomanNumber {

    public String numberToRoman(int num) {

        if(num < 0){
            return "Invalid Input!";
        }

        if(num == 0){
            return "nulla";
        }

        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000]+C[(num%1000)/100]+X[(num%100)/10]+I[(num%10)];
    }

}
