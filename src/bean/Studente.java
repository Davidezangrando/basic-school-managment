package bean;

public class Studente {
	private String nome;
	private String matricola;
	private int numeroVoti = 0;
	private Voto[] voti;
	
	public Studente(String nome, String matricola, int votiMax) {
		this.nome = nome;
		this.matricola = matricola;
		this.voti = new Voto[votiMax];
	}
	
	public void aggiungiVoto(Voto voto) {
		if (numeroVoti < voti.length) {
			voti[numeroVoti] = voto;
			numeroVoti++;
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
	public int getNumeroVoti() {
		return numeroVoti;
	}
	public void setNumeroVoti(int numeroVoti) {
		this.numeroVoti = numeroVoti;
	}
	public Voto[] getVoti() {
		return voti;
	}
	public void setVoti(Voto[] voti) {
		this.voti = voti;
	}
	
	
}
