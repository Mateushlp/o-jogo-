// Jogo.javapublic class Jogo {
    public static void main(String[] args) {
        FabricaPersonagem fabricaGuerreiro = new FabricaGuerreiro();
        FabricaPersonagem fabricaMago = new FabricaMago();

        Personagem guerreiro = fabricaGuerreiro.criarPersonagem();
        Personagem mago = fabricaMago.criarPersonagem();

        guerreiro.habilidadeEspecial(); // Saída: Guerreiro usa habilidade especial: Ataque Poderoso!
        mago.habilidadeEspecial();      // Saída: Mago usa habilidade especial: Bola de Fogo!
    }
}
