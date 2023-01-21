package imdb.produtos;

import imdb.util.Lista;

public class Serie extends ProdutoAudioVisual{
    private int temporadas;
    private Lista<Integer> episodiosTemporada;

    public Serie(int codigo, String titulo, int ano, Genero genero, String diretor, int temporadas, String...listaAtores) {
        super(codigo, titulo, ano, genero, diretor, listaAtores);
        setTemporadas(temporadas);
        episodiosTemporada = new Lista<>(temporadas);
        setTipo(Tipo.SERIE);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public Lista<Integer> getEpisodiosTemporada() {
        return episodiosTemporada;
    }

    public void setEpisodiosPorTemporada(int temporada, int numeroEpisodios) {
        getEpisodiosTemporada().adiciona(temporada - 1, numeroEpisodios);
    }
}
