package Codopedia.BitManipulation;

/*
Given an integer n, count the number of 1's in the binary representation of every number in the range [0, n].
Return an array output where output[i] is the number of 1's in the binary representation of i.

Example 1:
Input: n = 4

Output: [0,1,1,2,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100

Constraints:
0 <= n <= 1000
 */

import java.util.Arrays;
import java.util.List;

public class countingBits {

    public int[] countBits(int n) {
        int result[] = new int[n+1];
        int offset = 1;

        for( int i = 1; i < n+1; ++i){
            if( offset * 2 == i){
                offset *= 2;
            }
            result[i] = result[i - offset] + 1;
        }
        return result;
    }

    public static void main(String[] args) {

        int n = 4;
        countingBits countingBits = new countingBits();
        int[] res = countingBits.countBits(n);
        System.out.println(Arrays.toString(res));
    }
}
