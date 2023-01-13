package imdb.streamings;

public class AmazonPrime extends Streaming{
    public AmazonPrime() {
        insereCategorias();
    }

    private void insereCategorias() {
        categorias.adiciona(Categoria.MORRER_DE_RIR, Categoria.DE_ARREPIAR,
                Categoria.EXCLUSIVE_PRIME, Categoria.SERIAL_KILLERS, Categoria.SERIES_POLICIAIS,
                Categoria.LOVE_STORY);
    }

    @Override
    public StreamingID getId() {
        return StreamingID.AMAZON_PRIME;
    }
}
