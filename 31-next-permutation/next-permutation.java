class Solution {
    public void nextPermutation(int[] nums) {
        // Intuition: Find the longer prefix match and at some point, you will hit a case where a[i] < a[i+1].
// After you find such index, find an element from the array which is just greater than the elmenet at that prefix and swap them. And then reverse the array from index+1 to the end and you have your next permutation
        int index = -1;
        int n = nums.length;
        for(int i=n-2;i>=0;i--) {
            if(nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            reverse(nums, 0, n-1);
            return;
        }
        for(int i = n-1;i>index;i--) {
            if(nums[i]>nums[index]) {
                swap(nums, i, index);
                break;
            }
        }
reverse(nums, index+1, n-1);
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    private static void reverse(int[] A, int start, int end) {
        while (start < end) {
            swap(A, start, end);
            start++;
            end--;
        }
    }
}