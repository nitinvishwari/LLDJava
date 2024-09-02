package nitin;

class Demo{
	
	int price;
	int size;
	String name;
	
	public Demo(int price) {
		this.price = price;
		this.size = 0;
		this.name = null;
	}
	
	public Demo(int size, String name) {
		this(100);
		this.size = size;
		this.name = name;
	}
	
	public void setValues(int size, String name){
		this.name = name;
		this.size = size;
	}
	
}

public class ConstructorTest {
	
	public static void main(String[] args) {
		Demo demo = new Demo(10, "ram");
		demo.setValues(3, "ram");
		System.out.println(demo.name + ", size: " + demo.size + ", price: "+ demo.price);
	}
	
}
