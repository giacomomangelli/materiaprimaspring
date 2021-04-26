package materiaprimaspring.it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import materiaprimaspring.it.prova.model.MateriaPrima;
import materiaprimaspring.it.prova.model.Stato;

@Service
public class InVerniciaturaServiceImpl implements IInVerniciaturaService {
	
	@Autowired
	private IMateriaPrimaService materiaPrimaServiceInstance;
	
	@Override
	public void inVerniciatura(MateriaPrima materiaPrimaInstance) {
		materiaPrimaInstance.setStato(Stato.IN_VERNICIATURA);
		materiaPrimaServiceInstance.cambiaStato(materiaPrimaInstance);
	}

	
	
}
