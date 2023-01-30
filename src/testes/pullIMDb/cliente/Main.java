package testes.pullIMDb.cliente;

import testes.pullIMDb.ServIMDb.PesquisaProd;
import testes.pullIMDb.prodAudioVisual.ProdAudioVisual;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Informe o nome da produção: ");
        String titulo = new Scanner(System.in).nextLine();
        ProdAudioVisual prodAudioVisual = PesquisaProd.buscaAudioVisualPelo(titulo);

        System.out.println("Ano de lançamento: " + prodAudioVisual.getYear());
        System.out.println("Tempo de tela: " + prodAudioVisual.getRuntime());
        System.out.println("Tipo de produção: " + prodAudioVisual.getType());
    }
}
