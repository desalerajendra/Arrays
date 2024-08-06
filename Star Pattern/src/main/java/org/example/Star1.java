package org.example;

public class Star1 {// "static void main" must be defined in a public class.

        public static void main(String args[])
        {
            //i for rows and j for columns
            //row denotes the number of rows you want to print
            int i, j, row = 6;
            //Outer loop work for rows
            for (i=0; i<row; i++)
            {
                //inner loop work for space
                for (j=2*(row-i); j>=0; j--)
                {

                    //prints space between two stars
                    System.out.print(" ");
                    // System.out.print(row);
                }
                //inner loop for columns
                for (j=0; j<=i; j++ )
                {
                    //prints star
                    System.out.print("* ");
                }
                //throws the cursor in a new line after printing each line
                System.out.println();
            }
        }
    }

/* Output
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *

 */
