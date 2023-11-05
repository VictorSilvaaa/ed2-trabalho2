public class Main{
    public static void main(String[] args) {
        int size =4;
        Multimapa<Integer> multimapa = new Multimapa<Integer>(size);

        // Inserindo valores no multimapa
        multimapa.put(0, 1);
        multimapa.put(0, 2);
        multimapa.put(0, 3);

        multimapa.put(1, 1);
        multimapa.put(1, 2);

        multimapa.put(2, 1);
        for (int i=0; i<size; i++){
            ListaEncadeada<Integer> values = multimapa.findAll(i);
            values.imprimir();
        }
    }
}
