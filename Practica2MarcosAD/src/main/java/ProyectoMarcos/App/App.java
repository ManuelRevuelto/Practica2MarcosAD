package ProyectoMarcos.App;

import java.sql.SQLException;
import java.util.Scanner;
import ProyectoMarcos.BBDD.BbddMarcos;
import ProyectoMarcos.DAO.ClienteDAO;
//import ProyectoMarcos.DAO.EmpleadoDAO;
//import ProyectoMarcos.DAO.ProductoDAO;
import ProyectoMarcos.MODEL.Cliente;

public class App {
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		BbddMarcos con = null;
		try {
			con = BbddMarcos.setUp();
			ClienteDAO cdao = new ClienteDAO(con);
			// EmpleadoDAO pdao = new EmpleadoDAO(con);
			boolean exit = true;
			do {

				Funciones.menu();
				int op = kb.nextInt();
				switch (op) {
				case 1:
					Cliente cliente = Funciones.datosCliente();
					cdao.insert(cliente);
					break;
				case 2:
					break;
				case 3:
					System.out.println("Introduzca el codigo del producto que quiera editar");
					int cod = kb.nextInt();
					Cliente cli = Funciones.actualizarCliente(cod);
					cdao.update(cod, cli);
					break;
				case 4:
					System.out.print("Identificador del cliente que quieres que se muestre: ");
					int id = kb.nextInt();
					System.out.println(cdao.getone(id));
					break;
				case 5:
					System.out.println(cdao.getAll().toString());
					break;
				case 6:
					System.out.println("** HAS SALIDO DEL PROGRAMA **");
					exit = false;
					break;
				default:
					throw new IllegalArgumentException("Valor erroneo: " + op);
				}
			} while (exit);

		} finally {

		}
	}
}
