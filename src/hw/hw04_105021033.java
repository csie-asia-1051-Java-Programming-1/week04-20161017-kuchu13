package hw;

import java.util.Scanner;

public class hw04_105021033 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入1~4其中一數");
		int a = scn.nextInt();

		if (a == 1) {
			System.out.println("請輸入n");
			int n = scn.nextInt();
			for (int i = 1; i <= (n + 1) / 2; i++) {
				for (int j = (n + 1) / 2; j >= i; j--) {
					System.out.print("@");
				}
				System.out.println();
			}
			for (int i = 2; i <= (n + 1) / 2; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("@");
				}
				System.out.println();
			}
		} else if (a == 2) {
			System.out.println("請輸入n");
			int v = scn.nextInt();
			for (int i = 1; i <= (v + 1) / 2; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("@");
				}
				System.out.println();
			}
			for (int i = 2; i <= (v + 1) / 2; i++) {
				for (int j = (v + 1) / 2; j >= i; j--) {
					System.out.print("@");
				}
				System.out.println();
			}
		} else if (a == 3) {

			System.out.println("請輸入n(必須是奇數)");
			int n = scn.nextInt();
			for (int i = 1; i <= (n + 1) / 2; i++) {
				for (int j = (n + 1) / 2; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i * 2 - 1; j++) {
					System.out.print("@");
				}
				for (int j = (n + 1) / 2; j > i; j--) {
					System.out.print(" ");
				}
				System.out.println();

			}
			for (int i = 1; i <= (n + 1) / 2 - 1; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n - 2 * i; j++) {
					System.out.print("@");
				}
				for (int j = 1; j >= (n + 1) / 2; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		} else if (a == 4) {
			System.out.print("結束");

		} else {
			System.out.print("請輸入1~4之間的值");

		}

	}

}