//package imdb.produtos;
//
//import imdb.util.Lista;
//
//public abstract class ProdutoAudiovisual {
//    private int codigo;
//    private String titulo;
//    private int ano;
//    private String diretor;
//    private Tipo tipo;
//    private Lista<String> atores;
//    private Genero genero;
//
//    public ProdutoAudioVisual() {
//        atores = new Lista<>();
//    }
//
//    public ProdutoAudioVisual(int codigo, String titulo, int ano, Genero genero,
//                              String diretor, String...listaAtores) {
//        this();
//        setCodigo(codigo);
//        setTitulo(titulo);
//        setAno(ano);
//        setGenero(genero);
//        setTipo(tipo);
//        setDiretor(diretor);
//        setAtores(listaAtores);
//    }
//
//    public int getCodigo() {
//        return codigo;
//    }
//
//    public void setCodigo(int codigo) {
//        this.codigo = codigo;
//    }
//
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    public int getAno() {
//        return ano;
//    }
//
//    public void setAno(int ano) {
//        this.ano = ano;
//    }
//
//    public String getDiretor() {
//        return diretor;
//    }
//
//    public void setDiretor(String diretor) {
//        this.diretor = diretor;
//    }
//
//    public Lista<String> getAtores() {
//        return atores;
//    }
//
//    public void setAtores(String... listaAtores) {
//        atores.adiciona(listaAtores);
//    }
//
//    public Genero getGenero() {
//        return genero;
//    }
//
//    public void setGenero(Genero genero) {
//        this.genero = genero;
//    }
//
//    public Tipo getTipo() {
//        return tipo;
//    }
//
//    public void setTipo(Tipo tipo) {
//        this.tipo = tipo;
//    }
//}
//}
