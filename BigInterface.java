package hw1;

public interface BigInterface {

	int x=0;
	static int y=1;
	static final int z=7;

	public default void Method1() {
		int a=8;
		int b=a*9;
	}

	public void Method2();

	public void anotherMethod();




}
