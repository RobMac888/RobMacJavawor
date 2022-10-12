package Reduce;

import java.util.stream.IntStream;

public class ReduceExample {

	public static void main(String[] args) {
		
		int result=	IntStream.range(1, 5) //1234
					.reduce(23,(a,b)->a+b);
		System.out.println(result);//reduce
		
		int result1= IntStream.range(1,  5)
				.parallel()//this is parallel
				.reduce(23, (a,b)->a+b);
		System.out.println(result1);
	}

}


/*[1,2,3,4,5,2,7] can use reduce for this
nonParallel = 23+1+2+3+4
parallel = 23+1 23+2 23+3 23+4 = 102

*/