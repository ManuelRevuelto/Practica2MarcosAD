package ProyectoMarcos.DAO;

import java.util.List;

import ProyectoMarcos.MODEL.Empleado;

public interface IEmpleadoDAO<T> {
	
	void insert(T cl);

	void update(int id, T cl);

	void delete(T cl);

	List<T> getAll();
	
	Empleado getone(int id);

}