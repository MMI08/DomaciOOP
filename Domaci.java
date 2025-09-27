import java.util.Scanner;

public class Domaci {

	public static void main(String[] args) {
		int broj1 = 24;
		int broj2 = 12;
		java.util.Scanner scanner = new Scanner(System.in);
		System.out.print("Unesite operaciju:");
		char operation = scanner.next().charAt(0);
		if (operation == '+') {
			int rezultat = broj1 + broj2;
			System.out.print(rezultat);
		} else if (operation == '-') {
			int rezultat = Math.abs(broj1 - broj2);
			System.out.print(rezultat);
		} else if (operation == '*') {
			int rezultat = broj1 * broj2;
			System.out.print(rezultat);
		} else if (operation == '/') {
			if (broj2 != 0) {
				int rezultat = broj1 / broj2;
				System.out.print(rezultat);
			} else {
				System.out.print("Ne moze se deliti sa 0.");
			}
		} else {
			System.out.print("Ne postoji ta operacija.");
		}
		scanner.close();

	}

}
