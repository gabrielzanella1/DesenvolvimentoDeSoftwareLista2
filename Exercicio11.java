public class Exercicio11 {

    public static void executar(){

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        Prompt.imprimir("Informe os cinco números do primeiro vetor: ");
        for(int i = 0; i < 5; i++){
            vetorA[i] = Prompt.lerInteiro();
        }

        Prompt.imprimir("Informe os cincos números do segundo vetor: ");
        for(int i = 0; i < 5; i++){
            vetorB[i] = Prompt.lerInteiro();
        }

        int resultado = 0;

        for(int i = 0; i < 5; i++){
            resultado += (vetorA[i] * vetorB[i]);
        }

        Prompt.imprimir("O resultado é: " + resultado);
    }
}