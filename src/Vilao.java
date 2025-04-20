public class Vilao {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Vilao(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void atacar(Heroi heroi) {
        int dano = Math.max(0, this.ataque - heroi.getDefesa());
        heroi.receberDano(dano);
        System.out.println(nome + " atacou " + heroi.getNome() + " causando " + dano + " de dano.");
    }

    public void receberDano(int dano) {
        this.vida -= dano;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getStatus() {
        return nome + " [Vida: " + vida + "]";
    }

    public int getDefesa() {
        return defesa;
    }

    public String getNome() {
        return nome;
    }
}