import java.util.Scanner;

public class NumberSum {
	public static void main(String[] args) {
		
		int[] n = new int[6];
		System.out.println("Enter five different numbers: ");
		for(int i = 1; i <= 5; i++) {
			Scanner sc = new Scanner(System.in);
			n[i] = sc.nextInt();
		}
		
		int result = sum(n,6);
		System.out.println("Result: " +result);
	}
	
	public static int sum(int [] n, int r) {
		if (r > 0) {
			return (n[r - 1] + sum(n,r - 1));
		}
		else {
			return 0;
		}
	}
}