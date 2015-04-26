/**
 * This class rotates each ring of a square of numbers clockwise one position.
 * The 5 would be here the inner ring, and the numbers around it on the outer ring.
 *
 * 1 | 2 | 3
 *----------
 * 4 | 5 | 6
 *----------
 * 7 | 8 | 9
 *
 * will be rotated to be
 *
 * 4 | 1 | 2
 *----------
 * 7 | 5 | 3
 *----------
 * 8 | 9 | 6
 *
 *
 */
public class RotateMatrix {

	public static void main(String[] args) {
		//rotateMatrix("1 2 3\n4 5 6\n7 8 9");
		int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};

		printMatrix(numbers);

		numbers = rotateMatrix(numbers);

		printMatrix(numbers);

	}

	public static int[][] rotateMatrix(int[][] numbersString){
		int i = 0;
		int j = 0;
		int di = 0;
		int dj = 1;
		int n = numbersString.length;
		int m = numbersString[0].length;
		int previous;
		int next = numbersString[i][j];
		do {
			previous = next;
			next = numbersString[i + di][j + dj];
			numbersString[i + di][j + dj] = previous;

			i += di;
			j += dj;

			if (i == 0 && j == m - 1) {di = 1; dj = 0;}
			if (i == n -1 && j == m - 1) {di = 0; dj = -1;}
			if (i == n - 1 && j == 0) {di = -1; dj = 0;}
		} while (i != 0 || j != 0);

		return numbersString;
	}

	private static void printMatrix(int[][] numbers){
		for (int i = 0; i < numbers.length; i++)
        {
               for (int j = 0; j < numbers[ i ].length; j++)
               {
                          System.out.print(numbers[ i ][ j ] + " ");
               }
              System.out.println( );
        }
		System.out.println( );
	}

}
