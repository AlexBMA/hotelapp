package cmdline;

public class TestSomething {

	public static void main(String[] args) {
		java.util.Date dt = new java.util.Date();

		java.text.SimpleDateFormat sdf = 
		     new java.text.SimpleDateFormat("yyyy-MM-dd ");

		String currentTime = sdf.format(dt);
		System.out.println(currentTime);

	}

}
