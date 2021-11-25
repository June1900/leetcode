/*
 * @Author: june
 * @Date: 2021-11-25 18:20:02
 * @Description:LeetCode连接地址：https://leetcode-cn.com/problems/move-zeroes/
 */
export const moveZeroes = (nums) => {
  let j = 0;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] !== 0) {
      nums[j] = nums[i];
      if (i != j) {
        nums[i] = 0;
      }
      j++;
    }
  }
  return nums;
};
