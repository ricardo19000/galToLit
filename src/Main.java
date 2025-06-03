//Página 20 - Converta galões em litros + tabela com for loop
public class Main {
    public static void main(String[] args) {
        double litros;
        int galao, contador;

        contador = 0; //Configura o contador ao valor inicial de zero
        for(galao = 1; galao <= 100; galao++) {
            litros = galao * 3.7854;
            System.out.println(galao + " Galões é igual a " + litros + " Litros");

            contador++; //Soma +1 ao contador no final do código
            if(contador == 10) {
                System.out.println(); //Imprime uma linha em branco quando o contador for igual a 10
                contador = 0; //Retorna o contador ao valor de 0
            }
        }
    }
}
