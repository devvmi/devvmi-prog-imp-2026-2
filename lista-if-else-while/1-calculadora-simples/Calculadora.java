import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.println("SOMA: " + (a+b));
        System.out.println("SUBTRAÇÃO: " + (a-b));
        System.out.println("MULTIPLICAÇÃO: " + (a*b));

        if (b != 0) {
            System.out.print("DIVISÃO: " + (a/b));
        }

        sc.close();
    }
}