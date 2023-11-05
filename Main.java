import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int size =10; //tamanho da tabela
        Multimapa<Integer> multimapa = new Multimapa<Integer>(size);
        // Inserindo valores no multimapa
        for (int i=0; i<size; i++){
            for (int j=0; j<i; j++){
                multimapa.put(i, j);

            }

        }
        long[] meuVetor = new long[size];
        for (int i=0; i<size; i++){

            ListaEncadeada<Integer> values = multimapa.findAll(i);
            System.out.print("tabela["+i+"]");
            long startTime = System.currentTimeMillis();
            values.imprimir();
            long endTime = System.currentTimeMillis();
            long insertionTime = endTime - startTime;
            meuVetor[i]=insertionTime;
            System.out.println();
        }
        System.out.println(Arrays.toString(meuVetor));
    }
}
