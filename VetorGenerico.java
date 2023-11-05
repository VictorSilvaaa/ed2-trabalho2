public class VetorGenerico<T> {
    private T[] array;

    public VetorGenerico(int tamanho) {
        // Usamos um array Object para criar o vetor genérico
        array = (T[]) new Object[tamanho];
    }

    public void set(int indice, T elemento) {
        array[indice] = elemento;
    }

    public T get(int indice) {
        return array[indice];
    }
    public boolean containsKey(int indice) {
        if(array[indice]!=null){
            return true;
        }
        return false;
    }
}

