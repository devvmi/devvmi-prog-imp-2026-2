import java.util.Scanner;

public class Fatorial{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int numero = sc.nextInt();

        int fatorial = 1;
        int atual = numero;

        while (atual > 0){
            fatorial = fatorial * atual;
            atual-=1;
        }

        System.out.print("Fatorial = " + fatorial);

        sc.close();
    }
}