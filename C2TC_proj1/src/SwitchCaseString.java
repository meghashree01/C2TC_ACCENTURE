/**
 * 
 */

/**
 * @author MEGHA
 *
 */
public class SwitchCaseString {
	public static void main(String[] args) {
	String name="TEAM";
	switch(name.toLowerCase())
	{
	case "author":
		System.out.println("Vikas");
		break;
	case "team":
		System.out.println("Team java full stack");
		break;
	case "editor":
		System.out.println("Vsihnu and Krishna");
		break;
		default:
			System.out.println("Invalid Entry");
			break;
	}
	}
}
