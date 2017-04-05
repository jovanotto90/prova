package elena;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
        DipendenteA tizio = new DipendenteA("ABC123", 1000, 8.5);
        System.out.print("Quante ore di straordinario fa Tizio?\n");
        tizio.fai_straordinari(tastiera.nextDouble());
        System.out.print("Quanti giorni di malattia fa Tizio?\n");
        tizio.prendi_malattia(tastiera.nextInt());
        tizio.stampa();
        tizio.stampa_malattia();
	}
}