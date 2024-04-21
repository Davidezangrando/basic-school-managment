package bean;

public class Studente {
    private String nome;
    private String matricola;
    private Voto[] voti; // Array di voti per lo studente
    private int numVoti; // Numero di voti attualmente registrati

    public Studente(String nome, String matricola, int numVotiMassimi) {
        this.nome = nome;
        this.matricola = matricola;
        this.voti = new Voto[numVotiMassimi];
        this.numVoti = 0;
    }

    public void aggiungiVoto(Voto voto) {
        if (numVoti < voti.length) {
            voti[numVoti] = voto;
            numVoti++;
        } else {
            System.out.println("Limite massimo di voti raggiunto per lo studente.");
        }
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public Voto[] getVoti() {
		return voti;
	}

	public void setVoti(Voto[] voti) {
		this.voti = voti;
	}

	public int getNumVoti() {
		return numVoti;
	}

	public void setNumVoti(int numVoti) {
		this.numVoti = numVoti;
	}
    
}