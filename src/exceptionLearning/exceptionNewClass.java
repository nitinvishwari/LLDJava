package exceptionLearning;


class NitinException extends RuntimeException{
	@Override
	public String toString() {
		return "a is zero";
	}
}

public class exceptionNewClass {
	
	public static void helper(){
		int a = 0;
		throw new NitinException();

	}

	public static void main(String[] args){
			helper();
			System.out.println("Nitin and Chinni are super heroes");
		
	}
}


/*
Throw vs throws
Checked(Compile) vs Unchecked(Runtime)
Exception vs RuntimeException
*/