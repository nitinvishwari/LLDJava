package nitin;

class Parent{
	String name;
	int size;
	
	public Parent(String name, int size) {
//		this.setName(name);
//		this.setSize(size);
		
		this.name = name;
		this.size = size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(int size) {
		this.size = size;
	}
}

class Child extends Parent{
	int size;
	
	public Child() {
		super("ram", 2);
	}

	public void setSize(int size) {
		this.size = size + 2;
//		super.setSize(10);
	}
	
	public void printParentSize() {
		System.out.println(super.size);
	}
	
	
}

public class SubClassTesting {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.print(child.name + ", size: ");
		child.printParentSize();
	}
}
