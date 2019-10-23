package com.yuhui.leetcode.easy._009_palindrome_number;

/**
 * @author yuhui
 * <p>
 * Description
 * Determine whether an integer is a palindrome. An integer is a palindrome when it
 * reads the same backward as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: 121
 * Output: true
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
 * Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 * <p>
 * Coud you solve it without converting the integer to a string?
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        boolean palindrome = new PalindromeNumber().isPalindrome2(10010);
        System.out.println(palindrome);
    }

    /**
     * 1
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        //1.负数肯定不是
        if (x < 0) {
            return false;
        }
        //2.数字的回文和原数字应该相等
        int source = x;
        int palindrome = 0;
        for (; source != 0; source = source / 10) {
            palindrome = palindrome * 10 + source % 10;
        }
        return x == palindrome;

    }

    /**
     * 2 不计算整个回文，只计算一半
     *
     * @param x
     * @return
     */
    public boolean isPalindrome2(int x) {
        //负数和10的倍数都不可以
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int halfPalindrome = 0;
        while (x > halfPalindrome) {
            halfPalindrome = halfPalindrome * 10 + x % 10;
            x /= 10;
        }
        return halfPalindrome == x || halfPalindrome / 10 == x;
    }


}
