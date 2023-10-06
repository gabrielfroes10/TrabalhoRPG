import java.util.ArrayList;
import java.util.List;

public class Personagem {
    public int posicaoX;

    public int posicaoY;
    public String nome;
    public int nivel;
    public int saude;
    public int energia;
    public List<Habilidade> habilidades;
    public List<Item> itens;

    public Personagem(String nome, int nivel, int saude, int energia) {
        this.nome = nome;
        this.nivel = nivel;
        this.saude = saude;
        this.energia = energia;
        this.itens = new ArrayList<>();
        this.posicaoX = 0; // Defina a posição inicial como 0
        this.posicaoY = 0;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    // Getters e Setters para a posição
    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }


    public void gastarEnergia(int custoEnergia) {
       energia -= custoEnergia;
    }

    public void atacarInimigo(Inimigo inimigo){
        System.out.println("Você atacou o inimigo "+ inimigo.getNome());
        int energiaInimigo = inimigo.getEnergia();
        energiaInimigo -= 10;
        inimigo.setEnergia(energiaInimigo);

    }

    public void pegarItem(Item item){
        System.out.println("Você pegou o item "+ item.getNome());
        itens.add(item);
    }

    public void usarHabilidade(Habilidade habilidade){
        System.out.println("Você usou a habilidade "+ habilidade.getNome());
        this.energia -= habilidade.custoEnergia;
    }

    public void usarItem(Item item){
        item.usar();
    }
    // Métodos de movimento do personagem
    public  void moverPersonagem(Personagem personagem, MundoVirtual mundo, int deltaX, int deltaY) {
        int novaPosicaoX = personagem.getPosicaoX() + deltaX;
        int novaPosicaoY = personagem.getPosicaoY() + deltaY;

        // Verifique se a nova posição está dentro dos limites do mapa
        if (novaPosicaoX >= 0 && novaPosicaoX < mundo.getMapaDoMundo().length &&
                novaPosicaoY >= 0 && novaPosicaoY < mundo.getMapaDoMundo()[0].length) {
            // Atualize a posição do personagem
            personagem.setPosicaoX(novaPosicaoX);
            personagem.setPosicaoY(novaPosicaoY);
            System.out.println("Você se moveu para (" + novaPosicaoX + ", " + novaPosicaoY + ").");
        } else {
            System.out.println("Movimento inválido. Você não pode sair do mapa.");
        }
    }
}




