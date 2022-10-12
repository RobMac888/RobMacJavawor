package MethodOverloading;  //Writing the same method with different parameters

public class Sample {

	public void sum(int x,int y) {}
	public void sum(float x,float y) {}
	public void sum(int x , float y) {}
	public void sum(float x, int y) {}
	public void sum(double x, double y, double z) {}
	public void sum(int x, int y, int z) {}

}