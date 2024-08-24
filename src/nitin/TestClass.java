package nitin;

public class TestClass {
	public void helper() {
		String s1 = "chinni";
		String s2 = "chinni";
		if(s1 == s2) {
			System.out.println("yes same");
		}
		String s3 = new String("nitin");
		String s4 = new String("nitin");
		if(s3 == s4) {
			System.out.println("object are also same");
		}
	}
}
