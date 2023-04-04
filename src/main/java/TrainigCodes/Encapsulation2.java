/**
 * 
 */
package TrainigCodes;

/**
 * @author 91968
 *
 */
class Tiger{
	private String name;
	private String place;
	private int age;
	void setData(String name,String place,int age) {
		this.name=name;
		this.place=place;
		this.age=age;
		
	}
	void getData() {
		System.out.println(name);
		System.out.println(place);
		System.out.println(age);
	}
}

public class Encapsulation2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t1=new Tiger();
		t1.setData("Hoshi","Korea",27);
		t1.getData();

	}

}
