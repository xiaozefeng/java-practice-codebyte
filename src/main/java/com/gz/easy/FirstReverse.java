package com.gz.easy;


/**
 *  反转字符串
 * @author steven
 */
public class FirstReverse {
    public static void main(String[] args) {
        System.out.println(reverse("hello world"));
    }

    private static String reverse(String str){
        if (str != null && !"".equals(str)) {
            return new StringBuilder(str).reverse().toString();
        }
        return "";
    }
}
