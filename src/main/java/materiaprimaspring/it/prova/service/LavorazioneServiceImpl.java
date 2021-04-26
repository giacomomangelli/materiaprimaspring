package materiaprimaspring.it.prova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import materiaprimaspring.it.prova.model.MateriaPrima;
import materiaprimaspring.it.prova.model.Stato;

@Service
public class LavorazioneServiceImpl implements ILavorazioneService {

	@Autowired
	private IInAssemblaggioService inAssemblaggioServiceInstance;
	@Autowired
	private IInVerniciaturaService inVerniciaturaServiceInstance;
	@Autowired
	private IInMessaInOperaService inMessaInOperaServiceInstance;
	@Autowired
	private IMateriaPrimaService materiaPrimaServiceInstance;
	
	
	@Override
	public void assembla(MateriaPrima materiaPrimaInstance) {
		inAssemblaggioServiceInstance.inAssemblaggio(materiaPrimaInstance);
	}
	@Override
	public void mettiInOpera(MateriaPrima materiaPrimaInstance) {
		inMessaInOperaServiceInstance.inMessaInOpera(materiaPrimaInstance);
	}
	@Override
	public void vernicia(MateriaPrima materiaPrimaInstance) {
		inVerniciaturaServiceInstance.inVerniciatura(materiaPrimaInstance);		
	}
	@Override
	public void inviaInLavorazione(MateriaPrima materiaPrimaInstance) {
		
		System.out.println(materiaPrimaInstance.getStato());
		materiaPrimaInstance.setStato(Stato.IN_LAVORAZIONE);
		materiaPrimaServiceInstance.cambiaStato(materiaPrimaInstance);
		System.out.println(materiaPrimaInstance.getStato());
		assembla(materiaPrimaInstance);
		System.out.println(materiaPrimaInstance.getStato());
		mettiInOpera(materiaPrimaInstance);
		System.out.println(materiaPrimaInstance.getStato());
		vernicia(materiaPrimaInstance);
		System.out.println(materiaPrimaInstance.getStato());
		materiaPrimaInstance.setStato(Stato.PRONTA);
		materiaPrimaServiceInstance.cambiaStato(materiaPrimaInstance);
		System.out.println(materiaPrimaInstance.getStato());
		
	}
	
	

}
