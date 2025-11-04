import java.util.Scanner;

public class OutrosLoops {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacoes = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme  ou -1 para encerrar :");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacoes += nota;
                totalDeNotas++;
            }

        }

        System.out.println("A média das avaliações é: " + (mediaAvaliacoes / totalDeNotas));
    }
}
