package materiaprimaspring.it.prova.dao;

import materiaprimaspring.it.prova.model.MateriaPrima;

public interface IMateriaPrimaDao {

	
	public MateriaPrima get(Long id);
	
	public void update(MateriaPrima materiaPrimaInstance);
	
	public void insert(MateriaPrima materiaPrimaInstance);
	
	public void delete(MateriaPrima materiaPrimaInstance);
	
	
}
