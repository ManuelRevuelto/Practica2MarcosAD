package ProyectoMarcos.MODEL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@Column(name = "codigo_cliente")
	private int codigoCliente;
	@Column(name = "nombre_cliente")
	private String nombreCliente;
	@Column(name = "nombre_contacto")
	private String nombreContacto;
	@Column(name = "apellido_contacto")
	private String apellidoContacto;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "fax")
	private String fax;
	@Column(name = "linea_direccion1")
	private String lineaDireccion;
	@Column(name = "linea_direccion2")
	private String lineaDireccion2;
	@Column(name = "ciudad")
	private String ciudad;
	@Column(name = "region")
	private String region;
	@Column(name = "pais")
	private String pais;
	@Column(name = "codigo_postal")
	private String codigoPostal;
	@Column(name = "codigo_empleado_rep_ventas")
	private int codigoEmpleado;
	@Column(name = "limite_credito")
	private Long limiteCredito;

	public Cliente(int codigoCliente, String nombreCliente, String nombreContacto, String apellidoContacto,
			String telefono, String fax, String lineaDireccion, String lineaDireccion2, String ciudad, String region,
			String pais, String codigoPostal, int codigoEmpleado, Long limiteCredito) {
		super();
		this.codigoCliente = codigoCliente;
		this.nombreCliente = nombreCliente;
		this.nombreContacto = nombreContacto;
		this.apellidoContacto = apellidoContacto;
		this.telefono = telefono;
		this.fax = fax;
		this.lineaDireccion = lineaDireccion;
		this.lineaDireccion2 = lineaDireccion2;
		this.ciudad = ciudad;
		this.region = region;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
		this.codigoEmpleado = codigoEmpleado;
		this.limiteCredito = limiteCredito;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getApellidoContacto() {
		return apellidoContacto;
	}

	public void setApellidoContacto(String apellidoContacto) {
		this.apellidoContacto = apellidoContacto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLineaDireccion() {
		return lineaDireccion;
	}

	public void setLineaDireccion(String lineaDireccion) {
		this.lineaDireccion = lineaDireccion;
	}

	public String getLineaDireccion2() {
		return lineaDireccion2;
	}

	public void setLineaDireccion2(String lineaDireccion2) {
		this.lineaDireccion2 = lineaDireccion2;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public Long getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Long limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", nombreCliente=" + nombreCliente + ", nombreContacto="
				+ nombreContacto + ", apellidoContacto=" + apellidoContacto + ", telefono=" + telefono + ", fax=" + fax
				+ ", lineaDireccion=" + lineaDireccion + ", lineaDireccion2=" + lineaDireccion2 + ", ciudad=" + ciudad
				+ ", region=" + region + ", pais=" + pais + ", codigoPostal=" + codigoPostal + ", codigoEmpleado="
				+ codigoEmpleado + ", limiteCredito=" + limiteCredito + "]";
	}

}
