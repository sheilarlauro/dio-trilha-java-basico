import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.print("Digite o nome do Cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo "+ saldo + " já está disponível para saque.");

    }
    }
