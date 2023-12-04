package javaCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringProblems {
    public int noOfCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public int countPunctuation(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '!' || str.charAt(i) == '.' || str.charAt(i) == '-' || str.charAt(i) == '?' || str.charAt(i) == ';' || str.charAt(i) == '"' || str.charAt(i) == ',' || str.charAt(i) == '\'') {
                count++;
            }
        }
        return count;
    }

    public void countVowelConsonant(String str) {
        int countVowel = 0;
        int countConsonant = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                countVowel++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'z') {
                countConsonant++;
            }
        }
        System.out.println("Total vowel = " + countVowel);
        System.out.println("Total consonant = " + countConsonant);
    }

    public boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        for (int i = 0; i < char1.length; i++) {
            if (char1[i] != char2[i]) {
                return false;
            }
        }
        return true;
    }

    public void divideStringInto(int parts, String str) {
        int part = str.length() / parts;
        if (str.length() % parts != 0) {
            System.out.println("Dividing " + str + " into " + parts + " is not possible");
        } else {
            for (int i = 0; i < str.length(); i += part) {
                System.out.println(str.substring(i, i + part));
            }
        }
    }

    public void subsetOfString(String str) {
        List<String> subset = new ArrayList<>();
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                subset.add(str.substring(i, j));
            }
        }
        System.out.println(subset);
    }

}
