package br.usjt.exer01.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PrevisaoTempo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long codigo;

	@OneToOne
	@JoinColumn (name = "diasemana")
	private Dia diaSemana;

	private double temperatura_minima;
	private double temperatura_maxima;
	private double humidade;
	private String descricao;
	private String latitude;
	private String longitude;
	private String data_hora;

	public Dia getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(Dia diaSemana) {
		this.diaSemana = diaSemana;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final PrevisaoTempo other = (PrevisaoTempo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
