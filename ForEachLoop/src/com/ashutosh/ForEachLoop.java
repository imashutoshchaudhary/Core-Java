package com.ashutosh;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int arr_one[] = {7,8,9,4};
		
		for (int k : arr_one) {
			
			System.out.println(k);
		}
		
		int arr_twoD[][] = {
						
						{7,8,9},
						{4,5,6},
						{1,2,3}
						
						};
		
		for (int k[] : arr_twoD) {
			for (int l : k) {
				System.out.print(" "+l);
			}
			System.out.println();
		}

	}

}
