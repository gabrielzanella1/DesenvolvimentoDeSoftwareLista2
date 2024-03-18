public class Exercicio05 {

    public static void executar(){ 

        double[] numero = new double[5];

        Prompt.imprimir("--> Digite cinco números: ");
        for(int i = 0; i < 5; i++){
            numero[i] = Prompt.lerDecimal();
        }

        double n = Prompt.lerDecimal("--> Digite o valor de n: ");

        int vezes = 0;

        for(int i = 0; i < 5; i++){
            if(numero[i] == n){
                vezes++;
            }
        }

        Prompt.imprimir("--> O numero N aparece " + vezes + " vezes no vetor.");
    }
}




