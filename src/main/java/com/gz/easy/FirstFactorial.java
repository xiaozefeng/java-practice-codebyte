package com.gz.easy;

/**
 * 计算阶乘
 *
 * @author steven
 */
public class FirstFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
