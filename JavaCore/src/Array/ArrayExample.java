package Array;

public class ArrayExample {

	public static void main(String[] args) {
		// Declare
		// Instantiate
		//Initialize
		
		String[] student;//Declare
		student=new String[5];//instantiate
		student[0]="Hilda";//initialize
		student[1]="Hasan";
		student[2]="Kev";
		student[3]="Arifi";
		student[4]="Edith";
		
		String[] City=new String[5];
		
		String[] fruit= {"Banana","Aople","Guava","Pineapple","Avocado"};
		System.out.println("Students--------");
		for(int i=0;i<student.length;i++)
		{
	    	System.out.println(student[i]);
        }
        System.out.println("fruit--------");
		for(int i=0;i<fruit.length;i++)
        {
        	System.out.println(fruit[i]);
        }
        System.out.println("zipcode--------");
        int[] zipcode= {2345, 3456, 3456, 789, 467, 456,3456, 34567, 45678, 3456};
        for(int i=0;i<zipcode.length;i++)
        {
        	System.out.println(zipcode[i]);
        }
	}
}
        
