package br.com.senac.valorreal.modal.dto;

public class USD {

    private String name;
    private float buy;
    private float sell;
    private float variation;
    // Getter Methods

    public String getName() {
        return name;
    }

    public float getBuy() {
        return buy;
    }

    public float getSell() {
        return sell;
    }

    public float getVariation() {
        return variation;
    }

    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setBuy(float buy) {
        this.buy = buy;
    }

    public void setSell(float sell) {
        this.sell = sell;
    }

    public void setVariation(float variation) {
        this.variation = variation;
    }
}

