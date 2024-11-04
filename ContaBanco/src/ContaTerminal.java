import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 672.45;

        System.out.println("Por favor, digite o número da conta:");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = scanner.nextLine();


        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco! Sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}





