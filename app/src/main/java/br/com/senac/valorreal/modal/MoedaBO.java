package br.com.senac.valorreal.modal;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MoedaBO {

    public static MoedaComparada converterDTO(MoedaDTO dto) {
        DecimalFormat format = new DecimalFormat("#,###.###");
        MoedaComparada mc = new MoedaComparada();

        Moeda usd = new Moeda();
        usd.setNome(dto.getResults().getCurrencies().getUSD().getName());
        usd.setCompra(String.valueOf(dto.getResults().getCurrencies().getUSD().getBuy()));
        usd.setVenda(String.valueOf(dto.getResults().getCurrencies().getUSD().getSell()));
        usd.setVariacao(String.valueOf(dto.getResults().getCurrencies().getUSD().getVariation()));

        Moeda btc = new Moeda();
        btc.setNome(dto.getResults().getCurrencies().getBTC().getName());
        btc.setCompra(format.format(dto.getResults().getCurrencies().getBTC().getBuy()));
        btc.setVenda(format.format(dto.getResults().getCurrencies().getBTC().getSell()));
        btc.setVariacao(format.format(dto.getResults().getCurrencies().getBTC().getVariation()));

        Moeda ars = new Moeda();
        ars.setNome(dto.getResults().getCurrencies().getARS().getName());
        ars.setCompra(String.valueOf(dto.getResults().getCurrencies().getARS().getBuy()));
        ars.setVenda(String.valueOf(dto.getResults().getCurrencies().getARS().getSell()));
        ars.setVariacao(String.valueOf(dto.getResults().getCurrencies().getARS().getVariation()));

        Moeda eur = new Moeda();
        eur.setNome(dto.getResults().getCurrencies().getEUR().getName());
        eur.setCompra(String.valueOf(dto.getResults().getCurrencies().getEUR().getBuy()));
        eur.setVenda(String.valueOf(dto.getResults().getCurrencies().getEUR().getSell()));
        eur.setVariacao(String.valueOf(dto.getResults().getCurrencies().getEUR().getVariation()));

        Moeda gbp = new Moeda();
        gbp.setNome(dto.getResults().getCurrencies().getGBP().getName());
        gbp.setCompra(String.valueOf(dto.getResults().getCurrencies().getGBP().getBuy()));
        gbp.setVenda(String.valueOf(dto.getResults().getCurrencies().getGBP().getSell()));
        gbp.setVariacao(String.valueOf(dto.getResults().getCurrencies().getGBP().getVariation()));

        mc.getMoedas().add(gbp);
        mc.getMoedas().add(ars);
        mc.getMoedas().add(usd);
        mc.getMoedas().add(eur);
        mc.getMoedas().add(btc);
        return mc;
    }
}
