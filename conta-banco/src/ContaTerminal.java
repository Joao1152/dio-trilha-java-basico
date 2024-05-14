import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bem vindo ao Sistema de Banco!");
        System.out.println("qual é o seu primeiro nome?");
        String nome = scanner.next();
        System.out.println(nome + ", qual é o seu sobrenome?");
        String sobrenome = scanner.next();
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println(nomeCompleto + ", digite o numero da conta:");
        int numero = scanner.nextInt();
        System.out.println(nomeCompleto +  ", digite a sua agencia");
        int agencia = scanner.nextInt();
        System.out.println(nomeCompleto +   ", qual é o seu saldo?");
        double saldo = scanner.nextDouble(); 

        System.out.println("Olá " + nomeCompleto +   ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta:" + numero + " e seu saldo: R$ " + saldo + " já disponivel para saque.");
    }
}
