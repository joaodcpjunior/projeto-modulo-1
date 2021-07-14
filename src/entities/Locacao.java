package entities;

import java.time.LocalDate;

public abstract class Locacao {
    
    private double custoDiario;

    //construtores
    public Locacao() {
    }

    public Locacao(String dataLocacao, String dataDevolucao, double custoDiario) {
        this.custoDiario = custoDiario;
    }

    public Locacao(String dataLocacao, String dataDevolucao, int idReserva, Double custoDiario) {
        this.custoDiario = custoDiario;
    }

    //getters e setters
    public double getCustoDiario() {
        return this.custoDiario;
    }

    public void setCustoDiario(double custoDiario) {
        this.custoDiario = custoDiario;
    }

    //metodos especificos
    abstract public double calcularCustoTotal(LocalDate startDate, LocalDate endDate);
}