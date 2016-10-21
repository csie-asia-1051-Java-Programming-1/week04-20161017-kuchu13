package ex;

import java.util.Scanner;

/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021033 黃苡珊
 */

public class ex01_105021033 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int total = 0;
		int a = 0;

		while (n != -1) {
			total = total + n;
			n = scn.nextInt();
			a++;
		}
		System.out.println("總合" + total + "平均" + (float) total / a);
	}
}