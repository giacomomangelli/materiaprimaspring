package materiaprimaspring.it.prova.service;

import materiaprimaspring.it.prova.model.MateriaPrima;

public interface ILavorazioneService {
	
	public void assembla(MateriaPrima materiaPrimaInstance);

	public void mettiInOpera(MateriaPrima materiaPrimaInstance);
	
	public void vernicia(MateriaPrima materiaPrimaInstance);
	
	public void inviaInLavorazione(MateriaPrima materiaPrimaInstance);


}
