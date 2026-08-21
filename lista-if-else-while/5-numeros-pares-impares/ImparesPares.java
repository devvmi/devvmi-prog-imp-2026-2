import java.util.Scanner;

public class ImparesPares{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o primeiro numero: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int b = sc.nextInt();

        int menor = 0;
        int maior = 0;

        if (a < b){
            menor = a;
            maior = b;
        } else {
            menor = b;
            maior = a;
        }

        System.out.println("Numeros pares:");
        int atual = menor;
        while (atual <= maior){
            if (atual % 2 == 0){
                System.out.println(atual);
            }
            atual+=1;
        }

        System.out.println("Numeros impares:");
        atual = menor;
        while (atual <= maior){
            if (atual % 2 != 0){
                System.out.println(atual);
            }
            atual+=1;
        }

        sc.close();
    }
}