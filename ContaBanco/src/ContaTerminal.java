import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o número da agência: ");
        String agencia = sc.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite o saldo: ");
        double saldo = sc.nextDouble();
        
        System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia).concat(", conta ") + numero + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
