import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner tScanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = tScanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = tScanner.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException e){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois){
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo numero " + i);
        }
    }
}
