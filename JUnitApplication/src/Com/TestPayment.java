package Com;


import org.junit.Test;
	

	import Unit.Calculator;
	
	public class TestPayment {
		@Test
		public void runFindBiggest() {
			//assertequals check if first argument=2nd args
			assertEquals(100,Calculator.findBiggest(10,20,15));
		}
		
		@Test
		public void runFindMac() {
			int[] myArray= {100,20,30,1500,400};
			assertEquals{340,Calculator,findMax(myArray))};
		}
}
