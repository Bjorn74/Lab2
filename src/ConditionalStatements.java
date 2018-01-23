import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize
		Scanner scan = new Scanner(System.in);

		int vUserNum;
		int vRemainder;
		char vCont = 'y';
		String vUserInput;

		// Do While Loop to allow reuse

		do {

			// Get Input & Verify
			System.out.println("Enter a number between 1 and 100:");
			vUserNum = scan.nextInt();
			vRemainder = (vUserNum % 2);

			// Gimme Space!
			System.out.println();

			// Decisioning

			if (vRemainder == 1) {
				if (vUserNum > 60) {
					System.out.println("Output: " + vUserNum + " Odd and over 60.");
				} else {
					System.out.println("Output: " + vUserNum + " and Odd.");
				}

			} else {
				if (vUserNum > 60) {
					System.out.println("Output: " + vUserNum + "  Even and over 60.");

				} else {
					if (vUserNum > 25) {
						System.out.println("Output: Even.");
					} else {
						if (vUserNum > 1) {
							System.out.println("Output: Even and less than 25.");
						}
					}
				}

			}
			// Ask if User wants to repeat

			System.out.println();
			System.out.println("Continue? (y/n): ");
			vUserInput = scan.next();
			vCont = vUserInput.charAt(0);
			if (vCont == 'Y') {
				vCont = 'y';
			}
		} while (vCont == 'y');

		// Cleanup
		scan.close();
	}

}
