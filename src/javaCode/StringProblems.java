package javaCode;

import java.util.Arrays;

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

}
