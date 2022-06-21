package jana60.generalità;

public class Indirizzo {

	//attributi
	private String via,numero,citta;

	public Indirizzo(String via, String numero, String citta) {
		super();
		this.via = via;
		this.numero = numero;
		this.citta = citta;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}
}
