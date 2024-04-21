package boundary;

import java.util.Scanner;

import statistiche.Gestionale;

public class Console {
	public void start() {
	Gestionale gestionale = new Gestionale(10);
	Scanner scanner = new Scanner(System.in);

	boolean continua = true;
	while(continua)
	{
		System.out.println("\nMenu:");
		System.out.println("1. Aggiungi uno studente");
		System.out.println("2. Aggiungi un voto ad uno studente");
		System.out.println("3. Visualizza il voto di uno studente");
		System.out.println("4. Torna al menu principale");
		System.out.println("5. Esci");

		System.out.println("\nSeleziona un'opzione:");

		int scelta = Integer.parseInt(scanner.nextLine());

		switch (scelta) {
		case 1:
			gestionale.aggiungiStudente();
			break;
		case 2:
			gestionale.aggiungiVoto();
			break;
		case 3:
			gestionale.visualizzaVoto();
			break;
		case 4:
			break;
		case 5:
			continua = false;
			System.exit(0);
			break;
		default:
			System.out.println("Scelta non valida.");
			break;
		}
	}

	scanner.close();
}
}


