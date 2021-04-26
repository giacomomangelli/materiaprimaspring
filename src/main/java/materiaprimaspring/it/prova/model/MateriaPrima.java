package materiaprimaspring.it.prova.model;


public class MateriaPrima {

	private Long id;
	private String descrizione;
	private Stato stato;
	
	public Long getId() {
		return id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public Stato getStato() {
		return stato;
	}

	public MateriaPrima(Long id, String descrizione, Stato stato) {
		super();
		this.id = id;
		this.descrizione = descrizione;
		this.stato = stato;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	
}
