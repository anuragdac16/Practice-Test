package com.app.neetcode;

public class BinarySearch {

    public static void main(String[] args) {
        int [] nums = {-1,0,2,4,6,8};
        int target = 4;
        System.out.println(search(nums, target));
        //Output: 3

    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }else if(nums[mid] > target){
                right = mid-1;
            }


        }
        return  -1;
    }
}
