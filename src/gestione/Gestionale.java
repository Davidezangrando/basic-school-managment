package gestione;

import bean.Studente;
import bean.Voto;

public class Gestionale {
	private Studente[] studenti;
	private int numeroStudenti;

	public Gestionale(int maxStudenti) {
		studenti = new Studente[maxStudenti];
		numeroStudenti = 0;
	}

	public void aggiungiStudenti(String nome, String matricola, int votiMax) {
		votiMax = 10;
		studenti[numeroStudenti] = new Studente(nome, matricola, votiMax);
		numeroStudenti++;
	}

	public Studente trovaStudente(String matricola) {
		for (int i = 0; i < numeroStudenti; i++) {
			if (studenti[i].getMatricola().equals(matricola)) {
				return studenti[i];
			}
		}
		return null;
	}

	public void aggiungiVoto(String matricola, int voto, String nomeEsame) {
		Studente studenteAggiungiVoto = trovaStudente(matricola);
		studenteAggiungiVoto.aggiungiVoto(new Voto(voto, nomeEsame));
	}
	
	public void visualizzaVoto(String matricola) {
		Studente studenteDaStampareDati = trovaStudente(matricola);
		for (int i = 0; i < studenteDaStampareDati.getNumeroVoti(); i++) {
			Voto voto = studenteDaStampareDati.getVoti()[i];
			System.out.println("Voto: " + voto.getVoto() + " Nome esame: " + voto.getNomeEsame());
		}
	}
	
	public void trovaVotoMax(String matricola) {
		Studente studenteCalcolaVotoMax = trovaStudente(matricola);
		int votoMax = 0;
		String esameMax = "";
		for (int i = 0; i < studenteCalcolaVotoMax.getNumeroVoti(); i++) {
			Voto voto = studenteCalcolaVotoMax.getVoti()[i];
			int votoCorrente = voto.getVoto();
			String esameCorrente = voto.getNomeEsame();
			if (votoCorrente > votoMax) {
				votoMax = votoCorrente;
				esameMax = esameCorrente;
			}
		}
		System.out.println("Voto: " + votoMax + " Esame: " + esameMax);
	}
	
	public void trovaVotoMin(String matricola) {
		Studente studenteCalcolaVotoMax = trovaStudente(matricola);
		int votoMIn = 0;
		String esameMin = "";
		for (int i = 0; i < studenteCalcolaVotoMax.getNumeroVoti(); i++) {
			Voto voto = studenteCalcolaVotoMax.getVoti()[i];
			int votoCorrente = voto.getVoto();
			String esameCorrente = voto.getNomeEsame();
			if (votoCorrente < votoMIn) {
				votoMIn = votoCorrente;
				esameMin = esameCorrente;
			}
		}
		System.out.println("Voto: " + votoMIn + " Esame: " + esameMin);
	}
}
