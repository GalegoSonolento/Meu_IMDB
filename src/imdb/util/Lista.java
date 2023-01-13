package imdb.util;

public class Lista<T> {
    private static final int MAXIMO_ELEMENTOS = 10;
    private T[] lista;
    private int numeroElementos;

    public Lista() {
        this(MAXIMO_ELEMENTOS);
    }

    @SuppressWarnings("unchecked")
    public Lista(int tamanhoLista) {
        lista = (T[]) new Object[tamanhoLista];
        numeroElementos = 0;
    }

    public boolean adiciona(@SuppressWarnings("unchecked") T... elementos) {
        if (!posicaoEhValida(numeroElementos))
            return false;
        for (T elemento : elementos) {
            lista[numeroElementos] = elemento;
            numeroElementos++;
        }
        return true;
    }

    public boolean adiciona(T elemento) {
        if (!posicaoEhValida(numeroElementos))
            return false;
        lista[numeroElementos] = elemento;
        numeroElementos++;
        return true;
    }

    public boolean adiciona(int posicao, T elemento) {
        if (!posicaoEhValida(posicao))
            return false;

        if (lista[posicao] == null)
            numeroElementos++;

        lista[posicao] = elemento;
        return true;
    }

    private boolean posicaoEhValida(int posicao) {
        return posicao >= 0 && posicao < lista.length;
    }

    public int totalElementos() {
        return numeroElementos;
    }

    public T busca(int posicao) {
        if (posicaoEhValida(posicao))
            return lista[posicao];
        return null;
    }

    public boolean existeNaLista(T elemento) {
        for (int indx = 0; indx < lista.length; indx++) {
            T e = lista[indx];
            if (e != null && e.equals(elemento))
                return true;
        }
        return false;
    }

    public T[] getElementos() {
        return lista;
    }

    public boolean remove(T elemento) {
        boolean removeu = false;
        for (int indx= 0; indx < lista.length; indx++) {
            T e = lista[indx];
            if (e != null && e.equals(elemento)) {
                lista[indx] = null;
                numeroElementos--;
                removeu = true;
                break;
            }
        }
        return removeu;
    }

    public int pesquisa(T elemento) {
        int posicao = -1;
        for (int indx = 0; indx < lista.length; indx++) {
            T e = lista[indx];
            if ( e != null && e.equals(elemento)) {
                posicao = indx;
                break;
            }
        }
        return posicao;
    }
}
