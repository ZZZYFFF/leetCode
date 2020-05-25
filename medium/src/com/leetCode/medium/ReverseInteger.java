package com.leetCode.medium;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31, 2^31 − 1]。请根据这个假设，如果反转后整数溢出
 * 那么就返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseInteger {

    public static int reverse(int x){
        long result = 0;
        while (x>0){
            result *= 10;
            result += x % 10;
            x /= 10;
        }
        if (result>Integer.MAX_VALUE || result<Integer.MIN_VALUE) return 0;
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println("x ; "+reverse(1234567899));
    }
}
