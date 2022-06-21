package jana60.generalità;

public class Persona {

	//attributi
	private String nome,cognome;
	private Indirizzo indirizzo;
	
	//costruttore
	public Persona(String nome, String cognome,Indirizzo indirizzo ) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		//this.Indrizzo = new indirizzo;
		this.indirizzo = new Indirizzo(indirizzo.getVia(), indirizzo.getNumero(), indirizzo.getCitta());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
}
