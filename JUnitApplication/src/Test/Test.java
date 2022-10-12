package Test;

import Unit.Calculator;

public class Test { 

}







public class TestAnnotation {
	int maths;
	int english;
	int chemistry;
	@BeforeClass
	public static void m1()
	{
		System.out.println("@BeforeClass we are making the report card");	
	}
	@Before
	public void m2()
	{
		System.out.println("Initialize the marks");
		this.chemistry=40;
		this.english=66;
		this.maths=40;
	}
	@After
	public void m3()
	{
		this.chemistry=0;
		this.english=0;
		this.maths=0;
		System.out.println("Result calculation completed");
	}
	@AfterClass
	public static void m4()
	{
		System.out.println("AfterClass report generated");
	}
	@Ignore
	public void m5()
	{
		System.out.println("We ignore other subjects calculation");
	}
	@Test
	public void runFindBig() {
		assertEquals(true,Calculator.findAvgMarks("maths, chemistry, english"));
	}
}


