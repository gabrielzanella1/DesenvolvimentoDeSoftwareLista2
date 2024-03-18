public class Exercicio12 {

    public static void executar(){

        double[] vetor = new double[12];

        Prompt.imprimir("Informe os 12 numeros do vetor: ");
        for(int i = 0; i < 12; i++){
            vetor[i] = Prompt.lerDecimal();
        }

        int resultado = 1;

        for(int i = 0; i < 12; i++){
            if(vetor[i] > 0 && vetor[i] % 2 == 0){
                resultado *= vetor[i];
            }
        }

        Prompt.imprimir("Resultado: " + resultado);
    }
}
