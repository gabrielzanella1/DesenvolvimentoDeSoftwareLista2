public class Exercicio02 {

    public static void executar(){

        Prompt.imprimir("Digite o tamanho desejado do vetor: ");
        int tamanho = Prompt.lerInteiro();
        int[] vetor = new int[tamanho];

        Prompt.imprimir("Digite os números que vão compor o vetor: ");
        for(int i = 0; i < vetor.length; i++){
            Prompt.imprimir("Número " + (i + 1) + ": ");
            vetor[i] = Prompt.lerInteiro();
        }

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > 0){
                Prompt.imprimir("---> Numero " + vetor[i] + " na posição " + i + " é positivo.");
            }else if (vetor[i] < 0){
                Prompt.imprimir("---> Numero " + vetor[i] + " na posição " + i + " é negativo.");
            }else {
                Prompt.imprimir("---> Numero " + vetor[i] + " na posição " + i + " é zero.");
            }
        }
    }
}
