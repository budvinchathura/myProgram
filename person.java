public class person{
	String name;
	int age;
	int index;

	public person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public person(String name){
		person(name,50);
	}

	public sayName(){
		System.out.println(this.name);
		System.out.println("hello");

	}
}
