import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            int numero;
            String agencia;
            String nomeCliente;
            double saldo;

            System.out.println("Por favor, digite o número da conta:");
            while (true) {
                try {
                    numero = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Número inválido! Por favor, digite um número válido para a conta:");
                    sc.next();
                }
            }

            System.out.println("Por favor, digite o número da agência:");
            agencia = sc.next();

            sc.nextLine();
            System.out.println("Por favor, digite o nome do cliente:");
            nomeCliente = sc.nextLine();

            System.out.println("Por favor, digite o valor do saldo:");
            while (true) {
                try {
                    saldo = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Saldo inválido! Por favor, digite um número válido para o saldo:");
                    sc.next();
                }
            }

            System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o seu saldo de " + saldo + " já está disponível para saque.");

        } catch (Exception e) {
            System.out.println("Um erro ocorreu durante a leitura dos dados.");
        }

    }
}