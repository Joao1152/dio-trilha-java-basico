import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in, "UTF-8").useLocale(Locale.US);
        System.out.println("Bem vindo ao Sistema de Banco!");
        System.out.println("qual é o seu primeiro nome?");
        String nome = scanner.next();
        System.out.println(nome + ", qual é o seu sobrenome?");
        String sobrenome = scanner.next();
        System.out.println(nome + sobrenome + ", digite o numero da conta:");
        int numero = scanner.nextInt();
        System.out.println(nome + sobrenome + ", digite a sua agencia");
        int agencia = scanner.nextInt();
        System.out.println(nome + sobrenome +  ", qual é o seu saldo?");
        double saldo = scanner.nextDouble(); 

        System.out.println("Olá " + nome + sobrenome +  ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta:" + numero + " e seu saldo: " + saldo + "R$ já disponivel para saque.");
    }
}
