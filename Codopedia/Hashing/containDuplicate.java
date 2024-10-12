package Codopedia.Hashing;

import java.util.HashSet;
import java.util.Set;

public class containDuplicate {


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        containDuplicate containDuplicate = new containDuplicate();
        Boolean result = containDuplicate.hasDuplicate(nums);
        System.out.println(result);
    }

    private boolean hasDuplicate(int[] nums) {

        Set<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            } else {
                hashSet.add(num);
            }
        }
        return false;
    }

}
