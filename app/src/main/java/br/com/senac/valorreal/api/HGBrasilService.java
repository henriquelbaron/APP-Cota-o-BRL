package br.com.senac.valorreal.api;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import br.com.senac.valorreal.modal.MoedaDTO;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HGBrasilService {

    public static String getCurrencies() throws IOException, JSONException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.hgbrasil.com/finance")
                .get()
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
