package materiaprimaspring.it.prova.service;

import materiaprimaspring.it.prova.model.MateriaPrima;

public interface IMateriaPrimaService {

	public void cambiaStato(MateriaPrima materiaPrimaInstance);

	public MateriaPrima findOne(Long id);
	
	public void inserisci(MateriaPrima materiaPrimaInstance);
	
	public void rimuovi(MateriaPrima materiaPrimaInstance);
	
}