public class Exercicio09 {

    public static void executar(){

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];

        Prompt.imprimir("Digite os numeros do vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = Prompt.lerInteiro();
        }

        Prompt.imprimir("Digite os numeros do vetor B:");
        for (int i = 0; i < 5; i++) {
            vetorB[i] = Prompt.lerInteiro();
        }

        for (int i = 0; i < 5; i++) {
            vetorC[i * 2] = vetorA[i]; 
            vetorC[i * 2 + 1] = vetorB[i]; 
        }

        Prompt.imprimir("Vetor C:");
        for (int i = 0; i < 10; i++) {
            Prompt.imprimir(vetorC[i] + " ");
        }
    }
}
