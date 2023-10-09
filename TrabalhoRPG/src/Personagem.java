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



    public Personagem(String nome) {
        this.nome = nome;
        this.nivel = 1;
        this.saude = 100;
        this.energia = 100;
        this.itens = new ArrayList<>();
        this.posicaoX = 0;
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

    public void moverPersonagem(int deltaX, int deltaY) {
        int novaPosX = posicaoX + deltaX;
        int novaPosY = posicaoY + deltaY;

        // Verificar se a nova posição está dentro dos limites aceitáveis
        if (novaPosX >= 0 && novaPosY >= 0) {
            // Atualizar a posição do personagem
            posicaoX = novaPosX;
            posicaoY = novaPosY;
            System.out.println("Personagem movido para (X = " + posicaoX + ", Y = " + posicaoY + ")");
        } else {
            System.out.println("Alerta: Você não pode sair para uma posição fora dos limites!");
        }
    }

    }












