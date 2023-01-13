package imdb.streamings;

import imdb.util.Lista;

public abstract class Streaming {
    protected Lista<Categoria> categorias;

    public Streaming() {
        categorias = new Lista<>();
    }

    public Lista<Categoria> getCategorias() {
        return categorias;
    }

    public Categoria getCategoria(int posicao) {
        return categorias.busca(posicao);
    }

    public abstract StreamingID getId();
}
