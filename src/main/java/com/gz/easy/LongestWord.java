package com.gz.easy;

/**
 * 找出一句话中一个词长度最长的词
 * @author  steven
 */
public class LongestWord {
    private String longestWord(String sen){
        int smallest = 0;
        String[] parts = sen.replaceAll("[^a-zA-Z ]", "").split(" ");
        String ben = "a";
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].length() > smallest) {
                smallest = parts[i].length();
                ben = parts[i];
            }
        }
        return ben;
    }

    public static void main(String[] args) {
        LongestWord l= new LongestWord();
        String result = l.longestWord("Argument goes here");
        System.out.println(result);

    }
}
