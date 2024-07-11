public class SedanFactory implements CarFactory {
    @Override
    public Carro createCar() {
        return new Sedan();
    }
}
