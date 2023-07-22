package javaCode;

import java.lang.reflect.Array;
import java.util.Arrays;


public class StringQuestions {

    public int stringLength(String lines) {
        int count = 0;
        for (int i = 0; i < lines.length(); i++) {
            if (lines.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public int vowels(String lines) {
        int count = 0;
        for (int i = 0; i < lines.length(); i++) {
            if (lines.charAt(i) == 'a' || lines.charAt(i) == 'A' || lines.charAt(i) == 'e' || lines.charAt(i) == 'E' || lines.charAt(i) == 'i' || lines.charAt(i) == 'I' || lines.charAt(i) == 'o' || lines.charAt(i) == 'O' || lines.charAt(i) == 'u' || lines.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }

    //Two Strings are called the anagram if they contain the same characters.
    // However, the order or sequence of the characters can be different.
    public boolean anagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            String s1 = str1.toLowerCase();
            char[] charStr1 = s1.toCharArray();
            Arrays.sort(charStr1);

            String s2 = str2.toLowerCase();
            char[] charStr2 = s2.toCharArray();
            Arrays.sort(charStr2);

            for (int i = 0; i < str1.length(); i++) {
                if (charStr1[i] != charStr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    //    our task is to divide the string S into n equal parts.
    //    We will print an error message if the string cannot be
    //    divisible into n equal parts otherwise all the parts need
    //    to be printed as the output of the program.
    public void nEqualParts(String str, int parts) {
        int size = str.length();
        int slice = size / parts;
        if (size % parts != 0) {
            System.out.println(str + "\nis not possible to divide into " + parts + " equal parts");
        } else {
            for (int i = 0; i < size; i = i + slice) {
                String subString = str.substring(i, i + slice);
                System.out.println(subString);
            }
        }
    }

    public void subStringOfString(String str) {
        int len = str.length();
        int temp = 0;
        int arrSize = (len * (len + 1)) / 2;
        String[] arr = new String[arrSize];
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                arr[temp] = str.substring(i, j + 1);
                temp++;
            }
        }
        for (int i = 0; i < arrSize; i++) {
            System.out.println(arr[i]);
        }

    }

    public void longestRepeatedString() {

    }


}
