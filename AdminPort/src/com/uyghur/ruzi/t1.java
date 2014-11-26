package com.uyghur.ruzi;
 
public class t1 {
	public static void main(String[] args) {

		int[] a = { 56, 20, 30, 40, 50, 180, 60, 70, 80, 90, 100, 110 };

		int left = 0;
		int right = 0;
		
		/*
		 * ئەڭ چوڭى
		 */
		
		int[] big = null;
		for (int i = 0; i < a.length; i++) {
			if (left < a[i]) {
				left = a[i];
				right = a[i];
			}
			
			
		}
		
		System.out.println(right);
		
		

		/*
		 * ئەڭ كىچىكى
		 */
		
		for (int i = 0; i < a.length; i++) {
				
			if(right>a[i]){
				right=a[i];
				left=a[i];
			
			}
			
		}
		System.out.println(left);

		
		/*
		 * چوڭدىن كىچىككە تىزىش
		 */
		
		
		for (int i = 0; i < a.length; i++) {
			
			
			
			
		}
		
		
		
	}
}
