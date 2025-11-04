import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacoes = 0;
        double nota = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite a nota da avaliação para o filme " + i + ":");
            nota = leitura.nextDouble();
            mediaAvaliacoes += nota;
        }

        System.out.println("A média das avaliações é: " + (mediaAvaliacoes / 3));
    }
}
