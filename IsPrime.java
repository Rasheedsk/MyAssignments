package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		
		int num =20;
		int count = 0;
		for(int i = 2; i<=num ;i++) {
			if(num%i==0) {
				count++;
			}		
		}
		if(count==2) {
			System.out.println("Given number is prime");
		}else {
			System.out.println("Given number is not a prime");
		}
		
	}

}
