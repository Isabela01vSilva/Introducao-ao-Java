import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numeroDigitado;
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 5;

        while (tentativas != 0) {
            System.out.println("Digite o número: ");
            numeroDigitado = leitura.nextInt();
            tentativas--;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Número aleatorio: " + numeroAleatorio + " é igual ao número " + "Número digitado: " + numeroDigitado + " Número de tentativas: " + tentativas);
                break;

            } else {
                if (numeroDigitado > numeroAleatorio) {
                    System.out.println("Número Aleatorio é menor. Você tem: " + tentativas + " tentativas");
                } else {
                    System.out.println("Númeor Aleatorio é maior. Você tem: " + tentativas + " tentativas");
                }
            }
        }
        System.out.println("Infelizmente suas chances acabaram, o número aleatorio era: " + numeroAleatorio);
    }
}