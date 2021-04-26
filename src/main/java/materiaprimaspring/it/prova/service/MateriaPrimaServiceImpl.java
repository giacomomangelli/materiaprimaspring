package materiaprimaspring.it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import materiaprimaspring.it.prova.dao.IMateriaPrimaDao;
import materiaprimaspring.it.prova.model.MateriaPrima;

@Service
public class MateriaPrimaServiceImpl implements IMateriaPrimaService {

	@Autowired
	private IMateriaPrimaDao materiaPrimaDaoInstance;
	
	@Override
	public void cambiaStato(MateriaPrima materiaPrimaInstance) {
		materiaPrimaDaoInstance.update(materiaPrimaInstance);
	}

	@Override
	public MateriaPrima findOne(Long id) {
		return materiaPrimaDaoInstance.get(id);
	}

	@Override
	public void inserisci(MateriaPrima materiaPrimaInstance) {
		materiaPrimaDaoInstance.insert(materiaPrimaInstance);
	}

	@Override
	public void rimuovi(MateriaPrima materiaPrimaInstance) {
		materiaPrimaDaoInstance.delete(materiaPrimaInstance);
	}

}
