package testes.pullIMDb.ServIMDb;

import com.google.gson.Gson;
import testes.pullIMDb.Util;
import testes.pullIMDb.prodAudioVisual.ProdAudioVisual;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PesquisaProd {
    private static String webService = "https://www.omdbapi.com/?t=";
    private static int codigoSucesso = 200;
    private static String key = "&apikey=223b6110";

    public static ProdAudioVisual buscaAudioVisualPelo(String titulo) throws Exception {
        String urlParaChamada = webService + titulo + key;

        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code: " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonFilmeString = Util.converteJsonEmString(resposta);

            System.out.println(jsonFilmeString);

            Gson gson = new Gson();
            ProdAudioVisual prodAudioVisual = gson.fromJson(jsonFilmeString, ProdAudioVisual.class);

            return prodAudioVisual;
        } catch (Exception e){
            throw new Exception("ERRO " + e);
        }
    }
}
