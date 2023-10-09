import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Missao {

    public String titulo;
    public String descricao;
    public List<Item> recompensas;
    public String objetivos;
    private int numeroDeOrcs;
    private int orcsDerrotados;
    private List<int[]> posicoesOrcs;



    public Missao(String titulo, String descricao,  String objetivos, int largura, int altura, int numeroDeOrcs) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.recompensas = new ArrayList<>();
        this.objetivos = objetivos;
        this.numeroDeOrcs = numeroDeOrcs;
        this.orcsDerrotados = 0;
        this.posicoesOrcs = new ArrayList<>();


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
    public List<int[]> getPosicoesOrcs() {
        return posicoesOrcs;
    }
    

    public void completar(Personagem personagem) {
        System.out.println("A Missão " + this.titulo + " foi completada por " + personagem.getNome());
        for (Item item : recompensas) {
            personagem.pegarItem(item);
        }
    }

}
