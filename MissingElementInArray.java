package week1.day2assignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int count = 1;
		for(int i = 0; i<=arr.length-1;i++) {
			if(arr[i]!=count) {
				System.out.println(count);
				break;
			}
			count = count+1;
		}

	}

}
