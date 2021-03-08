package ProyectoMarcos.DAO;

import java.util.List;

import ProyectoMarcos.MODEL.Cliente;

public interface ICLienteDAO<T> {

	void insert(T cl);

	void update(int id, T cl);

	void delete(T cl);

	List<Cliente> getAll();

	Cliente getone(int id);
}
