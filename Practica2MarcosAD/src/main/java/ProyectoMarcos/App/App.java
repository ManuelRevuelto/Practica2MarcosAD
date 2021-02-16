package ProyectoMarcos.App;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ProyectoMarcos.BBDD.BbddMarcos;
import ProyectoMarcos.BBDD.MySQLClienteDAO;
import ProyectoMarcos.DAO.ClienteDAO;
import ProyectoMarcos.MODEL.Cliente;

public class App {
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			conn = BbddMarcos.conectar();
			ClienteDAO dao = new MySQLClienteDAO(conn);
			boolean exit = true;
			do {

				Funciones.menu();
				int op = kb.nextInt();
				switch (op) {
				case 1:

					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
				
					System.out.print("Identificador del cliente que quieres que se muestre: ");
					int id = kb.nextInt();
					Cliente cliente = dao.getone(id);
					System.out.println(cliente.toString());
					break;
				case 5:
					List<Cliente> clientes = dao.getAll();
					for (Cliente cli : clientes) {
						System.out.println(cli.toString());
					}
					break;
				case 6:
					exit = false;
					break;
				default:
					throw new IllegalArgumentException("Valor erroneo: " + op);
				}
			} while (exit);

		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	}
}
