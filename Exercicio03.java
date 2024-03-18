public class Exercicio03 {

    public static void executar(){

        Prompt.imprimir("Digite o tamanho desejado do vetor: ");
        int tamanho = Prompt.lerInteiro();
        int[] vetor = new int[tamanho];
        
        Prompt.imprimir("Digite os números que vão compor o vetor: ");
        for(int i = 0; i < vetor.length; i++){
            Prompt.imprimir("Número " + (i + 1) + ": ");
            vetor[i] = Prompt.lerInteiro();
        }
        
        int[] vetor2 = new int[tamanho];
        for(int i = 0; i < tamanho; i++){
            vetor2[i] = vetor[i] * 2;
        }
        
        Prompt.imprimir("Os valores dobrados do primeiro vetor são: ");
        for(int i = 0; i < tamanho; i++){
            Prompt.imprimir(vetor2[i] + " ");
        }
    }
}
