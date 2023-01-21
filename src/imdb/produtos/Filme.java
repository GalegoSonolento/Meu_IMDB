package imdb.produtos;

public class Filme extends ProdutoAudioVisual {
    private int duracao;

    public Filme(int codigo, String titulo, int ano, Genero genero, String diretor, int duracao, String...listaAtores){
        super(codigo, titulo, ano, genero, diretor, listaAtores);
        setDuracao(duracao);
        setTipo(Tipo.FILME);
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
