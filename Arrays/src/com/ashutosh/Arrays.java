package com.ashutosh;

public class Arrays {

	public static void main(String[] args) {
		
		int arr[] = new int[4];			// 1D array
		
		arr[0] = 7;
		arr[1] = 8;
		arr[2] = 9;
		arr[3] = 4;
		
		for (int i=0;i<4;i++) {
			//System.out.println(arr[i]);
		}
		
		int arr_one[] = {7,8,9,4};		// We can define as this also
		for (int i=0;i<4;i++) {
			//System.out.println(arr_one[i]);
		}
		
		int arr_twoD[][] = {
				
				{7,8,9},
				{4,5,6},
				{1,2,3}
				
				};
		
		//System.out.println(arr_twoD[0][1]);
		
		for (int i=0;i<3;i++) { 		// For row
			for (int j=0;j<3;j++) {		// For Column
				//System.out.print(" "+ arr_twoD[i][j]);
			}
			//System.out.println();
		}
		
		int arr_jagged[][] = {
				
				{7,8,9,4,5},
				{4,2,3},
				{7,1,2,6,3,4,9}
		};
		
		for (int i=0;i<arr_jagged.length;i++) { 		// For row
			for (int j=0;j<arr_jagged[i].length;j++) {		// For Column
				System.out.print(" "+ arr_jagged[i][j]);
			}
			System.out.println();
		}
		
	}

}
