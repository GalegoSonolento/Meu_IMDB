package testes.pullApi.servCep;

import testes.pullApi.endereco.Endereco;

public class ServDeCEP {
    private static String webService = "http://viacep.com.br/ws";
    private static int codigoSucesso = 200;

    public static Endereco buscaEnderecoPelo(String CEP) throws Exception{
        String urlChamada = webService + CEP + "/json";

//        try{
//
//        } catch (Exception e){
//            throw new Exception("ERRO" + e.getMessage());
//        }
        return new Endereco();
    }

}
