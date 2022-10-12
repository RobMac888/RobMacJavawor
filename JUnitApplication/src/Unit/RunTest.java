package Unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunTest {
	@Test
	public void runFindBig() {
		//assertEquals check if first argument is equal to 2nd
		assertEquals(500,Calculator.findBig(500, 200));
	}
	
	@Test // check ig findbig() methof returns right results
	public void runFindSmall() {
		//assertEquals check if first argument is equal to 2nd
		assertEquals(20,Calculator.findSmall(10, 20));
	}
		
	@Test // check ig findbig() methof returns right results
	public void runFindBiggest() {
		//assertEquals check if first argument is equal to 2nd
		assertEquals(20,Calculator.findBiggest(20,10,15));
	}
	
	@Test // Check if FindBig() method returns right results
	public void runFindMax() {
		int[] myArray= {100,20,30,1500,400};
		assertEquals(40,Calculator.findMax(myArray));
	}
}
	
	
	
	//ln 20 private void assertEquals(int i, int findSmall) {
		// TODO Auto-generated method stub
		


/* This checks the logic of the program - 500 & 200 if my 
 * logic is correct it should return 500
 * 
 * 
 * 
 * Created a calculator class and 
 * a runtest class
 * 
 * This is checking the code NOT executing the code
 * assertEquals(20, Calculation.findBig(10, 20));

 */

