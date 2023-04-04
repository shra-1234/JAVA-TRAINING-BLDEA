package TrainigCodes;

/**
 * @author 91968
 *
 */
class Dog{
	String name;
	String color;
	int cost;
	
	void setData(String a,String b,int c) {
		name=a;
		color=b;
		cost=c;
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}
	
}
public class Encapsulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.setData("Blacky","Black", 50000);
		d1.getData();
		

	}

}