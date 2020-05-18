package exercicio9.eng2020_1_a09.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Previsao implements Serializable {
	private static final long serialVersionUID = 1L;	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;	
	public String diaDaSemana;
	public String dataHora;
	public Double temperaturaMin;
	public Double temperaturaMax;
	public Double umidadeRelAr;
	public LocalDateTime localDateTime;
	public String descricao;
	public double latitude;
	public double longitude;
	
	public String getDiaDaSemana() {
		return diaDaSemana;
	}
	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}
	
	public String getDataHora() {
		return dataHora;
	}
	
	public void setDiaDaSeman(String dataHora) {
		this.dataHora = dataHora;
	}
	
	
	
	
	public Double getTemperaturaMin() {
		return temperaturaMin;
	}
	public void setTemperaturaMin(Double temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}
	public Double getTemperaturaMax() {
		return temperaturaMax;
	}
	public void setTemperaturaMax(Double temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}
	public Double getUmidadeRelAr() {
		return umidadeRelAr;
	}
	public void setUmidadeRelAr(Double umidadeRelAr) {
		this.umidadeRelAr = umidadeRelAr;
	}
	public String getTexto() {
		return descricao;
	}
	public void setTexto(String texto) {
		this.descricao = texto;
	}	

}