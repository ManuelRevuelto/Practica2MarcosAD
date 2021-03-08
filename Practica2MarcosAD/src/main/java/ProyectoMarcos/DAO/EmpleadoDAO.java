package ProyectoMarcos.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ProyectoMarcos.BBDD.BbddMarcos;
import ProyectoMarcos.MODEL.Cliente;
import ProyectoMarcos.MODEL.Empleado;

public class EmpleadoDAO implements IEmpleadoDAO<Empleado> {

	final String INSERT = "INSERT INTO cliente (codigo_cliente,nombre_cliente,nombre_contacto,apellido_contacto,telefono,"
			+ "fax,linea_direccion1,linea_direccion2,ciudad,pais,region,codigo_postal,codigo_empleado_rep_ventas,limite_credito) "
			+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	final String UPDATE = "UPDATE cliente SET ";
	final String DELETE = "DELETE FROM cliente WHERE codigo_cliente = ?";
	final String GETALL = "SELECT * FROM cliente";
	final String GETONE = "SELECT * FROM cliente WHERE codigo_cliente = ?";

	private BbddMarcos conn;

	public EmpleadoDAO(BbddMarcos conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Empleado cl) {

	}

	@Override
	public void update(int id, Empleado cl) {

	}

	@Override
	public void delete(Empleado cl) {

	}

	@Override
	public List<Empleado> getAll() {
		
		return null;
	}

	@Override
	public Empleado getone(int id) {
		
		return null;
	}

}
