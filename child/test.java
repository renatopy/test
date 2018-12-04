public class test{
	static
	{
		System.out.println("this method is a Initializer,do not need instantiate \"test\" class.");
	}
	{
		System.out.println("this method is a method,need instantiate \"test\" class.");
	}
	public static void main(String[] args){
		System.out.println("this is a test.");
	}
}