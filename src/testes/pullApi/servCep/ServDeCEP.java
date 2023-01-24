package testes.pullApi.servCep;

import com.google.gson.Gson;
import testes.pullApi.Util;
import testes.pullApi.endereco.Endereco;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServDeCEP {
    private static String webService = "http://viacep.com.br/ws/";
    private static int codigoSucesso = 200;

    public static Endereco buscaEnderecoPelo(String CEP) throws Exception{
        String urlChamada = webService + CEP + "/json";

        try{
            URL url = new URL(urlChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code: " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = Util.converteJsonEmString(resposta);

            Gson gson = new Gson();
            Endereco endereco = gson.fromJson(jsonEmString, Endereco.class);

            return endereco;
        } catch (Exception e){
            throw new Exception("ERRO" + e);
        }
    }

}
