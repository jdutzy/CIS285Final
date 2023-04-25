import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class TestSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
	}
	public TestSelectionSort() {
	}
	
	@Test
	public void testPositive(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 7;
		arr[2] = 1;
		arr[3] = 3;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 1;
		Sortedarr[1] = 2;
		Sortedarr[2] = 3;
		Sortedarr[3] = 7;
		Sortedarr[4] = 8;
		/** add tests to check for this unit test **/
	   SelectionSort sorter = new SelectionSort();
       sorter.selectionSort(arr);
       for (int i = 0; i < arr.length; ++i)
       {
               assertEquals("Error in positive at position " + i, Sortedarr[i], arr[i]);
      
       }
	}
	
	@Test
	public void testNegative(){
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -7;
		arr[2] = -1;
		arr[3] = -3;
		arr[4] = -2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -8;
		Sortedarr[1] = -7;
		Sortedarr[2] = -3;
		Sortedarr[3] = -2;
		Sortedarr[4] = -1;
		/** Test data contains negative values only **/
		SelectionSort sorter = new SelectionSort();
		sorter.selectionSort(arr);
		 for (int i = 0; i < arr.length; ++i)
	        {
	                assertEquals("Error in negative at position " + i, Sortedarr[i], arr[i]);
	       
	        }
	}
	
	@Test
	public void testMixed(){
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = 7;
		arr[2] = -1;
		arr[3] = -3;
		arr[4] = 0;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -8;
		Sortedarr[1] = -3;
		Sortedarr[2] = -1;
		Sortedarr[3] = 0;
		Sortedarr[4] = 7;
		/** Test data contains with both positive, negative and zeros **/
		SelectionSort sorter = new SelectionSort();
		sorter.selectionSort(arr);
		 for (int i = 0; i < arr.length; ++i)
	        {
	                assertEquals("Error in mixed at position " + i, Sortedarr[i], arr[i]);
	       
	        }
	}
	}