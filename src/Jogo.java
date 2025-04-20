import java.util.Scanner;

public class Jogo {
    private Heroi heroi;
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        System.out.println(" Bem-vindo ao RPG da PROGRAMACAO! ");
        System.out.print("Digite o nome do seu herói PROGRAMEIRO: ");
        String nome = scanner.nextLine();
        heroi = new Heroi(nome);

        System.out.println("\nSua jornada para salvar o MUNDO DA TI começa agora!");

        for (int i = 0; i < 3; i++) {
            Vilao vilao = FabricaVilao.criarVilao(heroi.getNivel());
            System.out.println("\n⚔️ Um novo vilão apareceu: " + vilao.getNome());
            while (vilao.estaVivo() && heroi.estaVivo()) {
                System.out.println("\n" + heroi.getStatus());
                System.out.println(vilao.getStatus());

                System.out.println("1. Atacar");
                System.out.println("2. Descansar (+5 vida)");
                System.out.print("Escolha sua ação: ");
                int escolha = scanner.nextInt();

                if (escolha == 1) {
                    heroi.atacar(vilao);
                } else {
                    heroi.curar(5);
                    System.out.println(heroi.getNome() + " descansou e recuperou 5 de vida.");
                }

                if (vilao.estaVivo()) {
                    vilao.atacar(heroi);
                }
            }

            if (!heroi.estaVivo()) {
                System.out.println("\n Você foi derrotado! Fim de jogo.");
                return;
            } else {
                System.out.println("\n Vitória! Você derrotou " + vilao.getNome());
                heroi.subirNivel();
                System.out.println(" Subiu para o nível " + heroi.getNivel());
            }
        }

        System.out.println("\n Parabéns, " + heroi.getNome() + "! VOCÊ SALVOU A TECNOLOGIA PARCEIRO!");
    }
}