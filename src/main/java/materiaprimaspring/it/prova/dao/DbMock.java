package materiaprimaspring.it.prova.dao;

import java.util.ArrayList;
import java.util.List;

import materiaprimaspring.it.prova.model.MateriaPrima;
import materiaprimaspring.it.prova.model.Stato;

public class DbMock {
	
	public static final List<MateriaPrima> MATERIEPRIME = new ArrayList<MateriaPrima>();
	
	static {
		
		MateriaPrima oro = new MateriaPrima(1L, "oro", Stato.IN_INSERIMENTO);
		MATERIEPRIME.add(oro);
		MateriaPrima rame = new MateriaPrima(2L, "rame", Stato.IN_INSERIMENTO);
		MATERIEPRIME.add(rame);
		MateriaPrima legno = new MateriaPrima(3L,"frassino", Stato.IN_INSERIMENTO);
		MATERIEPRIME.add(legno);
	}

}
