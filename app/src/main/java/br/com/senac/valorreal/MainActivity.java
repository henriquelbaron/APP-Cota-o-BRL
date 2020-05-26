package br.com.senac.valorreal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.StrictMode;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.senac.valorreal.api.HGBrasilService;
import br.com.senac.valorreal.modal.Moeda;
import br.com.senac.valorreal.modal.MoedaBO;
import br.com.senac.valorreal.modal.MoedaComparada;
import br.com.senac.valorreal.modal.MoedaDTO;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private MoedaAdpter moedaAdapter;
    private List<Moeda> moedas;

    final Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            callback(msg.obj);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Gson gson = new Gson();
                    MoedaDTO dto = gson.fromJson(HGBrasilService.getCurrencies(), MoedaDTO.class);
                    Message message = new Message();
                    MoedaComparada mc = MoedaBO.converterDTO(dto);
                    message.obj = mc.getMoedas();
                    handler.sendMessage(message);
                } catch (IOException | JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();

    }

    public void callback(Object res) {
        moedas = (List<Moeda>) res;
        moedaAdapter = new MoedaAdpter(this, moedas);
        listView.setAdapter(moedaAdapter);
    }

}
