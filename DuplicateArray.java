package week1.day2;

import java.util.Arrays;

public class DuplicateArray {
	public static void main(String[] args) {
		int[] nums = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(nums);
		for(int i = 0; i<nums.length-1;i++) {
			if (nums[i]==nums[i+1]) {
				System.out.println(nums[i]);
			}
		}
	}
}
	