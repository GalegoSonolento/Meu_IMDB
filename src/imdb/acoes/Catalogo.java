package imdb.acoes;

import imdb.produtos.ProdutoAudioVisual;
import imdb.streamings.Categoria;
import imdb.streamings.Streaming;
import imdb.util.Lista;

public class Catalogo {
    private ProdutoAudioVisual produto;
    private Streaming streaming;
    private Lista<Categoria> categorias;

    public Catalogo(ProdutoAudioVisual produto, Streaming streaming, Categoria...categoriasEspecificas){
        this.categorias = new Lista<>();
        setProduto(produto);
        setStreaming(streaming);
        setCategorias(categoriasEspecificas);
    }

    public ProdutoAudioVisual getProduto() {
        return produto;
    }

    public void setProduto(ProdutoAudioVisual produto) {
        this.produto = produto;
    }

    public Streaming getStreaming() {
        return streaming;
    }

    public void setStreaming(Streaming streaming) {
        this.streaming = streaming;
    }

    public Lista<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Categoria...categoriasEspecificas) {
        categorias.adiciona(categoriasEspecificas);
    }
}
