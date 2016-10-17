package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021033 黃苡珊
 */

public class ex03_105021033 {


		public static void main(String[] args){
	    	Scanner scn = new Scanner(System.in);
	    	System.out.println("請輸入一整數");
	    	int n = scn.nextInt();
	        for (int a = 0;a<n;a++) { 
	            for(int b = 0;b<=a;b++) { 
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	   
	}