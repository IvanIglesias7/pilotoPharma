package pilotoPharma.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class producto {

	private String md_uuid;
	private LocalDate md_fch;
	private int id_producto;
	private String cod_producto;
	private String nombre_producto;
	private String tipo_producto_origen;
	private String tipo_producto_clase;
	private String des_producto;
	private LocalDateTime fch_alta_producto;
	private LocalDateTime fch_baja_producto;
	
	
	//Constructor con todas las propiedades
	public producto(String md_uuid, LocalDate md_fch, int id_producto, String cod_producto, String nombre_producto,
			String tipo_producto_origen, String tipo_producto_clase, String des_producto,
			LocalDateTime fch_alta_producto, LocalDateTime fch_baja_producto) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.id_producto = id_producto;
		this.cod_producto = cod_producto;
		this.nombre_producto = nombre_producto;
		this.tipo_producto_origen = tipo_producto_origen;
		this.tipo_producto_clase = tipo_producto_clase;
		this.des_producto = des_producto;
		this.fch_alta_producto = fch_alta_producto;
		this.fch_baja_producto = fch_baja_producto;
	}
	
	
	
	public String getMd_uuid() {
		return md_uuid;
	}
	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}
	public LocalDate getMd_fch() {
		return md_fch;
	}
	public void setMd_fch(LocalDate md_fch) {
		this.md_fch = md_fch;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getCod_producto() {
		return cod_producto;
	}
	public void setCod_producto(String cod_producto) {
		this.cod_producto = cod_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public String getTipo_producto_origen() {
		return tipo_producto_origen;
	}
	public void setTipo_producto_origen(String tipo_producto_origen) {
		this.tipo_producto_origen = tipo_producto_origen;
	}
	public String getTipo_producto_clase() {
		return tipo_producto_clase;
	}
	public void setTipo_producto_clase(String tipo_producto_clase) {
		this.tipo_producto_clase = tipo_producto_clase;
	}
	public String getDes_producto() {
		return des_producto;
	}
	public void setDes_producto(String des_producto) {
		this.des_producto = des_producto;
	}
	public LocalDateTime getFch_alta_producto() {
		return fch_alta_producto;
	}
	public void setFch_alta_producto(LocalDateTime fch_alta_producto) {
		this.fch_alta_producto = fch_alta_producto;
	}
	public LocalDateTime getFch_baja_producto() {
		return fch_baja_producto;
	}
	public void setFch_baja_producto(LocalDateTime fch_baja_producto) {
		this.fch_baja_producto = fch_baja_producto;
	}
	
	
}
