import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MundoVirtual {
    private List<Personagem> personagens;
    private List<Missao> missoesAtivas;
    private List<Inimigo> inimigos;
    private int largura; // Largura máxima do mapa
    private int altura;  // Altura máxima do mapa

    public MundoVirtual(int largura, int altura) {
        this.largura = Math.min(10, largura);
        this.altura = Math.min(10, altura);
        this.personagens = new ArrayList<>();
        this.missoesAtivas = new ArrayList<>();
        this.inimigos = new ArrayList<>();
    }

    public List<Inimigo> getInimigos() {
        return inimigos;
    }

    public void iniciarMissao(Personagem personagem) {
        // Criar a Missão 1
        Missao missao1 = new Missao("Missão 1", "Derrote 3 inimigos", "Derrote 3 inimigos aleatórios no mapa", largura, altura, 3);

        // Gerar 3 inimigos aleatórios no mapa
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int x = random.nextInt(largura);
            int y = random.nextInt(altura);

            Inimigo inimigo = new Inimigo("Inimigo Aleatório", 10, 100);
            inimigo.setPosicaoX(x);
            inimigo.setPosicaoY(y);

            inimigos.add(inimigo);

            System.out.println("Inimigo " + inimigo.getNome() + " gerado em (" + x + ", " + y + ")");
        }

        // Adicionar a Missão 1 à lista de missões ativas
        missoesAtivas.add(missao1);


    }
}
