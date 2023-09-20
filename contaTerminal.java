import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroConta;
        String agenciaConta;
        String nomeCliente;
        Double saldoConta = 237.48;

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = input.next();

        System.out.println("Por favor, digite o numero da conta: ");
        numeroConta = input.nextInt();

        System.out.println("Por favor, digite a agência da conta: ");
        agenciaConta = input.next();

        System.out.println("Olá" + " " + nomeCliente + ","
                + "obrigado por criar uma conta em nosso banco, sua agência é" + " " + " " + agenciaConta + "Conta: "
                + " " + numeroConta + " " + "e o seu saldo é de: R$: " + saldoConta);

    }
}
