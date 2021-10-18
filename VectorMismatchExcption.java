package com.exceptionthrow.www;
import java.lang.Exception;
/**
 * 
 * @author Hyeran
 * 
 * Class that defines a custom exception when two matrices are multiplied.
 * VectorMismatchExcption extends Exception class
 */
public class VectorMismatchExcption extends Exception {
	
	/**
    * Default constructor for exceptions of this type.
    *
    * @param first the first mismatched matrix.
    * @param second the second mismatched matrix.
    */
   public VectorMismatchExcption(float[][] first, float[][] second)
   {
       m1 = first;
       m2 = second;
   }
   
   	/**
   	 * Second constructor for exception which includes error string message
   	 * @param message error message 
   	 * @param first the first mismatched matrix
   	 * @param second the second mismatched matrix
   	 */
	public VectorMismatchExcption(String message,float[][] first, float[][] second) {
		super(message);
		m1 = first;
		m2 = second;
	}
   

   /**
    * A method to print error messages 
    * @param m1 the first matrix
    * @param m2 the second matrix
    */
   public void reportInstance()
   {
       System.out.println("Mismatch occurred between matrices factors:\n" +
                           "\t First matrix's row size is " + m1.length + ".\n" +
                           "\t First matrix's column size is  " + m1[0].length + ".\n" +
                           "\t Contents: ");
                           printContents(m1);

       System.out.println("\t Second matrix's row size is " + m2.length + ".\n" +
    		   			  "\t First matrix's column size is  " + m1[0].length + ".\n" +
    		   			  "\t Contents: ");

                           printContents(m2);
	  
   }

   /**
    * print vector elements in order.
    * @param matrix the matrix to be printed.
    */
   public static void printContents(float[][] matrix)
   {
	   int i,j,k = 0;
	 
	   for(i=0; i< matrix.length; i++) {
			for(j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");				
			}
		System.out.println();
		}	
	   System.out.println();   
   }
   
   // 2Dimentional array instances
   private  float[][] m1, m2;
}
