package ex;

import java.util.Scanner;

/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021033 黃苡珊
 */

public class ex02_105021033 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		char c = 'Y';
		while (c == 'Y' || c == 'y') {

			System.out.println("請輸入兩整數");
			int a = scn.nextInt();
			int b = scn.nextInt();
			for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= b; j++) {
					System.out.println(a * b);
				}
				System.out.println();
			}
			c = scn.next().charAt(0);
			if (c == 'N' || c == 'n') {
				System.out.println("結束");
			}
		}
	}
}