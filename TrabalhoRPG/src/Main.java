import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem("SeuNome", 1, 100, 100);
        MundoVirtual mundo = new MundoVirtual(10, 10);

        while (true) {
            // Imprima o mapa
            mundo.imprimirMapa(mundo.getMapaDoMundo(), personagem.getPosicaoX(), personagem.getPosicaoY());

            int opcao = Menu.mostrarMenu();

            switch (opcao) {
                case 1:
                    // Mover para cima
                    personagem.moverPersonagem(personagem, mundo, 0, -1);
                    break;
                case 2:
                    // Mover para baixo
                    personagem.moverPersonagem(personagem, mundo, 0, 1);
                    break;
                case 3:
                    // Mover para a esquerda
                    personagem.moverPersonagem(personagem, mundo, -1, 0);
                    break;
                case 4:
                    // Mover para a direita
                    personagem.moverPersonagem(personagem, mundo, 1, 0);
                    break;
                case 5:
                    // Atacar inimigo
                    // Implemente a lógica para selecionar um inimigo e chamar o método atacarInimigo do personagem.
                    break;
                case 6:
                    // Usar habilidade
                    // Implemente a lógica para selecionar uma habilidade e chamar o método usarHabilidade do personagem.
                    break;
                case 7:
                    // Usar item
                    // Implemente a lógica para selecionar um item e chamar o método usarItem do personagem.
                    break;
                case 0:
                    // Sair
                    System.out.println("Saindo do jogo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }



    // Métodos de movimento do personagem

}
