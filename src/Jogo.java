import java.util.Scanner;

public class Jogo {
    public Jogo(){

    }

    public void iniciar(Scanner s) {
        int opcao = 0;

        String tesouros[] = new String[15];

        String mapa[] = new String[tesouros.length];
        for (int i = 0; i < mapa.length; i++) {
            mapa[i] = "?";
        }

        do {
            System.out.println("\n===== ILHA DOS TESOUROS =====\n" +
                    "1 - Mostrar instruções\n" +
                    "2 - Mostrar mapa\n" +
                    "3 - Jogar\n" +
                    "4 - Mostrar status\n" +
                    "5 - Sair\n" +
                    "Escolha uma opção:");

            opcao = s.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    mostrarinstrucoes();

                    break;

                case 2:
                    mostrarmapa(mapa);

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("Jogo encerrado!");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 5);
    }

    private void mostrarinstrucoes() {
        System.out.println("Como escolher uma opção?\n" +
                "Ao escolher a opção jogar, digite um número de 1 a 15 para tentar encontrar os tesouros escondidos.\n"
                +
                "\nQuais são os tipos de tesouros?\n" +
                "Ouro, Diamante e Rubi.\n" +
                "\nQuais são os tipos de armadilhas?\n" +
                "Buraco, Cobra, Espinhos, além das posições vazias que não contém perda ou ganho de pontos.\n" +
                "\nComo funciona a pontuação?\n");
        System.out.printf(
                "%-15s %-12s %s%n" +
                        "%-15s %-12s %s%n" +
                        "%-15s %-12s %s%n" +
                        "%-15s %-12s %s%n" +
                        "%-15s %-12s %s%n" +
                        "%-15s %-12s %s%n" +
                        "%-15s %-12s %s%n" +
                        "%-15s %-12s %s%n",
                "Item encontrado", "Tipo", "Pontuação",
                "OURO", "Tesouro", "+10 pontos",
                "DIAMANTE", "Tesouro", "+20 pontos",
                "RUBI", "Tesouro", "+15 pontos",
                "BURACO", "Armadilha", "-5 pontos",
                "COBRA", "Armadilha", "-10 pontos",
                "ESPINHOS", "Armadilha", "-7 pontos",
                "VAZIO", "Nenhum", "0 pontos");
    }

    private void mostrarmapa(String mapa[]) {
        for (int i = 0; i < mapa.length; i++) {
            System.out.println("[" + (i + 1) + "] " + mapa[i]);
        }
    }
    
    private String jogar() {
        String[] tipos = {"VAZIO", "OURO", "DIAMANTE","RUBI", "BURADO", "COBRA", "ESPINHOS"};
        int posicao = (int)(Math.random() * 7);
        //System.out.println(posicao + " " + tipos[posicao]);
        return tipos[posicao];
    }

}
