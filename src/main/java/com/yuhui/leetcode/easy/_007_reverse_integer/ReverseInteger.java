package com.yuhui.leetcode.easy._007_reverse_integer;

/**
 * @author yuhui
 * <p>
 * Description
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output:  321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * Note:
 * <p>
 * Assume we are dealing with an environment which could only hold integers within
 * the 32-bit signed integer range. For the purpose of this problem, assume that your
 * function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {

    public static void main(String[] args) {
        int reverse = new ReverseInteger().reverse(123);
        System.out.println(reverse);

    }

    public int reverse(int x) {
        long res = 0;
        int dived = 10;
        for (; x != 0; x = x / dived) {
            res = res * 10 + x % 10;
        }
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }

}
