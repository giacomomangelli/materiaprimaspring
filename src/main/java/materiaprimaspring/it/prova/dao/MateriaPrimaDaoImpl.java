package materiaprimaspring.it.prova.dao;

import org.springframework.stereotype.Component;

import materiaprimaspring.it.prova.model.MateriaPrima;

@Component
public class MateriaPrimaDaoImpl implements IMateriaPrimaDao {

	@Override
	public MateriaPrima get(Long id) {
		
		for(MateriaPrima materiaPrimaItem : DbMock.MATERIEPRIME) {
			if(materiaPrimaItem.getId().equals(id)) {
				return materiaPrimaItem;
			}
		}
		return null;
	}

	@Override
	public void update(MateriaPrima materiaPrimaInstance) {
		
		for(MateriaPrima materiaPrimaItem : DbMock.MATERIEPRIME) {
			if(materiaPrimaItem.getId().equals(materiaPrimaInstance.getId())) {
				materiaPrimaItem.setDescrizione(materiaPrimaInstance.getDescrizione());
				materiaPrimaItem.setStato(materiaPrimaInstance.getStato());
				return;
			}
		}
		
	}

	@Override
	public void insert(MateriaPrima materiaPrimaInstance) {
		DbMock.MATERIEPRIME.add(materiaPrimaInstance);
	}

	@Override
	public void delete(MateriaPrima materiaPrimaInstance) {
		DbMock.MATERIEPRIME.remove(materiaPrimaInstance);
	}

}
