package planetarium;

import java.util.Scanner;

public class Input {
	public static int readPositiveInteger() {
		Scanner sc = new Scanner(System.in);
		int result = -1;
		while (result < 0) {
			try {
				System.out.print("> ");
				result = sc.nextInt();
			} catch (Exception e) {

			}
		}
		return result;
	}

	public static int readPositiveInteger(String s) {
		Scanner sc = new Scanner(System.in);
		int result = -1;
		while (result < 0) {
			try {
				System.out.println(s);
				System.out.print("> ");
				result = sc.nextInt();
			} catch (Exception e) {

			}
		}
		return result;
	}

	public static String readString(String s) {
		Scanner sc = new Scanner(System.in);
		String result = null;
		while (result == null) {
			try {
				System.out.println(s);
				System.out.print("> ");
				result = sc.nextLine();
			} catch (Exception e) {

			}
		}
		return result;
	}

	public static String readString() {
		Scanner sc = new Scanner(System.in);
		String result = null;
		while (result == null) {
			try {
				System.out.print("> ");
				result = sc.nextLine();
			} catch (Exception e) {

			}
		}
		return result;
	}
}
