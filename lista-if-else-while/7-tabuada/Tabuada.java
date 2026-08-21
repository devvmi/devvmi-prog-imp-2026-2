import java.util.Scanner;

public class Tabuada{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int numero = sc.nextInt();
        int multiplicando = 1;

        while (multiplicando <= 10){
            System.out.println(numero + " X " + multiplicando + " = " + (numero*multiplicando));
            multiplicando+=1;
        }

        sc.close();
    }
}