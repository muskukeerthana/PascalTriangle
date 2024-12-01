package pascalTriangle;

import java.util.HashMap;
import java.util.Map;

public class PascalTriangle {

	private static Map<String, Integer> memo = new HashMap<>();

    public static int getPascalValue(int row , int col) {
        String key = row + "," + col;

        if (col == 0 || col == row) {
            return 1; // Base case
        }

        if (!memo.containsKey(key)) {
            int value = getPascalValue(row - 1, col - 1) + getPascalValue(row - 1, col);
            memo.put(key, value);
        }

        return memo.get(key);
    }

    public static void main(String[] args) {
        int numRows = 5;

        for (int i = 0; i < numRows; i++) {
        	for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(getPascalValue( i , j)+" " + "  ");
                
            }
            System.out.println();
        }
    }
	
}
