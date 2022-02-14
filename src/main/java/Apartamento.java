public class Apartamento implements Propriedade{
    private String andar;
    private String bloco;

    public Apartamento(String andar, String bloco) {
        this.andar = andar;
        this.bloco = bloco;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirApartamento(this);
    }

}
