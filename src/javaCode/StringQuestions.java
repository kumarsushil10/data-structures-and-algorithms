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
}
