package materiaprimaspring.it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import materiaprimaspring.it.prova.model.MateriaPrima;
import materiaprimaspring.it.prova.model.Stato;

@Service
public class InAssemblaggioServiceImpl implements IInAssemblaggioService {

	@Autowired
	private IMateriaPrimaService materiaPrimaServiceInstance;
	
	@Override
	public void inAssemblaggio(MateriaPrima materiaPrimaInstance) {
		materiaPrimaInstance.setStato(Stato.IN_ASSEMBLAGGIO);
		materiaPrimaServiceInstance.cambiaStato(materiaPrimaInstance);
	}

}
