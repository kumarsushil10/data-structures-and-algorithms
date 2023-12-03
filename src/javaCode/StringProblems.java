package javaCode;

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

}
