import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogoAtivo = true;

        // Inicialize o personagem e outros objetos do jogo aqui
        Personagem personagem = null;
        MundoVirtual mundo = new MundoVirtual(10, 10); // Largura e altura do mundo definidas como 10

        // Mostrar o menu inicial
        System.out.println("Bem-vindo ao Jogo de RPG!");
        System.out.println("1. Iniciar Jogo");
        System.out.println("0. Sair");

        int escolhaMenuInicial = scanner.nextInt();

        if (escolhaMenuInicial == 1) {
            // Pedir ao jogador para escolher o nome do personagem
            System.out.print("Escolha o nome do seu personagem: ");
            String nomePersonagem = scanner.next();
            personagem = new Personagem(nomePersonagem);

            // Imprimir nome e posição inicial do personagem
            System.out.println("Personagem: " + personagem.getNome());
            System.out.println("Posição Inicial: (" + personagem.getPosicaoX() + ", " + personagem.getPosicaoY() + ")");

            // Mostrar mensagem de obtenção de itens após o primeiro movimento
            System.out.println("Você encontrou uma faca e uma poção de vida!");

            // Faca: Arma que causa dano e sangramento
            Item faca = new Item("Faca", "Uma afiada faca de combate.", "Arma", "Sangramento");
            faca.setDano(20); // Faca causa o dobro de dano de um ataque normal
            personagem.pegarItem(faca);

            // Poção de Vida: Poção que restaura a vida
            Item pocaoVida = new Item("Poção de Vida", "Uma poção mágica que restaura a vida.", "Poção", "Cura");
            pocaoVida.setEfeito(50); // Poção de Vida restaura 50 de vida
            personagem.pegarItem(pocaoVida);
        } else if (escolhaMenuInicial == 0) {
            // Sair do jogo
            System.out.println("Obrigado por jogar!");
            jogoAtivo = false;
        } else {
            System.out.println("Opção inválida. O jogo será encerrado.");
            jogoAtivo = false;
        }

        // Loop principal do jogo
        while (jogoAtivo) {
            // Mostrar o menu e obter a escolha do jogador
            int escolha = Menu.mostrarMenu();

            // Implementar a lógica para as opções do menu aqui
            switch (escolha) {
                case 1:
                    // Mover para cima (implemente a lógica de movimento)
                    personagem.moverPersonagem(0, -1);
                    break;
                case 2:
                    // Mover para baixo (implemente a lógica de movimento)
                    personagem.moverPersonagem(0, 1);
                    break;
                case 3:
                    // Mover para a esquerda (implemente a lógica de movimento)
                    personagem.moverPersonagem(-1, 0);
                    break;
                case 4:
                    // Mover para a direita (implemente a lógica de movimento)
                    personagem.moverPersonagem(1, 0);
                    break;
                case 5:
                    // Usar item (implemente a lógica de uso de item)
                    break;
                case 0:
                    // Sair do jogo
                    System.out.println("Obrigado por jogar!");
                    jogoAtivo = false;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }


            System.out.println("Posição Atual: (" + personagem.getPosicaoX() + ", " + personagem.getPosicaoY() + ")");
        }

        scanner.close();
    }


    }








