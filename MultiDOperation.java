package com.exceptionthrow.www;
import java.util.*;

/**
 * @author Hyeran
 * 
 * A class that multiply  matrices and throws exception
 */
public class MultiDOperation {

	/**
	 * A method that multiplies matrices 
	 * @param twoD1 the first matrix to be multiplied
	 * @param twoD2 the second matrix to be multiplied
	 * @return twoD3 a new matrix that has values of multiplication
	 * @throws VectorMismatchExcption an exception that catches 
	 */
	public static float[][] multMatrices(float[][] twoD1, float[][] twoD2) throws VectorMismatchExcption{
		
		if(twoD1[0].length == twoD2.length) {
			
			float[][] twoD3 = new float[twoD1.length][twoD2[0].length];
			
			int r1 = twoD1.length;
			int c2 = twoD2[0].length;
			int c1 = twoD1[0].length;
			
			int i,j,k = 0;	
			float m3 = 0;
			
			//  block which prints matrix 1 and 2 print 
			System.out.println();
			System.out.println("Matrix1 : " );
			VectorMismatchExcption.printContents(twoD1);
			System.out.println("Matrix2 : " );		
			VectorMismatchExcption.printContents(twoD2);
			
			/**
			 * Print a new matrix's row and column
			 */
			System.out.println("Multiplication of Matrices is " + r1 + " x " + c2 +"\n" + 
					 "row is "+ r1 +" " + "column is " + c2);
			
			for(i=0; i< r1 ; i++) {
				for(j = 0; j < c2 ; j++) {
					for(k = 0; k <c1; k++) {
						
						float m1 = twoD1[i][k] * twoD2[k][j];
						float m2 = m1;
					    m3 = m3 + m2;
					}
					twoD3[i][j] = m3;
					System.out.print(twoD3[i][j] + " ");
					m3 = 0;			
				}	
				System.out.println();		
			}
			return twoD3;
		}else {
			throw new VectorMismatchExcption("Matrices row and column don't match",twoD1, twoD2);
			// birth place of exception "new"
			// throw twoD1 and twoD2
		}
		
	}
	
	
	
	

}
