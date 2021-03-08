package ProyectoMarcos.App;

import java.util.Scanner;
import ProyectoMarcos.MODEL.Cliente;

public class Funciones {
	static Scanner kb = new Scanner(System.in);

	/**
	 * Funcion que enseña un menu por pantalla
	 * 
	 */
	public static void menu() {
		System.out.println("\t************* ESCOJA LA OPCION QUE DESEA REALIZAR *************");
		System.out.println("1.- Añade un cliente");
		System.out.println("2.- Borrar un cliente");
		System.out.println("3.- Actualizar un cliente");
		System.out.println("4.- Mostrar un cliente");
		System.out.println("5.- Mostrar todos los clientes");
		System.out.println("6.- EXIT");
		System.out.print("Opcion: ");
	}

	/**
	 * Esta funcion sirve para obtener los datos de un nuevo cliente
	 * 
	 * @param c
	 */
	public static Cliente datosCliente() {

		System.out.println();
		System.out.println("\t************* CREAR CLIENTE *************");
		System.out.println("Introduzca el codigo del cliente, por favor");
		int codigoCliente = kb.nextInt();
		System.out.println("Introduzca el nombre del cliente, por favor");
		String nombreCliente = kb.nextLine();
		System.out.println("Introduzca el nombre de contacto, por favor");
		String nombreContacto = kb.nextLine();
		System.out.println("Introduzca el apellido del contacto, por favor");
		String apellidoContacto = kb.nextLine();
		System.out.println("Introduzca el telefono, porfavor");
		String telefono = kb.nextLine();
		System.out.println("Introduzca el fax, por favor");
		String fax = kb.nextLine();
		System.out.println("Introduzca la direccion principal , por favor");
		String direccion1 = kb.nextLine();
		System.out.println("Introduzca la direccion secundario, porfavor ");
		String direccion2 = kb.nextLine();
		System.out.println("Introduzca la ciudad, por favor");
		String ciudad = kb.nextLine();
		System.out.println("Introduzca la region, por favor");
		String region = kb.nextLine();
		System.out.println("Introduzca el pais, por favor");
		String pais = kb.nextLine();
		System.out.println("Intrduce el codigo postal , por favor");
		String codPostal = kb.nextLine();
		System.out.println("Introduzca el codigo del empleado, por favor");
		int codEmple = kb.nextInt();
		System.out.println("Introduzca un limite de credito, por favor");
		Long limite = kb.nextLong();

		return new Cliente(codigoCliente, nombreCliente, nombreContacto, apellidoContacto, telefono, fax, direccion1,
				direccion2, ciudad, region, pais, codPostal, codEmple, limite);

	}
	
	public static Cliente actualizarCliente(int cod) {

		System.out.println();
		System.out.println("\t************* ATUALIZAR CLIENTE *************");
		System.out.println("Introduzca el nombre del cliente, por favor");
		String nombreCliente = kb.nextLine();
		System.out.println("Introduzca el nombre de contacto, por favor");
		String nombreContacto = kb.nextLine();
		System.out.println("Introduzca el apellido del contacto, por favor");
		String apellidoContacto = kb.nextLine();
		System.out.println("Introduzca el telefono, porfavor");
		String telefono = kb.nextLine();
		System.out.println("Introduzca el fax, por favor");
		String fax = kb.nextLine();
		System.out.println("Introduzca la direccion principal , por favor");
		String direccion1 = kb.nextLine();
		System.out.println("Introduzca la direccion secundario, porfavor ");
		String direccion2 = kb.nextLine();
		System.out.println("Introduzca la ciudad, por favor");
		String ciudad = kb.nextLine();
		System.out.println("Introduzca la region, por favor");
		String region = kb.nextLine();
		System.out.println("Introduzca el pais, por favor");
		String pais = kb.nextLine();
		System.out.println("Intrduce el codigo postal , por favor");
		String codPostal = kb.nextLine();
		System.out.println("Introduzca el codigo del empleado, por favor");
		int codEmple = kb.nextInt();
		System.out.println("Introduzca un limite de credito, por favor");
		Long limite = kb.nextLong();

		return new Cliente(cod, nombreCliente, nombreContacto, apellidoContacto, telefono, fax, direccion1,
				direccion2, ciudad, region, pais, codPostal, codEmple, limite);

	}

}
