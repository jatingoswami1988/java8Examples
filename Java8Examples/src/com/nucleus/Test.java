package com.nucleus;

public class Test {

	public static void main(String agr[]) {

		int A[] = {1,2,2,3};
		//int A[] = { 1, 1, 1 };
		//int A[] = { 1, 2, 1 };

		boolean increasing = true;
        boolean decreasing = true;
		
		
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] > A[i + 1]) {
				increasing = false;
			}
			
            if (A[i] < A[i + 1]) {
				decreasing = false;
			}
		}

		System.out.println(increasing || decreasing);
      
}

}
