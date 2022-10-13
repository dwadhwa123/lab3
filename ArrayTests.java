import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] evenInput = {3, 4, 5, 6};
    ArrayExamples.reverseInPlace(evenInput);
    assertArrayEquals(new int[]{6, 5, 4, 3}, evenInput);
    int[] oddInput = {3, 4, 5, 6, 7};
    ArrayExamples.reverseInPlace(oddInput);
    assertArrayEquals(new int[]{7, 6, 5, 4, 3}, oddInput);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] evenInput = {3, 4, 5, 6};
    assertArrayEquals(new int[]{6, 5, 4, 3}, ArrayExamples.reversed(evenInput));
    int[] oddInput = {3, 4, 5, 6, 7};
    assertArrayEquals(new int[]{7, 6, 5, 4, 3}, ArrayExamples.reversed(oddInput));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {};
    assertEquals(0, (int)ArrayExamples.averageWithoutLowest(input1));
    double[] input2 = {1,3,4,5};
    assertEquals((int) 4, (int) ArrayExamples.averageWithoutLowest(input2));
    double[] input3 = {2, 2, 3,4,5};
    assertEquals((int) 4, (int)ArrayExamples.averageWithoutLowest(input3));
  }
}
