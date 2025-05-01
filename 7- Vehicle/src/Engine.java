public class Engine  {

    public void startEngine(Vehicle vehicle) {
        System.out.println(" now the engine works for: " + vehicle.getClass().getSimpleName() );
    }
    public void stopEngine(Vehicle vehicle) {

        System.out.println(" now the engine stops for: " + vehicle.getClass().getSimpleName() );
    }
}
