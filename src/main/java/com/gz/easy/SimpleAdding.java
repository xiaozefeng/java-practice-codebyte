package com.gz.easy;

/**
 * 求 1+2+3+4 ... +num 的值
 * @author steven
 */
public class SimpleAdding {
    public static void main(String[] args) {
        System.out.println(simpleAdd(4));
    }

    private static int simpleAdd(int num){
        if (num == 1) {
            return num;
        }
        return num + simpleAdd(num - 1);
    }
}
