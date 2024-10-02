package Codopedia;

/*
You are given an m x n integer matrix with the following properties:
1. Each row is sorted in non-decreasing order.
2. The first integer of each row is greater than the last integer of the previous row.

Given an integer 'target', write a function that returns true if the target is present in the matrix,
or false otherwise.

You must solve this problem in O(log(m * n)) time complexity using a binary search approach.
Treat the 2D matrix as a flattened 1D array for the binary search.

To convert the mid-point of the 1D array into 2D indices, use:
  - row = mid / n  (where 'n' is the number of columns)
  - col = mid % n

Continue the binary search based on the comparison of the middle element with the target.
*/


public class search_2D_matrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        //Flat the 2-D Matrix into a 1-D Matrix
        int left = 0;
        int right = m * n - 1;

        while(left <= right){

            int mid = (left + right) / 2;
            int row = mid / n;
            int col = mid % n;

            if(matrix[row][col] == target){
                return true;
            }else{
                if(matrix[row][col] < target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}

