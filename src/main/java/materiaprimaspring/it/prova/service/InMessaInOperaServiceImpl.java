package materiaprimaspring.it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import materiaprimaspring.it.prova.model.MateriaPrima;
import materiaprimaspring.it.prova.model.Stato;

@Service
public class InMessaInOperaServiceImpl implements IInMessaInOperaService {

	@Autowired
	private IMateriaPrimaService materiaPrimaServiceInstance;
	
	@Override
	public void inMessaInOpera(MateriaPrima materiaPrimaInstance) {
		materiaPrimaInstance.setStato(Stato.IN_MESSA_IN_OPERA);
		materiaPrimaServiceInstance.cambiaStato(materiaPrimaInstance);
	}

}
