package fisjava;

public class ControlStatementExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;

		if (a < b)
			System.out.println("A is smaller");
		else
			System.out.println(" b is smaller");

		System.out.println("After the if ");
		int ch = 1;
		switch (ch) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("Two ");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("out of range..");
		}
	}

}
