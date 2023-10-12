package estudos.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("movendo de maneira agressiva...");
    }
}
