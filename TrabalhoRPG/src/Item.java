public class Item {

    public String nome;
    public String descricao;
    public String tipo;
    public String efeitos;

    public Item(String nome, String descricao, String tipo, String efeitos) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.efeitos = efeitos;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEfeitos() {
        return efeitos;
    }

    public void usar() {
        System.out.println("Você usou o item "+ this.nome + " e causou o efeito " + this.efeitos );
    }
}
