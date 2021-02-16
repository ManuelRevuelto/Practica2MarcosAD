package ProyectoMarcos.BBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ProyectoMarcos.DAO.ClienteDAO;
import ProyectoMarcos.MODEL.Cliente;

public class MySQLClienteDAO implements ClienteDAO {

	final String INSERT = "INSERT INTO jardineria.cliente (codigo_cliente,nombre_cliente,nombre_contacto,apellido_contacto,telefono,"
			+ "fax,linea_direccion1,linea_direccion2,ciudad,pais,region,codigo_postal,codigo_empleado_rep_ventas,limite_credito) "
			+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	final String UPDATE = "UPDATE jardineria.cliente SET ";
	final String DELETE = "DELETE FROM jardineria.cliente WHERE codigo_cliente = ?;";
	final String GETALL = "SELECT * FROM jardineria.cliente";
	final String GETONE = "SELECT * FROM jardineria.cliente WHERE codigo_cliente = ?;";

	private Connection conn;

	public MySQLClienteDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Cliente cl) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(INSERT);

			st.setLong(1, cl.getCodigoCliente());
			st.setString(2, cl.getNombreCliente());
			st.setString(3, cl.getNombreContacto());
			st.setString(4, cl.getApellidoContacto());
			st.setString(5, cl.getTelefono());
			st.setString(6, cl.getFax());
			st.setString(7, cl.getLineaDireccion());
			st.setString(8, cl.getLineaDireccion2());
			st.setString(9, cl.getCiudad());
			st.setString(10, cl.getPais());
			st.setString(11, cl.getRegion());
			st.setLong(12, cl.getCodigoPostal());
			st.setLong(13, cl.getCodigoEmpleado());
			st.setLong(14, cl.getLimiteCredito());

			st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			throw new IllegalArgumentException("ERROR EN EL SQL");
		}
	}

	@Override
	public void update(int id, Cliente cl) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Cliente cl) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> getAll() {

		
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Cliente> clientes = new ArrayList<>();

		try {

			ps = conn.prepareStatement(GETALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				clientes.add(convertir(rs));
			}

			rs.close();
			ps.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se ha guardado nada");
		}

		return clientes;
	}

	@Override
	public Cliente getone(int id) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente c = null;

		try {

			ps = conn.prepareStatement(GETONE);
			rs = ps.executeQuery();
			if (rs.next()) {
				c = convertir(rs);
			}

			rs.close();
			ps.close();

		} catch (Exception e) {
		}

		return c;
	}

	private Cliente convertir(ResultSet rs) throws SQLException {
		Long codigoCliente = rs.getLong("codigo_cliente");
		String nombreCliente = rs.getString("nombre_cliente");
		String nombreContacto = rs.getString("nombre_contacto");
		String apellidoContacto = rs.getString("apellido_Contacto");
		String telefono = rs.getString("telefono");
		String fax = rs.getString("fax");
		String lineaDireccion = rs.getString("linea_direccion1");
		String lineaDireccion2 = rs.getString("linea_direccion2");
		String ciudad = rs.getString("ciudad");
		String region = rs.getString("region");
		String pais = rs.getString("pais");
		Long codigoPostal = rs.getLong("codigo_postal");
		Long codigoEmpleado = null;
		Long limiteCredito = rs.getLong("limite_credito");
		Cliente cliente = new Cliente(codigoCliente, nombreCliente, nombreContacto, apellidoContacto, telefono, fax,
				lineaDireccion, lineaDireccion2, ciudad, region, pais, codigoPostal, codigoEmpleado, limiteCredito);
		return cliente;
	}

}
