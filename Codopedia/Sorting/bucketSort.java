package Codopedia.Sorting;

import java.util.Arrays;

public class bucketSort {

    public static void main(String[] args) {
        // Test cases for bucketSortHelper
        int[] arr1 = {2, 1, 2, 0, 0, 2};
        int[] arr2 = {1, 1, 1, 0, 2, 2, 0};
        int[] arr4 = {0, 1, 2};

        // Print original arrays
        System.out.println("Original: " + Arrays.toString(arr1));
        System.out.println("Sorted:   " + Arrays.toString(bucketSort.bucketSortHelper(arr1)));

        System.out.println("\nOriginal: " + Arrays.toString(arr2));
        System.out.println("Sorted:   " + Arrays.toString(bucketSort.bucketSortHelper(arr2)));

        System.out.println("\nOriginal: " + Arrays.toString(arr4));
        System.out.println("Sorted:   " + Arrays.toString(bucketSort.bucketSortHelper(arr4)));
    }

    public static int[] bucketSortHelper(int[] arr){

        //2-1-2-0-0-2
        //Suppose number of distinct element present in the array is 3
        int[] count = new int[]{0, 0, 0};

        //2-1-3
        for(int num:arr){
            count[num] +=1;
        }
        System.out.println("\nCount Original: " + Arrays.toString(count));

        int n=0;
        for(int i=0; i< count.length; i++){
            for (int j=0; j<count[i]; j++){
               arr[n] = i;
               n+=1;
            }
        }
        return arr;
    }

}
