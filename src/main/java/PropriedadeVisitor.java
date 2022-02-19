public class PropriedadeVisitor implements Visitor{

    public String exibir(Propriedade propriedade) {
        return propriedade.aceitar(this);
    }

    @Override
    public String exibirApartamento(Apartamento apartamento) {
        return "Apartamento{" +
                "andar=" + apartamento.getAndar() +
                ", bloco='" + apartamento.getBloco() + '\'' +
                '}';
    }

    @Override
    public String exibirCasa(Casa casa) {
        return "Casa{" +
                "numero=" + casa.getNumero() +
                ", complemento='" + casa.getComplemento() + '\'' +
                '}';
    }

    @Override
    public String exibirTerreno(Terreno terreno) {
        return "Terreno{" +
                "numero=" + terreno.getNumero() +
                ", nome='" + terreno.getNome() + '\'' +
                ", complemento=" + terreno.getComplemento() +
                '}';
    }
}
