package hw;

import java.util.Scanner;

//使用者輸入 n 產生 n 個 費氏數列 (例 n = 5 )
//1, 1, 2, 3, 5

public class hw01_105021033 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數n");
		int n = scn.nextInt();
		int a = 1;
		int b = 1;
		int tatal = 0;
		if (n > 2) {
			System.out.print("1,1,");
			while (n != tatal) {
				tatal = a + b;
				b = a;
				a = tatal;
				System.out.print(tatal + ",");
			}
		} else if (n == 2) {
			System.out.println("1,1");

		} else if (n == 1) {
			System.out.println(1);
		} else {
			System.out.println("請輸入正整數");

		}
	}
}
	


		
		
	