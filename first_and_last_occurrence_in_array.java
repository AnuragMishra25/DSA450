/*package whatever //do not write package name here */
/*https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = firstOccurrence(nums, target);
        result[1] = lastOccurrence(nums, target);
        return result;
    }
    
    public static int firstOccurrence(int[] nums, int target){
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target && (mid == 0 || nums[mid-1] < target )){
                return mid;
            }else if(nums[mid] < target){
                start = mid +1;
            }else{
                end = mid -1 ;
            }
        }
        return -1;
    }
    
    public static int lastOccurrence(int[] nums, int target){
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target && (mid+1 == nums.length || nums[mid+1] > target)){
                return mid;
            }else if(target < nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
