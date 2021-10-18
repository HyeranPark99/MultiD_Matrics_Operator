package com.exceptionthrow.www;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiDArray {
	/**
	 * Main method
	 * @param args empty arguments
	 * @throws VectorMismatchExcption 
	 */
	public static void main(String args[]) throws VectorMismatchExcption {
		
		List<Integer> temp = new ArrayList<Integer>();
		List<Integer> temp2 = new ArrayList<Integer>();
		
		
		/**
		 * Printing this program's instruction.
		 */
		System.out.println("This program will multiply two float type matrices.");
		System.out.println("Type the elements in order left to right. ");
		System.out.println("eg. If the matrix is 2X2, input the numbers in following order a11->a12->a21->a22");
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
		
		
		System.out.println("Please type "+ r1*c1+ " elements of Matrix1");
		for(int i = 0; i < r1*c1 ; i++) {
			int input = in.nextInt();
			temp.add(input);
		}
		
		
		
		System.out.println("Please type row of Matrix2");
		int r2 = in.nextInt();
		System.out.println("Please type column of Matrix2");
		int c2 = in.nextInt();
		System.out.println();

		
		System.out.println("Please type "+ r2*c2+ " elements of Matrix1");
		for(int i = 0; i < r2*c2 ; i++) {
			int input = in.nextInt();
			temp2.add(input);
		}
		
		
		
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

		
		// read inputs and assign them to a matrix
		int token=0;
		for(i=0; i< r1; i++) {
			for(j = 0; j < c1; j++) {
				twoD1[i][j] = temp.get(token+j);
		
			}
			
			token =j*(i+1);
		}	
		
	
		
		// read inputs and assign them to a matrix
		int token2=0;
		for(i=0; i< r2; i++) {
			for(j = 0; j < c2; j++) {
				twoD2[i][j] = temp2.get(token2+j);	
			}
			token2 =j*(i+1);
			System.out.println(token2);
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
	

	
//	/**
//	 * A method to get random numbers for a matrix
//	 * @param s Random type instance variable 
//	 * @param min minimum number
//	 * @param max maximum number
//	 * @return random number from 0 to 100
//	 */
//	private static int getNumbers(int min, int max) {
//		
//		Random s = new Random();
//		return s.nextInt((max-min)+1)+min;
//	}
	
	

	
}
