public class Terreno implements Propriedade{
    private String nome;
    private String numero;
    private String complemento;

    public Terreno(String nome, String numero, String complemento) {
        this.nome = nome;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirTerreno(this);
    }

}
