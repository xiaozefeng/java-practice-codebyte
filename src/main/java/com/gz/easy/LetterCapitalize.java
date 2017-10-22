package com.gz.easy;

/**
 * 用空格将字符串分割成多个单词，并将每个单词的首字母大写
 * @author steven
 */
public class LetterCapitalize {
    public static void main(String[] args) {
        System.out.println(letterCapitalize("hello world"));
    }

    private static String letterCapitalize(String str){
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String  s :arr) {
            sb.append(s.substring(0, 1).toUpperCase() + s.substring(1))
                    .append(" ");
        }
        return sb.toString();
    }
}
