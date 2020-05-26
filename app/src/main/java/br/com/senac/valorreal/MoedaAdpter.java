package br.com.senac.valorreal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import br.com.senac.valorreal.modal.Moeda;

public class MoedaAdpter extends BaseAdapter {
    private Context context;
    private List<Moeda> arrayList;
    private TextView nome, compra, venda, variacao;

    public MoedaAdpter(Context context, List<Moeda> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.row, parent, false);
        nome = convertView.findViewById(R.id.nome);
        compra = convertView.findViewById(R.id.compra);
        venda = convertView.findViewById(R.id.venda);
        variacao = convertView.findViewById(R.id.variacao);
        nome.setText(arrayList.get(position).getNome());
        compra.setText(arrayList.get(position).getCompra());
        venda.setText(arrayList.get(position).getVenda());
        variacao.setText(arrayList.get(position).getVariacao());
        return convertView;
    }
}
