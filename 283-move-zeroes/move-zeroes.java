class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        // Move non-zero elements to front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill remaining with zeros
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
}