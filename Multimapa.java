import java.util.*;

public class Multimapa<T> {
    // Vetor genérico para armazenar as listas encadeadas
    public VetorGenerico<ListaEncadeada<T>> tabela;

    public Multimapa(int tamanho) {
        // Inicializando o vetor
        tabela = new VetorGenerico<>(tamanho);
    }

    // Método put para inserir um item com a chave k e valor v
    public void put(Integer k, T v) {
        // Verifica se a chave já existe no vetor
        if (tabela.containsKey(k)) {
            // Adiciona o valor à lista existente
            if(tabela.get(k).contem(v)){
                System.out.println("Não foi possível inserir, elemento com mesmo valor na chave " + k + ": " + v);
            }else {
                tabela.get(k).adicionar(v);
            }
        } else {
            // Cria uma nova lista encadeada e adiciona na chave k do vetor
            ListaEncadeada<T> values = new ListaEncadeada<>();
            values.adicionar(v);
            tabela.set(k, values);
        }
    }

    // Método findAll para retornar todos os valores com a chave k
    public ListaEncadeada<T> findAll(Integer k) {
        // Verifica se a chave existe no vetor
        if (tabela.containsKey(k)) {
            // Retorna a lista de valores correspondentes à chave
            return tabela.get(k);
        } else {
            // Retorna uma lista vazia se a chave não existir
            return new ListaEncadeada<>();
        }
    }
}
