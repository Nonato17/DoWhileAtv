
import java.util.Scanner;

public class DoWhile2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 254133;
        int senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextInt();

            if (senhaDigitada != senhaCorreta) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (senhaDigitada != senhaCorreta);

        System.out.println("Senha correta! Acesso concedido.");

    }
}
