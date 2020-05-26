package br.com.senac.valorreal.modal.dto;

public class Currencies {
    private String source;
    private USD USD;
    private BTC BTC;
    private ARS ARS;
    private EUR EUR;
    private GBP GBP;

    public br.com.senac.valorreal.modal.dto.ARS getARS() {
        return ARS;
    }

    public void setARS(br.com.senac.valorreal.modal.dto.ARS ARS) {
        this.ARS = ARS;
    }

    public br.com.senac.valorreal.modal.dto.EUR getEUR() {
        return EUR;
    }

    public void setEUR(br.com.senac.valorreal.modal.dto.EUR EUR) {
        this.EUR = EUR;
    }

    public br.com.senac.valorreal.modal.dto.GBP getGBP() {
        return GBP;
    }

    public void setGBP(br.com.senac.valorreal.modal.dto.GBP GBP) {
        this.GBP = GBP;
    }

    public BTC getBTC() {
        return BTC;
    }

    public void setBTC(BTC BTC) {
        this.BTC = BTC;
    }

    public String getSource() {
        return source;
    }

    public USD getUSD() {
        return USD;
    }


    public void setSource(String source) {
        this.source = source;
    }

    public void setUSD(USD USDObject) {
        this.USD = USDObject;
    }


}
