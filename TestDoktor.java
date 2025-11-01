package doktor;

import java.time.LocalDate;

public class TestDoktor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nefrolog n = new Nefrolog("Pera", "Peric", "KBC Zemun",
                LocalDate.of(2015, 3, 1), 120, "Odeljenje nefrologije", 8);

        Endokrinolog e = new Endokrinolog("Jelena", "Markovic", "Klinika Merkur",
                LocalDate.of(2018, 6, 10), true, "Subspecijalista endokrinologije");

        Kardiolog k = new Kardiolog("Nikola", "Jovanovic", "VMA",
                LocalDate.of(2010, 1, 15), 350, true);

        System.out.println("--- Nefrolog ---");
        System.out.println(n.getIme());
        System.out.println(n.getPrezime());
        System.out.println(n.getUstanova());
        System.out.println(n.getDatumZaposljavanja());
        System.out.println(n.getBrojPacijenata());
        System.out.println(n.getOdeljenje());
        System.out.println(n.getGodineIskustva());

        System.out.println("\n--- Endokrinolog ---");
        System.out.println(e.getIme());
        System.out.println(e.getPrezime());
        System.out.println(e.getUstanova());
        System.out.println(e.getDatumZaposljavanja());
        System.out.println(e.isDijabetesSpecijalista());
        System.out.println(e.getSertifikat());

        System.out.println("\n--- Kardiolog ---");
        System.out.println(k.getIme());
        System.out.println(k.getPrezime());
        System.out.println(k.getUstanova());
        System.out.println(k.getDatumZaposljavanja());
        System.out.println(k.getBrojOperacija());
        System.out.println(k.isRadiDezuru());
	}

}
