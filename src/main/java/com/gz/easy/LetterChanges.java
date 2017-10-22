package com.gz.easy;


/**
 * 把字母替换成下一个字符，a ->b -c
 * 如果是z 就替换成a
 * 并且如果字符串中有元音 (a, e, i, o, u) 把它们转换成大写
 *
 * @author steven
 *
 */
public class LetterChanges {
    public static void main(String[] args) {
        System.out.println(letterChanges("hello*3"));
        System.out.println(letterChanges("fun times!"));
    }

    private static String letterChanges(String str){
        String modified = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 96 && str.charAt(i) < 122) {
                modified += (char)(str.charAt(i) + 1);
            } else if (str.charAt(i) == 122) {
                modified += (char) 97;
            }else {
                modified += str.charAt(i);
            }
        }
        String last = modified.replaceAll("a", "A")
                .replaceAll("e", "E")
                .replaceAll("i", "I")
                .replaceAll("o", "O")
                .replaceAll("u", "U");
        return last;
    }
}
