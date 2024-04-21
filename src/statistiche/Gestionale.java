package statistiche;

import java.util.Scanner;

import bean.Studente;
import bean.Voto;

public class Gestionale {
    private Studente[] studenti;
    private int numStudenti;
    private Scanner scanner;

    public Gestionale(int maxSize) {
        studenti = new Studente[maxSize];
        numStudenti = 0;
        scanner = new Scanner(System.in);
    }

    // Metodo per aggiungere uno studente
    public void aggiungiStudente() {
        System.out.println("Inserisci il nome dello studente:");
        String nome = scanner.nextLine();

        System.out.println("Inserisci la matricola dello studente:");
        String matricola = scanner.nextLine();

        System.out.println("Inserisci il numero massimo di voti per lo studente:");
        int numVotiMassimi = 10;
        studenti[numStudenti] = new Studente(nome, matricola, numVotiMassimi);
        numStudenti++;
    }

    // Metodo per aggiungere un voto ad uno studente
    public void aggiungiVoto() {
        System.out.println("Inserisci la matricola dello studente:");
        String matricola = scanner.nextLine();

        Studente studente = trovaStudente(matricola);
        if (studente != null) {
            System.out.println("Inserisci il voto:");
//            String inputVoto = scanner.nextLine();
//            String[] partiVoto = inputVoto.split(" ");
//            int voto = Integer.parseInt(partiVoto[0]);
//            String nomeEsame = partiVoto[1];
//            studente.aggiungiVoto(new Voto(voto, nomeEsame));
            int voto = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci il nome dell'esame:");
            String nomeEsame = scanner.next();
            studente.aggiungiVoto(new Voto(voto, nomeEsame));
        } else {
            System.out.println("Studente non trovato.");
        }
    }

    // Metodo per visualizzare il voto di uno studente
    public void visualizzaVoto() {
        System.out.println("Inserisci la matricola dello studente:");
        String matricola = scanner.nextLine();

        Studente studente = trovaStudente(matricola);
        if (studente != null) {
            System.out.println("Voti di " + studente.getNome() + ":");
            for (int i = 0; i < studente.getNumVoti(); i++) {
                Voto voto = studente.getVoti()[i];
                System.out.println(voto.getVoto() + " " + voto.getNomeEsame());
            }
        } else {
            System.out.println("Studente non trovato.");
        }
    }

    // Metodo privato per trovare uno studente data la matricola
    private Studente trovaStudente(String matricola) {
        for (int i = 0; i < numStudenti; i++) {
            if (studenti[i].getMatricola().equals(matricola)) {
                return studenti[i];
            }
        }
        return null;
    }
}

