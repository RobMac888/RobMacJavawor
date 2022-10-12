package Com;



}

import Unit.RunTest;

public class ExecutionPoint {
	
	public static void main(String[] args) {
		System.out.println("Do something in application");
		Result res=JUnitCore.runClasses(MasterTest.class)
		//res will collect all the results in an Array;[pass, pass , fail]
		for(Failure fail:res.getfailures())
		{
			System.out.println(fail.toString());
		}
		System.out.println(res.wasSuccessful());
		
		System.out.println("Do something in application");
		
	}
}