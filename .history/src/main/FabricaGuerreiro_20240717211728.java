
public class FabricaGuerreiro implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem() {
        return new Guerreiro();
    }
}
