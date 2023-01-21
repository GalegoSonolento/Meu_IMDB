package testes;

import imdb.acoes.Catalogo;
import imdb.produtos.Filme;
import imdb.produtos.Genero;
import imdb.produtos.ProdutoAudioVisual;
import imdb.produtos.Serie;
import imdb.produtos.Tipo;
import imdb.streamings.AmazonPrime;
import imdb.streamings.Netflix;
import imdb.streamings.Streaming;
import imdb.util.Lista;


public class CatalogoTeste {
    public static void main(String[] args){
        Streaming netflix = new Netflix();
        Streaming amazon = new AmazonPrime();

        ProdutoAudioVisual titanic = new Filme(1, "Titanic", 1997, Genero.DRAMA,
                "James Cameron", 180, "Leonardo DiCaprio", "Kate Winslet");
        ProdutoAudioVisual gladiador = new Filme(2, "Gladiador", 2000, Genero.ACAO,
                "Ridley Scott", 160, "Russell Crowe", "Joaquin Phoenix", "Richard Harris");

        Lista<Catalogo> meuCatalogo = new Lista<>();
        meuCatalogo.adiciona(new Catalogo(titanic, netflix,
                netflix.getCategoria(3), netflix.getCategoria(4)));
        meuCatalogo.adiciona(new Catalogo(gladiador, netflix, netflix.getCategoria(5)));

        meuCatalogo.adiciona(new Catalogo(titanic, amazon, amazon.getCategoria(5)));

        mostraCatalogo(meuCatalogo);
    }

    private static void mostraCatalogo(Lista<Catalogo> meuCatalogo) {
        for (int indx = 0; indx < meuCatalogo.totalElementos(); indx++) {
            Catalogo catalogo = meuCatalogo.busca(indx);
            mostraProduto(catalogo);
            mostraStreaming(catalogo);
        }
    }

    private static void mostraProduto(Catalogo catalogo) {
        System.out.println("\n\nTitulo: " + catalogo.getProduto().getTitulo());
        System.out.println("Ano: " + catalogo.getProduto().getAno());
        System.out.println("Diretor: " + catalogo.getProduto().getDiretor());
        System.out.println("Genero: " + catalogo.getProduto().getGenero());
        System.out.println("Tipo: " + catalogo.getProduto().getTipo());
        mostraDetalhesTipo(catalogo);
        mostraAtores(catalogo.getProduto().getAtores());
    }

    private static void mostraDetalhesTipo(Catalogo catalogo) {
        if (catalogo.getProduto().getTipo().equals(Tipo.FILME)) {
            Filme filme = (Filme) catalogo.getProduto();
            System.out.println("Duracao: " + filme.getDuracao());
        }
        else {
            Serie serie = (Serie) catalogo.getProduto();
            System.out.println("Temporadas: " + serie.getTemporadas());
        }
    }

    private static void mostraAtores(Lista<String> atores) {
        System.out.println("Principais atores: ");
        for (int indx = 0; indx < atores.totalElementos(); indx++)
            System.out.println("\t" + atores.busca(indx));
    }

    private static void mostraStreaming(Catalogo catalogo) {
        System.out.println("Streaming: " + catalogo.getStreaming().getId());
        System.out.println("Categorias: ");
        for (int indx = 0; indx < catalogo.getCategorias().totalElementos(); indx++)
            System.out.println("\t" + catalogo.getCategorias().busca(indx));
    }
}
