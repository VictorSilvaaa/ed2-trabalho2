public class ListaEncadeada<T> {
    private No<T> primeiro;

    //iniciando lista encadeada vazia
    public ListaEncadeada() {
        this.primeiro = null;
    }

    public void adicionar(T dado) {
        No<T> novoNo = new No<>(dado);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            No<T> atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }
    public boolean contem(T elemento) {
        No<T> atual = primeiro;
        while (atual != null) {
            if (atual.dado.equals(elemento)) {
                return true; // Elemento encontrado na lista
            }
            atual = atual.proximo;
        }
        return false; // Elemento não encontrado na lista
    }

    public void imprimir() {
        No<T> atual = primeiro;
        while (atual != null) {
            System.out.print(" -> "+atual.dado );
            atual = atual.proximo;
        }
        System.out.print(" -> null");

    }
}
