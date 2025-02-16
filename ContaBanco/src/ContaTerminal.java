import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main (String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US); // Garante que o "." seja aceito na hora de digitar o saldo

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scan.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String numeroAgencia = scan.next();

        System.out.println("Por favor, digite o nome do Cliente!");
        scan.nextLine();
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o Saldo!");
        double saldo = scan.nextDouble();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia +", conta "+ numeroConta +" e seu saldo "+ saldo +" já está disponível para saque");

        scan.close();
    }
}
