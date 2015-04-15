/**
 * 
 */

/**
 * @author daniel
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		for (int ix = 0; ix < args.length; ix++) {
			System.out.println("Arg " + ix + ": " + args[ix]);
		}
		Welcomer www = new Welcomer();
		www.sayHi();
	}

}

class Welcomer {
	private String welcom = "Hello!";
	
	public void sayHi() {
		System.out.println(welcom);
	}
	
	
}