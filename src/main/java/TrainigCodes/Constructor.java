package TrainigCodes;
class Dog1{
	private String name;
	private String color;
	
	private int age;
//Creating of constructor using 3 arguments.
	public Dog1(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

//Creating of constructor using 2 arguments.
	public Dog1(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

//Creating of constructor using 1 arguments.	
	public Dog1(String name) {
		super();
		this.name = name;
	}
//Creating a default constructor with no inputs.
	public Dog1() {
		super();
	}

	
//Getting individual getters to return values.
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getAge() {
		return age;
	}
	
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating of 4 objects for class Dog
		Dog1 d1=new Dog1();//no arguments
		Dog1 d2=new Dog1("Rock","black",5);//3 arguments defined
		Dog1 d3=new Dog1("Block","blue");//2 arguments defined
		Dog1 d4=new Dog1("Clock");//1 arguments defined
		
		// Printing the values as described 
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getAge());
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getAge());
		System.out.println(d3.getName());
		System.out.println(d3.getColor());
		System.out.println(d3.getAge());
		System.out.println(d4.getName());
		System.out.println(d4.getColor());
		System.out.println(d4.getAge());
	}

}
