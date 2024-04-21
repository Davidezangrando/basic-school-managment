package boundary;

import java.util.Scanner;

import gestione.Gestionale;

public class Console {
	Scanner input = new Scanner(System.in);
	Gestionale gestionale = new Gestionale(10);
	Test test = new Test();
	
	public void start() {
		int scelta = 0;
		System.out.println("1 -> aggiungi studente");
		System.out.println("2 -> aggiungi voto");
		System.out.println("3 -> visualizza voto di uno studente");
		System.out.println("4 -> trova voto massimo di uno studente");
		System.out.println("5 -> trova voto minimo di uno studente");
		System.out.println("6 -> test");
		scelta = input.nextInt();
		switch(scelta) {
		case 1:
			aggiungiStudente();
			start();
		case 2:
			aggiungiVoto();
			start();
		case 3:
			visualizzaVoto();
			start();
		case 4: 
			trovaVotoMax();
			start();
		case 5:
			trovaVotoMin();
			start();
		case 6:
			test.test();
			start();
		}
	}
	
	public void aggiungiStudente() {
		System.out.println("Inserisci nome: ");
		String nome = input.next();
		System.out.println("Inserisci matricola: ");
		String matricola = input.next();
		gestionale.aggiungiStudenti(nome, matricola, 10);
	}
	
	public void aggiungiVoto() {
		System.out.println("Inserisci la matricola dello studente");
		String matricola = input.next();
		if (gestionale.trovaStudente(matricola) != null) {
			System.out.println("Studente trovato con successo"); 
			System.out.println("Inserisci il voto:"); 
			int voto = input.nextInt();
			input.nextLine();
			System.out.println("Inserisci il nome dell'esame");
			String nomeEsame = input.next();
			gestionale.aggiungiVoto(matricola,voto, nomeEsame);
		}
	}
	
	public void visualizzaVoto() {
		System.out.println("Inserisci la matricola dello studente");
		String matricola = input.next();
		if (gestionale.trovaStudente(matricola) != null) {
			gestionale.visualizzaVoto(matricola);
		}
	}
	
	public void trovaVotoMax() {
		System.out.println("inserisci la matricola: ");
		String matricola = input.next();
		gestionale.trovaVotoMax(matricola);
	}
	
	public void trovaVotoMin() {
		System.out.println("inserisci la matricola: ");
		String matricola = input.next();
		gestionale.trovaVotoMin(matricola);
	}
}
