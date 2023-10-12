package estudos.gof.strategy;

public class Robo {
    private Comportamento comportamento;

    public void setComportametno (Comportamento comportamento) {
        this.comportamento=comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
