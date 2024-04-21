package boundary;

import bean.Studente;
import gestione.Gestionale;

public class Test {
	public void test() {
		Gestionale gestionale = new Gestionale(100);
		// creazione di 6 studenti
		gestionale.aggiungiStudenti("a", "a1", 10);
		gestionale.aggiungiStudenti("b", "a2", 10);
		gestionale.aggiungiStudenti("c", "a3", 10);
		gestionale.aggiungiStudenti("d", "a4", 10);
		gestionale.aggiungiStudenti("e", "a5", 10);
		// generazione di voti
		gestionale.aggiungiVoto("a1", 7, "mate");
		gestionale.aggiungiVoto("a1", 10, "mate");
		gestionale.aggiungiVoto("a1", 2, "mate");
		gestionale.aggiungiVoto("a2", 6, "mate");
		gestionale.aggiungiVoto("a2", 7, "mate");
		gestionale.aggiungiVoto("a2", 6, "mate");
		gestionale.aggiungiVoto("a3", 10, "mate");
		gestionale.aggiungiVoto("a3", 1, "mate");
		gestionale.aggiungiVoto("a3", 0, "mate");
		gestionale.aggiungiVoto("a4", 2, "mate");
		gestionale.aggiungiVoto("a4", 3, "mate");
		gestionale.aggiungiVoto("a4", 2, "mate");
		// visualizzo i voti
		gestionale.visualizzaVoto("a1");
		gestionale.visualizzaVoto("a2");
		gestionale.visualizzaVoto("a3");
		gestionale.visualizzaVoto("a4");
		gestionale.visualizzaVoto("a5");
		// voto max
		gestionale.trovaVotoMax("a1");
		gestionale.trovaVotoMax("a2");
		gestionale.trovaVotoMax("a3");
		gestionale.trovaVotoMax("a4");
		gestionale.trovaVotoMax("a5");
		// voto min
		gestionale.trovaVotoMin("a1");
		gestionale.trovaVotoMin("a2");
		gestionale.trovaVotoMin("a3");
		gestionale.trovaVotoMin("a4");
		gestionale.trovaVotoMin("a5");
		
	}
}
