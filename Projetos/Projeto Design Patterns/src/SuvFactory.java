public class SuvFactory implements CarFactory {
    @Override
    public Carro createCar() {
        return new Suv();
    }
}
