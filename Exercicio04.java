public class Exercicio04 {

    public static void executar(){

        int[] numero = new int[5];

        Prompt.imprimir("Digite cinco números: ");
        for(int i = 0; i < 5; i++){
            numero[i] = Prompt.lerInteiro();
        }

        int n = Prompt.lerInteiro("Digite o valor de n: ");
        Prompt.imprimir("Indice dos elementos inferiores a " + n + " : ");
        for(int i = 0; i < 5; i++){
            if(numero[i] < n){
                Prompt.imprimir(i + " ");
            }
        }
    }
}
