package Codopedia.BitManipulation;

import java.util.Arrays;

public class reverseBit {

    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++){
            result = (result << 1) | (n & 1);
            n = n >> 1;
        }
        return result;
    }

    public static void main(String[] args) {

        int n = 00000000000000000000000000010101;
        reverseBit reverseBit = new reverseBit();
        int res = reverseBit.reverseBits(n);
        System.out.println(res);
    }
}
