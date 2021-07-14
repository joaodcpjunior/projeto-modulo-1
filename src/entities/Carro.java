package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Carro extends Locacao{

	private int id;
	private String marca;
	private String modelo;
	private double custoDiario;
	
	public Carro(int id, String marca, String modelo, double custodiario) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.custoDiario = custodiario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCustodiario() {
		return custoDiario;
	}

	public void setCustodiario(double custodiario) {
		this.custoDiario = custodiario;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCustoDiario() {
		return this.custoDiario;
	}

	public void setCustoDiario(double custoDiario) {
		this.custoDiario = custoDiario;
	}

	@Override
	public String toString() {
		return "(" + getId() + ") -> " + getModelo() + " - " + getMarca() + "; Custo da diária = " + getCustoDiario();
	}

	@Override
	public double calcularCustoTotal(LocalDate startDate, LocalDate endDate) {
		Long range = ChronoUnit.DAYS.between(startDate, endDate);
		double custoTotal = custoDiario * range;
		return custoTotal;
	}
}		
