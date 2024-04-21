package bean;

public class Voto {
	private int voto;
	private String nomeEsame;
	
	public Voto(int voto, String nomeEsame) {
		this.voto = voto;
		this.nomeEsame = nomeEsame;
	}
	
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	public String getNomeEsame() {
		return nomeEsame;
	}
	public void setNomeEsame(String nomeEsame) {
		this.nomeEsame = nomeEsame;
	}
	
}
