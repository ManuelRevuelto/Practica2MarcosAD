package ProyectoMarcos.DAO;

import java.util.List;

import ProyectoMarcos.BBDD.BbddMarcos;
import ProyectoMarcos.MODEL.Producto;

public class ProductoDAO implements IProductoDAO<Producto> {

	private BbddMarcos conn;

	public ProductoDAO(BbddMarcos conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Producto em) {

	}

	@Override
	public void update(int id, Producto em) {

	}

	@Override
	public void delete(Producto em) {

	}

	@Override
	public List<Producto> getAll() {
		return null;
	}

	@Override
	public Producto getone(int id) {
		return null;
	}

}
