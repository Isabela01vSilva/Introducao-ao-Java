import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaAvaliacao = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Qual é sua avaliação ou -1 para encerrar");
            nota = leitura.nextDouble();

            if(nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }

        }

        System.out.println("Média de avaliações é " + mediaAvaliacao / totalDeNotas);

    }
}
