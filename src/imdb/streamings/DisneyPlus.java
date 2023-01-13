package imdb.streamings;

public class DisneyPlus extends Streaming{
    public DisneyPlus(){
        inserecategorias();
    }

    private void inserecategorias() {
        categorias.adiciona(Categoria.PARA_MARATONAR_FINAL_SEMANA, Categoria.STAR_WARS, Categoria.MARVEL,
                Categoria.DISNEY, Categoria.PIXAR, Categoria.DISCOVERY);
    }

    @Override
    public StreamingID getId() {
        return StreamingID.DISNEY_PLUS;
    }
}
