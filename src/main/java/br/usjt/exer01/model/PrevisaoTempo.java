package br.usjt.exer01.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PrevisaoTempo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long codigo;
	
	private String diaSemana;
	private double temperatura_minima;
	private double temperatura_maxima;
	private double humidade;
	private String descricao;
	private String latitude;
	private String longitude;
	private String data_hora;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public double getHumidade() {
		return humidade;
	}
	public void setHumidade(double humidade) {
		this.humidade = humidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public double getTemperatura_minima() {
		return temperatura_minima;
	}
	public void setTemperatura_minima(double temperatura_minima) {
		this.temperatura_minima = temperatura_minima;
	}
	public double getTemperatura_maxima() {
		return temperatura_maxima;
	}
	public void setTemperatura_maxima(double temperatura_maxima) {
		this.temperatura_maxima = temperatura_maxima;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getData_hora() {
		return data_hora;
	}
	public void setData_hora(String data_hora) {
		this.data_hora = data_hora;
	}



}
