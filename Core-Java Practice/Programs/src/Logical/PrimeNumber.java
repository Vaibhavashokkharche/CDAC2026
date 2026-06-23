package Logical;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number>> ");

		int num = scanner.nextInt();
		int count = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;

			}
			if (count == 0) {
				System.out.println(num + "Prime Number");
			} else {
				System.out.println(num + "Not Prime Number");

			}

		}

	}

}
