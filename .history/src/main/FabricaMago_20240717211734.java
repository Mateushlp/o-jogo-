// FabricaMago.java
public class FabricaMago implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem() {
        return new Mago();
    }
}
