import java.util.Scanner;

public class Inss{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o seu salário bruto (sem descontos): ");
        double salario = sc.nextDouble();

        if (salario <= 1621.00) {
            System.out.println("Valor da contribuição = " + (salario * 0.075));
            System.out.print("Salário com a contribuição descontada = " + (salario - (salario * 0.075)));
        } else if (salario <= 2902.84) {
            System.out.println("Valor da contribuição = " + (salario * 0.09));
            System.out.print("Salário com a contribuição descontada = " + (salario - (salario * 0.09)));
        } else if (salario <= 4354.06) {
            System.out.println("Valor da contribuição = " + (salario * 0.12));
            System.out.print("Salário com a contribuição descontada = " + (salario - (salario * 0.12)));
        } else if (salario <= 8475.55) {
            System.out.println("Valor da contribuição = " + (salario * 0.14));
            System.out.print("Salário com a contribuição descontada = " + (salario - (salario * 0.14)));
        } else {
            System.out.println("Valor da contribuição = " + (8475.55 * 0.14));
            System.out.print("Salário com a contribuição descontada = " + (salario - (8475.55 * 0.14)));
        }

        sc.close();
    }
}