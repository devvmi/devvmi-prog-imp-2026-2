import java.util.Scanner;

public class Imc{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite seu peso em Kilograma (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura em metros (m): ");
        double altura = sc.nextDouble();

        double imc = (peso / (altura * altura));

        System.out.printf("Seu IMC: %.2f\n", imc);

        if (imc > 0 && imc < 18.5){
            System.out.print("Você está abaixo do peso");
        } else if (imc < 24.9){
            System.out.print("Você está com um peso normal");
        } else if (imc < 29.9){
            System.out.print("Você está com sobrepeso");
        } else{
            System.out.println("Você está obeso.");
        }

        sc.close();
    }
}