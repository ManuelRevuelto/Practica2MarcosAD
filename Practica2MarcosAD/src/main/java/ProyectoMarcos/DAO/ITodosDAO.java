package ProyectoMarcos.DAO;

import java.util.List;

public interface ITodosDAO<T> {
	List<T> getAll();

	void save(T cl);

	void update(int id, T cl);

	void delete(T cl);

}
