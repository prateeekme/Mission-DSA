package Codopedia.BitManipulation;

public class numberOfOneBits {
    int count = 0;

    public static void main(String[] args) {
        int num = 23;
        numberOfOneBits numberOfOneBits = new numberOfOneBits();
        int result = numberOfOneBits.hammingWeight(num);
        System.out.println(result);
    }

    private int hammingWeight(int num) {
        while (num > 0){
            if ((num & 1) == 1){
                count += 1;
            }
            num = num >> 1;
        }
    return count;
    }
}