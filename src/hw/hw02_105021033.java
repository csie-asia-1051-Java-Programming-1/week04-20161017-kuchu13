package hw;

import java.util.Scanner;

//使用者輸入正整數 n 與 m 然後計算 n!/(m!*(n-m)!)

public class hw02_105021033 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		System.out.println("請輸入正整數 n、m");

		int a = 1;
		int b = 1;
		int c = 1;

		for (int i = n; i > 0; i--) {
			a *= i;
		}
		for (int i = m; i > 0; i--) {
			b *= i;
		}
		for (int i = n - m; i > 0; i--) {
			c = i;
		}
		System.out.print(a / b / c);

	}

}