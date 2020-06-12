class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        /**
         * 题目：删除排序数组中的重复项
         */
        //第一种解法：双指针解法
        if (nums.length == 0) return 0;
        int i=0;
        for (int j = 1;j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
     return i+1;
    }
}
