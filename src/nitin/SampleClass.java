package nitin;

public class SampleClass{
	@SuppressWarnings("removal")
	public void helper() {
		Integer a = new Integer(2);
		Integer b = new Integer(2);
		System.out.println(System.identityHashCode(a) + " " + System.identityHashCode(b));
		String s1 = new String("chinni");
		String s2 = new String("chinni");
		System.out.println(System.identityHashCode(s1) + " " + System.identityHashCode(s2));
		
	}
}
