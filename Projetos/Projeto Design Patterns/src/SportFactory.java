public class SportFactory implements CarFactory {
    @Override
    public Carro createCar() {
        return new sport();
    }
}
