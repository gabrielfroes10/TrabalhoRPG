import java.util.ArrayList;
import java.util.List;

public class MundoVirtual {
    private char[][] mapaDoMundo;
    private List<Personagem> personagens;
    private List<Missao> missoesAtivas;
    private List<Inimigo> inimigos;

    public MundoVirtual(int largura, int altura) {
        this.mapaDoMundo = new char[largura][altura];
        this.personagens = new ArrayList<>();
        this.missoesAtivas = new ArrayList<>();
        this.inimigos = new ArrayList<>();

        for (int i = 0; i < largura; i++) {
            for (int j = 0; j < altura; j++) {
                mapaDoMundo[i][j] = '.';
            }
        }
    }

    public void gerarEncontroComInimigo(int x, int y) {
        if (x >= 0 && x < mapaDoMundo.length && y >= 0 && y < mapaDoMundo[0].length) {
            Inimigo novoInimigo = new Inimigo("Inimigo Aleatório", 10, 100);
            inimigos.add(novoInimigo);
            mapaDoMundo[x][y] = 'I';

            System.out.println("Você encontrou um inimigo em (" + x + ", " + y + ")!");
        } else {
            System.out.println("Coordenadas inválidas. Não é possível gerar um encontro com inimigo.");
        }
    }

    public char[][] getMapaDoMundo() {
        return mapaDoMundo;
    }

    public List<Inimigo> getInimigos() {
        return inimigos;
    }
    // Método para imprimir o mapa com a posição do personagem
    public  void imprimirMapa(char[][] mapa, int posicaoX, int posicaoY) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                if (i == posicaoY && j == posicaoX) {
                    System.out.print("P "); // Mostra a posição do personagem com "P"
                } else {
                    System.out.print(mapa[i][j] + " ");
                }
            }
            System.out.println();
        }
    }




}
