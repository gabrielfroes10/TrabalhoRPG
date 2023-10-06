import java.util.ArrayList;
import java.util.List;

public class Missao {

    public String titulo;
    public String descricao;
    public List<Item> recompensas;
    public String objetivos;

    public Missao(String titulo, String descricao, List<Item> recompensas, String objetivos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.recompensas = new ArrayList<>();
        this.objetivos = objetivos;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Item> getRecompensas() {
        return recompensas;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void iniciar(Personagem personagem){
        System.out.println("A Missão "+ this.titulo + " por "+ personagem.getNome());
    }

    public void completar(Personagem personagem) {
        System.out.println("A Missão " + this.titulo + " foi completada por " + personagem.getNome());
        for (Item item : recompensas) {
            personagem.pegarItem(item);
        }
    }


}
