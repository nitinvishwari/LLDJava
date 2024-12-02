package nitin;

import java.util.*;

/*
Solid
S - single resoponsibilty priciple
O - Open for extension closed fro modification
L - Liskov inversion priciple
I - inteface segregation priciple 
D - Dependency Inversion priciple




interface Locker{
	int a;
	int b;
	public void method() {}
}

class LockerImplementation1 implements Locker{
	public 
}

class LockerImplementation2 implements Locker{
	public 
}



class Bird{
	public void fly(){}
	
}


class parrot extends Bird{
	public void run(){}
}


Bird bird = new 

Singlton
Factory
Builder 
Adaptor

*/

/*
class Bird{
	
	private static Bird onlyInstance = new Bird();
	
	int a;
	
	private Bird() {};
	
	public static Bird getInstance() {
		return onlyInstance;
	}
	
}

public class Practise{
	public static void main(String[] args) {
		Bird birdObject = Bird.getInstance();
		birdObject.a = 2;
		
		Bird birdObject2 = Bird.getInstance();
		System.out.println(birdObject2.a);
	}
}
*/

/*
 * 
 * Factory Design pattern
interface Coffee{
	public void make();
}


class Latte implements Coffee{
	public void make() {
		System.out.println("make Latte");
	}
}

class Cappuccino implements Coffee{
	public void make() {
		System.out.println("make Cappuccino");
	}
}

class Factory{
	
	public Coffee getCoffeeType(String coffeeType) {
		if(coffeeType.equals("Latte")) {
			return new Latte();
		}
		else {
			return new Cappuccino();
		}
	}
}

class Practise{
	public static void main(String[] strs) {
		Factory factory = new Factory();
		Coffee coffeeMachine = factory.getCoffeeType("Cappuccino");
		coffeeMachine.make();
	}
}
*/

/*
 * 
 * Builder
 
class MyStringBuilder{
	List<Character> listOfCharacter;
	
	public MyStringBuilder() {
		listOfCharacter = new ArrayList<>();
	}
	
	public MyStringBuilder append(char c) {
		listOfCharacter.add(c);
		return this;
	}
	
	public void makeEmpty() {
		listOfCharacter = new ArrayList<>();
	}
	
	public String toString() {
		String s = "";
		for(char c: listOfCharacter) {
			s += c;
		}
		return s;
	}
}

class Practise{
	
	public static void main(String[] args) {
		MyStringBuilder sb = new MyStringBuilder();
		sb.append('a').append('b');
		System.out.println(sb);
	}
}
*/

// Adaptor


/*
class Print{
	public void printKaro(String s) {
		System.out.println(s);
	}
}

interface Printer{
	public void printKaro(List<Character> list);
}

class Adaptor implements Printer{
	Print printObj = new Print();
	
	public void printKaro(List<Character> charArr) {
		StringBuilder sb = new StringBuilder();
		for(char c: charArr) {
			sb.append(c);
		}
		printObj.printKaro(sb.toString());
	}
}


public class Practise {
	public static void main(String[] args) {
		
		List<Character> list = Arrays.asList('a', 'b');
		Printer printerObj = new Adaptor();
		printerObj.printKaro(list);
	}
}
*/

enum Size{
	SMALL, MEDIUM, BIG, EXTRABIG
}

class Practise{
	
	public static void main(String[] args) {
		Size s = Size.BIG;
		if(s == Size.BIG) {
			System.out.println("It's a big size object");
		}
	}
}

























