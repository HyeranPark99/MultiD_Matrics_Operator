package com.exceptionthrow.www;
import java.util.Random;
import java.util.Scanner;

public class MultiDArray {
	/**
	 * Main method
	 * @param args empty arguments
	 * @throws VectorMismatchExcption 
	 */
	public static void main(String args[]) throws VectorMismatchExcption {
		
		/**
		 * Printing this program's instruction.
		 */
		System.out.println("Numbers inside of matrices will be randomly picked from 0 to 100.");
		System.out.println("After creating matrices, this program will multiply both matrices.");
		System.out.println();
		
		/**
		 * Create Scanner type variable 
		 */
		Scanner in = new Scanner(System.in);
		
		/**
		 * Ask an user to enter int numbers of columns and rows of matrices
		 * @param r1 row of the matrix 1
		 * @param c1 column of the matrix 1
		 * @param r2 row of the matrix 2
		 * @param c2 column of the matrix 2
		 */
		System.out.println("Please type row of Matrix1");
		int r1 = in.nextInt();
		System.out.println("Please type column of Matrix1");
		int c1 = in.nextInt();
		System.out.println("Please type row of Matrix2");
		int r2 = in.nextInt();
		System.out.println("Please type column of Matrix2");
		int c2 = in.nextInt();
		System.out.println();

		
		
		
		/**
		 * Creating float type 2D arrays 
		 * @param r1 row of the matrix 1
		 * @param c1 column of the matrix 1
		 * @param r2 row of the matrix 2
		 * @param c2 column of the matrix2
		 */
		float twoD1 [][] = new float[r1][c1];
		float twoD2 [][] = new float[r2][c2];
		
		
		/**
		 * @param i local variable of for loop
		 * @param j local variable of for loop
		 * @param k local variable of for loop
		 * @param m3 local variable of for loop
		 */	
		int i,j,k = 0;	
		float m3 = 0;		

					
		/**
		 * for loop that fills inside of Matrix1 with random numbers from 0 to 100
		 * And print Matrix 1 
		 * @param r1 row of the matrix1 
		 * @param c1 column of the matrix1
		 * @param i variable of the first for loop statement and position indicator of a matrix 
		 * @param j variable of the second for loop statement and position indicator of a matrix
		 */
		for(i=0; i< r1; i++) {
			for(j = 0; j < c1; j++) {
				twoD1[i][j] = getNumbers(0,100);	
			}
		}	
		
		
		/**
		 * for loop that fills inside of Matrix2 with random numbers from 0 to 100
		 * And print Matrix 2
		 * @param r2 row of the matrix2 
		 * @param c2 column of the matrix2
		 * @param i variable of the first for loop statement and position indicator of a matrix 
		 * @param j variable of the second for loop statement and position indicator of a matrix
		 */
		for(i=0; i< r2; i++) {
			for(j = 0; j < c2; j++) {
				twoD2[i][j] = getNumbers(0,100);		
			}
		}	
		
		/**
		 * Try block that contains matrix printout statements and multiplication 
		 * where an exception can occur.
		 * @param twoD1 the first matrix
		 * @param towD2 the second matrix
		 */
		try {
			MultiDOperation.multMatrices(twoD1, twoD2);
		}
		/**
		 * Catch block to handle the uncertain condition of try block
		 * first it will print an error message
		 * and prints throwable and its back trace to the standard error stream.
		 * @param error VectorMismatchException object
		 */
		catch(VectorMismatchExcption error) {
			
			error.reportInstance();	
			error.printStackTrace();
			
		}
		
		
		/**
		 * Scanner is closed
		 */
		in.close();
	
	}
	

	
	/**
	 * A method to get random numbers for a matrix
	 * @param s Random type instance variable 
	 * @param min minimum number
	 * @param max maximum number
	 * @return random number from 0 to 100
	 */
	private static int getNumbers(int min, int max) {
		
		Random s = new Random();
		return s.nextInt((max-min)+1)+min;
	}
}
