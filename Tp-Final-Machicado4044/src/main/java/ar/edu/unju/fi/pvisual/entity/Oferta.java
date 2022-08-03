package ar.edu.unju.fi.pvisual.entity;

public class Oferta {
	private Long idOferta;
	private Integer cantVacantes;
	private String tipoPuesto;
	private Boolean dispHoraria;
	private String tareas;
	private String contacto;
	private String Jornada;
	private String requisitos;
	private Double Salario;
	private String beneficios;
	private Boolean disponible;
	
	
	//CONSTRUCTORES, GUETTERS Y SETTERS
	public Oferta() {
	}
	
	public Oferta(Long idOferta, Integer cantVacantes, String tipoPuesto, Boolean dispHoraria, String tareas,
			String contacto, String jornada, String requisitos, Double salario, String beneficios, Boolean disponible) {
		this.idOferta = idOferta;
		this.cantVacantes = cantVacantes;
		this.tipoPuesto = tipoPuesto;
		this.dispHoraria = dispHoraria;
		this.tareas = tareas;
		this.contacto = contacto;
		Jornada = jornada;
		this.requisitos = requisitos;
		Salario = salario;
		this.beneficios = beneficios;
		this.disponible = disponible;
	}
	
	public Long getIdOferta() {
		return idOferta;
	}
	public void setIdOferta(Long idOferta) {
		this.idOferta = idOferta;
	}
	public Integer getCantVacantes() {
		return cantVacantes;
	}
	public void setCantVacantes(Integer cantVacantes) {
		this.cantVacantes = cantVacantes;
	}
	public String getTipoPuesto() {
		return tipoPuesto;
	}
	public void setTipoPuesto(String tipoPuesto) {
		this.tipoPuesto = tipoPuesto;
	}
	public Boolean getDispHoraria() {
		return dispHoraria;
	}
	public void setDispHoraria(Boolean dispHoraria) {
		this.dispHoraria = dispHoraria;
	}
	public String getTareas() {
		return tareas;
	}
	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public String getJornada() {
		return Jornada;
	}
	public void setJornada(String jornada) {
		Jornada = jornada;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	public Double getSalario() {
		return Salario;
	}
	public void setSalario(Double salario) {
		Salario = salario;
	}
	public String getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	public Boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}	
}
