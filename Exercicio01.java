public class Exercicio01 {

    public static void executar(){

        double[] numeros = new double[5];

        Prompt.imprimir("Digite cinco números: ");

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Prompt.lerDecimal("Número " + (i + 1) + ": ");
        }

        double soma = 0;
        for(double numero : numeros){
            soma += numero;
        }

        double media = soma / numeros.length;

        Prompt.imprimir("-----> A média é: " + media);

        Prompt.imprimir("-----> Valores menores que a média: ");
        for(double numero : numeros){
            if(numero < media){
                Prompt.imprimir(numero);
            }
        }

        Prompt.imprimir("-----> Valores iguais que a média: ");
        for(double numero : numeros){
            if(numero == media){
                Prompt.imprimir(numero);
            }
        }

        Prompt.imprimir("-----> Valores maiores que a média: ");
        for(double numero : numeros){
            if(numero > media){
                Prompt.imprimir(numero);
            }
        }

    }

}
