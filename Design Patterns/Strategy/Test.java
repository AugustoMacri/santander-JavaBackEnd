public class Test {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
    }
}
