import java.util.List;

public class Inimigo {

    public String nome;
    public int nivel;
    public int energia;
    public List<Habilidade> habilidadesDeCombate;
    private int posicaoX;
    private int posicaoY;

    public Inimigo(String nome, int nivel, int energia) {
        this.nome = nome;
        this.nivel = nivel;
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public List<Habilidade> getHabilidadesDeCombate() {
        return habilidadesDeCombate;
    }
    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void atacar(Personagem personagem) {
        System.out.println("Você atacou o personagem " + personagem.getNome());
        int energiaPersonagem = personagem.getEnergia();
        energiaPersonagem -= 10;
        personagem.setEnergia(energiaPersonagem);
    }
}
