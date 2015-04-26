import org.junit.*;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by sargis on 4/23/15.
 */
public class RotateMatrixTest {

	@Before
	public void setUp() {

	}

	@Test
	public void rotateMatrix() {
		int[][] inputMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] expectedResult = {{4, 1, 2}, {7, 5, 3}, {8, 9, 6}};

		int[][] outputResult = RotateMatrix.rotateMatrix(inputMatrix);

		assertArrayEquals("Matrix rotated not correctly!", expectedResult, outputResult);
	}
}
