import java.util.Scanner;

public class Iprf{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        //Reutilizei um pouco da lógica do exercicío 3 (Cálculo INSS) e alterei as informações

        System.out.print("Digite o seu salário bruto (sem descontos): ");
        double salario = sc.nextDouble();

        if (salario <= 2428.80) {
            System.out.println("Valor do IR = 0.0");
            System.out.print("Salário com o IR descontado = " + salario);
        } else if (salario <= 2826.65) {
            System.out.println("Valor do IR = " + ((salario * 0.075) - 182.16));
            System.out.print("Salário com o IR descontado = " + (salario - ((salario * 0.075) - 182.16)));
        } else if (salario <= 3751.05) {
            System.out.println("Valor do IR = " + ((salario * 0.15) - 394.16));
            System.out.print("Salário com o IR descontado = " + (salario - ((salario * 0.15) - 394.16)));
        } else if (salario <= 4664.68) {
            System.out.println("Valor do IR = " + ((salario * 0.225) - 675.49));
            System.out.print("Salário com o IR descontado = " + (salario - ((salario * 0.225) - 675.49)));
        } else {
            // Acima de R$ 4.664,68 (última faixa)
            System.out.println("Valor do IR = " + ((salario * 0.275) - 908.73));
            System.out.print("Salário com o IR descontado = " + (salario - ((salario * 0.275) - 908.73)));
        }

        sc.close();
    }
}