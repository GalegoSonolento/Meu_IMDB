package imdb.streamings;

public class Netflix extends Streaming{
    public Netflix() {
        insereCategorias();
    }

    private void insereCategorias() {
        categorias.adiciona(Categoria.MORRER_DE_RIR, Categoria.DE_ARREPIAR,
                Categoria.SO_NO_NETFLIX, Categoria.TOP_10_BRASIL, Categoria.LOVE_STORY,
                Categoria.DE_TIRAR_O_FOLEGO);
    }

    @Override
    public StreamingID getId() {
        return StreamingID.NETFLIX;
    }
}
