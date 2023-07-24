package week1.day2assignments;

public class Intersection {
public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,11,7};
		
		for(int i =0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr2.length-1;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
}
}
