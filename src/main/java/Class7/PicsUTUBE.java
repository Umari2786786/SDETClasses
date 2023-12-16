package Class7;

import java.util.Scanner;

public class PicsUTUBE {
    public static void main(String[] args) {
        int rows;
        int columns;
        String symbol;

        Scanner scanner=new Scanner(System.in);  /* scanner to take user input - ONLY NEEDED ONCE ENTER (scanner=scanner) */

        System.out.println("Enter the no rows you want: ");
        rows= scanner.nextInt(); /* this has variable "rows" and save whatever is entered in the scanner  */
        System.out.println("Enter the no of columns: ");
        columns= scanner.nextInt();/* this has variable "columns" and save whatever is entered in the scanner  */
        System.out.println("Enter the symbol you want to show:");
        symbol= scanner.next(); /* this has variable "symbol" and save whatever is entered in the scanner  */

        for (int i=1;i <=rows;i++){ /*  i=1 multiplied of rows entered  */
            System.out.println(); /* takes you to the line below  */
            for(int j=1;j <=columns;j++){ /* j=1 multiplied of columns entered  */
                System.out.print(symbol+" "); /* print the symbol the declared in rows and columns. */
            }
        }
    }
}
/* https://www.youtube.com/watch?v=oF3nBQFfpeM */
/* BASICALLY MAKES A SQUARE or RECTANGLE  !!! */