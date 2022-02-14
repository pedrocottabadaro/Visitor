public class Casa implements Propriedade{
    private String numero;
    private String Complemento;

    public Casa(String numero, String complemento) {
        this.numero = numero;
        Complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCasa(this);
    }

}
