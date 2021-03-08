package ProyectoMarcos.DAO;

import java.util.List;

import org.hibernate.Session;

import ProyectoMarcos.BBDD.BbddMarcos;
import ProyectoMarcos.MODEL.Cliente;

public class ClienteDAO implements ICLienteDAO<Cliente> {

	private BbddMarcos conn;

	public ClienteDAO(BbddMarcos conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Cliente cl) {
		Session sesion = conn.getSession();// La iniciliza o utiliza la que ya esta creada
		sesion.beginTransaction();// Iniciamos una transaccion
		sesion.save(cl);// Grabamos el cliente en la base de datos
		sesion.getTransaction().commit();// Finalizamos la transaccion
		sesion.close();// cerramos la conexion
	}

	@Override
	public void update(int id, Cliente cl) {

	}

	@Override
	public void delete(Cliente cl) {
		Session sesion = conn.getSession();//
		sesion.beginTransaction();
	}

	@Override
	public List<Cliente> getAll() {
		org.hibernate.query.Query<Cliente> query = conn.getSession().createQuery("from cliente",
				Cliente.class);
		List<Cliente> clientes = query.getResultList();
		return clientes;
	}

	public Cliente getone(int id) {
		System.out.println();
		Cliente cliente = conn.getSession().get(Cliente.class, id);
		return cliente;
	}

}
