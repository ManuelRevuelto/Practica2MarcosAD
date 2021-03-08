package ProyectoMarcos.DAO;

import java.util.List;

import ProyectoMarcos.MODEL.Producto;

public interface IProductoDAO<T> {

	void insert(T em);

	void update(int id, T em);

	void delete(T em);

	List<Producto> getAll();

	Producto getone(int id);
}
