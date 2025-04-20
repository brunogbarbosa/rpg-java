public class Heroi {
    private String nome;
    private int vida = 30;
    private int ataque = 5;
    private int defesa = 2;
    private int nivel = 1;

    public Heroi(String nome) {
        this.nome = nome;
    }

    public void atacar(Vilao vilao) {
        int dano = Math.max(0, this.ataque - vilao.getDefesa());
        vilao.receberDano(dano);
        System.out.println(nome + " atacou " + vilao.getNome() + " causando " + dano + " de dano.");
    }

    public void receberDano(int dano) {
        int danoReal = Math.max(0, dano - this.defesa);
        this.vida -= danoReal;
        System.out.println(nome + " recebeu " + danoReal + " de dano.");
    }

    public void curar(int quantidade) {
        this.vida += quantidade;
    }

    public void subirNivel() {
        nivel++;
        vida += 10;
        ataque += 2;
        defesa += 1;
    }

    public String getStatus() {
        return nome + " [Vida: " + vida + " | Ataque: " + ataque + " | Defesa: " + defesa + " | Nível: " + nivel + "]";
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getDefesa() {
        return defesa;
    }
}