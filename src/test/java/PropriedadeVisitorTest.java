import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropriedadeVisitorTest {
    @Test
    void deveExibirApartamento() {
        Apartamento apartamento = new Apartamento("13", "2");

        PropriedadeVisitor visitor = new PropriedadeVisitor();
        assertEquals("Apartamento{andar=13, bloco='2'}", visitor.exibir(apartamento));
    }

    @Test
    void deveExibirTerreno() {
        Terreno terreno = new Terreno("Bela Vista", "Maria", "Doutorado");

        PropriedadeVisitor visitor = new PropriedadeVisitor();
        assertEquals("Terreno{numero=Maria, nome='Bela Vista', complemento=Doutorado}", visitor.exibir(terreno));
    }

    @Test
    void deveExibirCasa() {
        Casa casa = new Casa("12", "Muro azul");

        PropriedadeVisitor visitor = new PropriedadeVisitor();
        assertEquals("Casa{numero=12, complemento='Muro azul'}", visitor.exibir(casa));
    }
}