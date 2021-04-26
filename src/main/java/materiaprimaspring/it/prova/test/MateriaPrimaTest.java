package materiaprimaspring.it.prova.test;

import materiaprimaspring.it.prova.model.MateriaPrima;
import materiaprimaspring.it.prova.service.ILavorazioneService;
import materiaprimaspring.it.prova.service.IMateriaPrimaService;
import materiaprimaspring.it.prova.spring.MyServiceFactory;

public class MateriaPrimaTest {

	public static void main(String[] args) {
		
		IMateriaPrimaService materiaPrimaServiceInstance = MyServiceFactory.getMateriaPrimaService();
		
		ILavorazioneService inLavorazioneServiceInstance = MyServiceFactory.getInLavorazioneService();
		
		MateriaPrima materia = materiaPrimaServiceInstance.findOne(1L);
		
		inLavorazioneServiceInstance.inviaInLavorazione(materia);
		
		System.out.println("/////////////////////////////SECONDA MATERIA//////////////////////////////////////");
		
		MateriaPrima materia2 = materiaPrimaServiceInstance.findOne(2L);
		
		inLavorazioneServiceInstance.inviaInLavorazione(materia2);

		

	}

}
