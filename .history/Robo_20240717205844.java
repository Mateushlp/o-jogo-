import one.digitalinnovation.gof.strategy.Comportamento; // Importação corrigida

public class Robo {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        if (comportamento != null) {
            comportamento.mover(); // Chama o método de instância no comportamento armazenado
        } else {
            // Trata o caso onde o comportamento não está definido
            System.out.println("Comportamento não definido.");
        }
    }
}
