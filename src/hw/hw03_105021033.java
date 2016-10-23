package hw;
//讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止，然後顯示正數有多少個，0 有幾個，負數總共有幾個，使用者可以重覆執行直到使用者輸入n

import java.util.Scanner;

public class hw03_105021033 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入數字:");
		int n = scn.nextInt();

		int a = 0 ;
		int b = 0 ;
		int c = 0 ;
		while (n != 999) {
			n = scn.nextInt();
			if(n>0)
				a++;
			else if(n<0)
				c++;
			else
				b++;
			}
		
		System.out.println("正數"+a+"個，負數"+c+"個，零"+b+"個");
}
	}