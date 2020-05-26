package br.com.senac.valorreal.modal;

import java.util.ArrayList;
import java.util.List;

public class MoedaComparada {

    private String moeda;
    private List<Moeda> moedas;

    public MoedaComparada() {
        this.moedas = new ArrayList<>();
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public List<Moeda> getMoedas() {
        return moedas;
    }

    public void setMoedas(List<Moeda> moedas) {
        this.moedas = moedas;
    }
}
